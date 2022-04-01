import React, { ComponentProps } from 'react';
import {
  IconButton,
  InputAdornment,
  TextField,
  useTheme,
} from '@material-ui/core';
import { Search, Clear } from '@material-ui/icons';
import { T } from '@tolgee/react';
import { stopAndPrevent } from 'tg.fixtures/eventHandler';

const TranslationsSearchField = (
  props: ComponentProps<typeof TextField> & {
    value: string;
    onSearchChange: (value: string) => void;
  }
) => {
  const theme = useTheme();

  const { value, onSearchChange, ...otherProps } = props;

  return (
    <TextField
      data-cy="global-search-field"
      label={<T>standard_search_label</T>}
      InputProps={{
        startAdornment: (
          <InputAdornment position="start">
            <Search />
          </InputAdornment>
        ),
        endAdornment: Boolean(value) && (
          <InputAdornment
            position="end"
            style={{ marginRight: -5, marginLeft: 5 }}
          >
            <IconButton
              size="small"
              onClick={stopAndPrevent(() => onSearchChange(''))}
              onMouseDown={stopAndPrevent()}
              edge="start"
            >
              <Clear fontSize="small" />
            </IconButton>
          </InputAdornment>
        ),
        style: {
          paddingLeft: 12,
          fontSize: theme.typography.body2.fontSize,
          height: 40,
        },
      }}
      value={value}
      style={{ flexBasis: 200 }}
      onChange={(e) => onSearchChange(e.target.value)}
      {...otherProps}
    />
  );
};

export default TranslationsSearchField;
