import { FunctionComponent, useCallback } from 'react';
import Box from '@material-ui/core/Box';
import { T, useTranslate } from '@tolgee/react';
import { useSelector } from 'react-redux';
import { Redirect } from 'react-router-dom';
import { container } from 'tsyringe';

import { Validation } from 'tg.constants/GlobalValidationSchema';
import { LINKS } from 'tg.constants/links';
import { useConfig } from 'tg.hooks/useConfig';
import { SignUpActions } from 'tg.store/global/SignUpActions';
import { AppState } from 'tg.store/index';

import { Alert } from '../common/Alert';
import { TextField } from '../common/form/fields/TextField';
import { DashboardPage } from '../layout/DashboardPage';
import { SetPasswordFields } from './SetPasswordFields';
import { useGoogleReCaptcha } from 'react-google-recaptcha-v3';
import { StandardForm } from 'tg.component/common/form/StandardForm';
import { CompactView } from 'tg.component/layout/CompactView';
import LoadingButton from 'tg.component/common/form/LoadingButton';
import { Link, Typography } from '@material-ui/core';

const actions = container.resolve(SignUpActions);

export type SignUpType = {
  name: string;
  email: string;
  password: string;
  passwordRepeat?: string;
  invitationCode?: string;
};

const SignUpView: FunctionComponent = () => {
  const security = useSelector((state: AppState) => state.global.security);
  const state = useSelector((state: AppState) => state.signUp.loadables.signUp);
  const config = useConfig();
  const remoteConfig = useConfig();
  const t = useTranslate();

  const WithRecaptcha = () => {
    const { executeRecaptcha } = useGoogleReCaptcha();

    const handleReCaptchaVerify = useCallback(async () => {
      if (!executeRecaptcha) {
        throw Error('Execute recaptcha not yet available');
      }

      return await executeRecaptcha('sign_up');
    }, [executeRecaptcha]);

    return (
      <View
        onSubmit={async (v: SignUpType) => {
          const recaptchaToken = await handleReCaptchaVerify();
          actions.loadableActions.signUp.dispatch({
            ...v,
            recaptchaToken: recaptchaToken,
          });
        }}
      />
    );
  };

  const WithoutRecaptcha = () => {
    return (
      <View
        onSubmit={async (v: SignUpType) => {
          actions.loadableActions.signUp.dispatch({
            ...v,
          });
        }}
      />
    );
  };

  if (
    !remoteConfig.authentication ||
    security.allowPrivate ||
    !security.allowRegistration
  ) {
    return <Redirect to={LINKS.AFTER_LOGIN.build()} />;
  }

  const View = (props: { onSubmit: (v) => void }) => (
    <DashboardPage>
      <CompactView
        title={<T>sign_up_title</T>}
        backLink={LINKS.LOGIN.build()}
        content={
          state.loaded && config.needsEmailVerification ? (
            <Alert severity="success">
              <T>sign_up_success_needs_verification_message</T>
            </Alert>
          ) : (
            <StandardForm
              saveActionLoadable={state}
              initialValues={
                {
                  password: '',
                  passwordRepeat: '',
                  name: '',
                  email: '',
                } as SignUpType
              }
              validationSchema={Validation.SIGN_UP(t)}
              submitButtons={
                <Box display="flex" justifyContent="flex-end">
                  <LoadingButton
                    data-cy="sign-up-submit-button"
                    color="primary"
                    type="submit"
                    variant="contained"
                    loading={state.loading}
                  >
                    <T>sign_up_submit_button</T>
                  </LoadingButton>
                </Box>
              }
              onSubmit={props.onSubmit}
            >
              <TextField name="name" label={<T>sign_up_form_full_name</T>} />
              <TextField name="email" label={<T>sign_up_form_email</T>} />
              <SetPasswordFields />
              <Box mt={2} mb={3}>
                <Typography variant="body2">
                  By clicking Submit, I agree that I have read and accepted the
                  Tolgee{' '}
                  <Link href="https://tolgee.io/docs/terms_of_use">
                    Terms of Use
                  </Link>
                </Typography>
              </Box>
            </StandardForm>
          )
        }
      />
    </DashboardPage>
  );

  return config.recaptchaSiteKey ? <WithRecaptcha /> : <WithoutRecaptcha />;
};

export default SignUpView;
