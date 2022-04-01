import { HOST } from '../../common/constants';
import 'cypress-file-upload';
import { assertMessage, gcy } from '../../common/shared';
import {
  getParsedEmailInvitationLink,
  login,
} from '../../common/apiCalls/common';
import { organizationTestData } from '../../common/apiCalls/testData/testData';

describe('Organization Invitations', () => {
  beforeEach(() => {
    login();
    organizationTestData.clean();
    organizationTestData.generate();
    visit();
  });

  it('generates invitations', () => {
    generateInvitation('MEMBER').should('contain', 'http://');

    generateInvitation('OWNER');
    generateInvitation('OWNER');
    generateInvitation('MEMBER');
    gcy('organization-invitation-item').should('have.length', 4);
    gcy('organization-invitation-item')
      .filter(':contains("MEMBER")')
      .should('have.length', 2);
    gcy('organization-invitation-item')
      .filter(':contains("OWNER")')
      .should('have.length', 2);
  });

  it('cancels invitation', () => {
    generateInvitation('MEMBER');
    generateInvitation('OWNER');

    gcy('organization-invitation-item').should('have.length', 2);
    gcy('organization-invitation-cancel-button').eq(0).click();
    gcy('organization-invitation-item').should('have.length', 1);
    gcy('organization-invitation-cancel-button').click();
    gcy('organization-invitation-item').should('not.exist');
  });

  it('owner invitation can be accepted', () => {
    testAcceptInvitation('OWNER', false);
  });

  it('member invitation can be accepted', () => {
    testAcceptInvitation('MEMBER', false);
  });

  it('owner invitation by email can be accepted', () => {
    testAcceptInvitation('OWNER', false);
  });

  it('member invitation by email can be accepted', () => {
    testAcceptInvitation('MEMBER', false);
  });

  after(() => {
    organizationTestData.clean();
  });

  const visit = () => {
    cy.visit(`${HOST}/organizations/tolgee/members`);
  };

  const generateInvitation = (roleType: 'MEMBER' | 'OWNER', email = false) => {
    let clipboard: string;
    cy.visit(`${HOST}/organizations/tolgee/members`, {
      onBeforeLoad(win) {
        if (!email) {
          cy.stub(win, 'prompt').callsFake((_, input) => {
            clipboard = input;
          });
        }
      },
    });

    cy.gcy('invite-generate-button').click();

    if (!email) {
      cy.gcy('invitation-dialog-type-link-button').click();
    }

    gcy('invitation-dialog-role-button').click();
    gcy('organization-role-select-item')
      .filter(':visible')
      .within(() => {
        cy.contains(roleType).click();
      });
    cy.gcy('invitation-dialog-input-field').type('test@invitation.com');
    cy.gcy('invitation-dialog-invite-button').click();

    if (!email) {
      return assertMessage('Invitation link copied to clipboard').then(() => {
        return clipboard;
      });
    } else {
      return assertMessage('Invitation was sent').then(() => {
        return getParsedEmailInvitationLink();
      });
    }
  };

  const testAcceptInvitation = (
    roleType: 'MEMBER' | 'OWNER',
    email: boolean
  ) => {
    generateInvitation(roleType, email).then((code) => {
      login('owner@zzzcool12.com', 'admin');
      cy.visit(code as string);

      assertMessage('Invitation successfully accepted');
      cy.visit(`${HOST}/organizations`);
      cy.gcy('global-paginated-list')
        .contains('Tolgee')
        .should('be.visible')
        .closest('li')
        .within(() => {
          cy.gcy('organization-settings-button').should(
            roleType === 'MEMBER' ? 'not.exist' : 'be.visible'
          );
        });
    });
  };
});
