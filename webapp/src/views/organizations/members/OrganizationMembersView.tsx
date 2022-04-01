import { FunctionComponent, useState } from 'react';
import { Box, Typography, Button } from '@material-ui/core';
import { T, useTranslate } from '@tolgee/react';

import { PaginatedHateoasList } from 'tg.component/common/list/PaginatedHateoasList';
import { useApiQuery } from 'tg.service/http/useQueryApi';

import { BaseOrganizationSettingsView } from '../BaseOrganizationSettingsView';
import { useOrganization } from '../useOrganization';
import { MemberItem } from './MemberItem';
import { SimpleList } from 'tg.component/common/list/SimpleList';
import { InviteDialog } from './InviteDialog';
import { InvitationItem } from './InvitationItem';

export const OrganizationMembersView: FunctionComponent = () => {
  const organization = useOrganization();
  const t = useTranslate();

  const [search, setSearch] = useState('');
  const [page, setPage] = useState(0);
  const [inviteOpen, setInviteOpen] = useState(false);

  const membersLoadable = useApiQuery({
    url: '/v2/organizations/{id}/users',
    method: 'get',
    path: { id: organization!.id },
    query: {
      page,
      sort: ['name'],
      size: 10,
      search,
    },
    options: {
      keepPreviousData: true,
    },
  });

  const invitationsLoadable = useApiQuery({
    url: '/v2/organizations/{organizationId}/invitations',
    method: 'get',
    path: { organizationId: organization!.id },
    options: {
      keepPreviousData: true,
    },
  });

  const invitations =
    invitationsLoadable.data?._embedded?.organizationInvitations;

  return (
    <BaseOrganizationSettingsView loading={membersLoadable.isFetching}>
      <Box
        mb={1}
        display="flex"
        justifyContent="space-between"
        alignItems="center"
      >
        <Typography variant="h6">{t('invitations_title')}</Typography>
        <Button
          color="primary"
          variant="contained"
          onClick={() => setInviteOpen(true)}
          data-cy="invite-generate-button"
        >
          {t('invitations_invite_button')}
        </Button>
      </Box>

      {!invitations && !invitationsLoadable.isLoading && (
        <Box m={4} display="flex" justifyContent="center">
          <Typography color="textSecondary">
            {t('invite_user_nothing_found')}
          </Typography>
        </Box>
      )}

      {invitations?.length && (
        <SimpleList
          data={invitations}
          renderItem={(i) => <InvitationItem invitation={i} />}
        />
      )}
      <InviteDialog onClose={() => setInviteOpen(false)} open={inviteOpen} />

      <Box mt={4} />
      <PaginatedHateoasList
        loadable={membersLoadable}
        title={<T>organization_members_view_title</T>}
        onSearchChange={setSearch}
        onPageChange={setPage}
        emptyPlaceholder={
          <Box m={4} display="flex" justifyContent="center">
            <Typography color="textSecondary">
              {t('global_nothing_found')}
            </Typography>
          </Box>
        }
        renderItem={(user) => (
          <MemberItem user={user} organizationId={organization!.id} />
        )}
      />
    </BaseOrganizationSettingsView>
  );
};
