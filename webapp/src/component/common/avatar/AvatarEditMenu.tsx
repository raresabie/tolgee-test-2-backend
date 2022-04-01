import { T } from '@tolgee/react';
import { Menu, MenuItem } from '@material-ui/core';
import { FC } from 'react';

export const AvatarEditMenu: FC<{
  anchorEl: Element | undefined | null;
  onClose: () => void;
  onRemove: () => void;
  onUpload: () => void;
  canRemove: boolean;
}> = ({ anchorEl, onClose, onRemove, onUpload, canRemove }) => {
  return (
    <>
      <Menu
        id="user-avatar-edit-menu"
        anchorEl={anchorEl}
        keepMounted
        open={Boolean(anchorEl)}
        onClose={onClose}
      >
        <MenuItem onClick={onUpload} data-cy="avatar-upload-button">
          <T>user-profile.upload-avatar-menu-item</T>
        </MenuItem>
        {canRemove && (
          <MenuItem onClick={onRemove} data-cy="avatar-remove-button">
            <T>user-profile.remove-avatar-menu-item</T>
          </MenuItem>
        )}
      </Menu>
    </>
  );
};
