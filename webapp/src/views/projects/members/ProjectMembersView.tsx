import { FunctionComponent, useState } from 'react';
import { Box, Typography, Button } from '@material-ui/core';
import { T, useTranslate } from '@tolgee/react';

import { PaginatedHateoasList } from 'tg.component/common/list/PaginatedHateoasList';
import { BaseView } from 'tg.component/layout/BaseView';
import { LINKS, PARAMS } from 'tg.constants/links';
import { translatedPermissionType } from 'tg.fixtures/translatePermissionFile';
import { useProject } from 'tg.hooks/useProject';
import { useApiQuery } from 'tg.service/http/useQueryApi';
import { ProjectLanguagesProvider } from 'tg.hooks/ProjectLanguagesProvider';
import { SimpleList } from 'tg.component/common/list/SimpleList';
import { useGlobalLoading } from 'tg.component/GlobalLoading';
import { MemberItem } from './component/MemberItem';
import { InviteDialog } from './component/InviteDialog';
import { InvitationItem } from './component/InvitationItem';

export const ProjectMembersView: FunctionComponent = () => {
  const project = useProject();

  const t = useTranslate();

  const [inviteOpen, setInviteOpen] = useState(false);
  const [search, setSearch] = useState('');
  const [page, setPage] = useState(0);
  const membersLoadable = useApiQuery({
    url: '/v2/projects/{projectId}/users',
    method: 'get',
    path: { projectId: project.id },
    query: {
      page,
      sort: ['name'],
      search,
    },
    options: {
      keepPreviousData: true,
    },
  });

  const invitationsLoadable = useApiQuery({
    url: '/v2/projects/{projectId}/invitations',
    method: 'get',
    path: { projectId: project.id },
    options: {
      keepPreviousData: true,
    },
  });

  const basePermissionText = translatedPermissionType(
    project.organizationOwnerBasePermissions!,
    true
  );

  const invitations = invitationsLoadable.data?._embedded?.invitations;

  useGlobalLoading(invitationsLoadable.isFetching);

  return (
    <BaseView
      navigation={[
        [
          project.name,
          LINKS.PROJECT_TRANSLATIONS.build({
            [PARAMS.PROJECT_ID]: project.id,
          }),
        ],
        [
          t('project_menu_members'),
          LINKS.PROJECT_PERMISSIONS.build({
            [PARAMS.PROJECT_ID]: project.id,
          }),
        ],
      ]}
      lg={9}
      md={12}
      containerMaxWidth="lg"
      loading={membersLoadable.isFetching}
      hideChildrenOnLoading={false}
    >
      {project.organizationOwnerSlug && (
        <Box mb={2}>
          <Typography component={Box} alignItems={'center'} variant={'body1'}>
            <T>project_permission_information_text_base_permission_before</T>{' '}
            {basePermissionText}
          </Typography>

          <T>project_permission_information_text_base_permission_after</T>
        </Box>
      )}
      <ProjectLanguagesProvider>
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
          title={t('project_menu_members')}
          loadable={membersLoadable}
          onPageChange={setPage}
          onSearchChange={setSearch}
          emptyPlaceholder={
            <Box m={4} display="flex" justifyContent="center">
              <Typography color="textSecondary">
                {t('global_nothing_found')}
              </Typography>
            </Box>
          }
          renderItem={(u) => <MemberItem user={u} />}
        />
      </ProjectLanguagesProvider>
    </BaseView>
  );
};
