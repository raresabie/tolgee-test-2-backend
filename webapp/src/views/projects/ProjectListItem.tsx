import { Button, Chip } from '@material-ui/core';
import ListItemSecondaryAction from '@material-ui/core/ListItemSecondaryAction';
import ListItemText from '@material-ui/core/ListItemText';
import { T } from '@tolgee/react';
import { Link } from 'react-router-dom';

import { ListItemLink } from 'tg.component/common/list/ListItemLink';
import { LINKS, PARAMS } from 'tg.constants/links';
import { components } from 'tg.service/apiSchema.generated';
import { ProjectPermissionType } from 'tg.service/response.types';

const ProjectListItem = (r: components['schemas']['ProjectModel']) => {
  return (
    <ListItemLink
      key={r.id}
      to={LINKS.PROJECT_TRANSLATIONS.build({ [PARAMS.PROJECT_ID]: r.id })}
    >
      <ListItemText>
        {r.name}{' '}
        <Chip
          data-cy="project-list-owner"
          size="small"
          label={r.organizationOwnerName || r.userOwner?.name}
        />
      </ListItemText>
      {r.computedPermissions.type === ProjectPermissionType.MANAGE && (
        <ListItemSecondaryAction>
          <Button
            data-cy="project-settings-button"
            component={Link}
            size="small"
            variant="outlined"
            to={LINKS.PROJECT_EDIT.build({ [PARAMS.PROJECT_ID]: r.id })}
          >
            <T>project_settings_button</T>
          </Button>
        </ListItemSecondaryAction>
      )}
    </ListItemLink>
  );
};

export default ProjectListItem;
