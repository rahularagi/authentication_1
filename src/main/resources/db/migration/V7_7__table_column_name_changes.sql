ALTER TABLE client
RENAME COLUMN clientId TO client_id;
ALTER TABLE client
RENAME COLUMN clientIdIssuedAt TO client_id_issued_at;
ALTER TABLE client
RENAME COLUMN clientSecret TO client_secret;
ALTER TABLE client
RENAME COLUMN clientSecretExpiresAt TO client_secret_expires_at;
ALTER TABLE client
RENAME COLUMN clientName TO client_name;
ALTER TABLE client
RENAME COLUMN clientAuthenticationMethods TO client_authentication_methods;
ALTER TABLE client
RENAME COLUMN authorizationGrantTypes TO authorization_grant_types;
ALTER TABLE client
RENAME COLUMN redirectUris TO redirect_uris;
ALTER TABLE client
RENAME COLUMN postLogoutRedirectUris TO post_logout_redirect_uris;
--ALTER TABLE client
--RENAME COLUMN scopes TO scopes;
ALTER TABLE client
RENAME COLUMN clientSettings TO client_settings;
ALTER TABLE client
RENAME COLUMN tokenSettings TO token_settings;

ALTER TABLE "authorization"
RENAME COLUMN registeredClientId TO registered_client_id;
ALTER TABLE "authorization"
RENAME COLUMN principalName TO principal_name;
ALTER TABLE "authorization"
RENAME COLUMN authorizationGrantType TO authorization_grant_type;
ALTER TABLE "authorization"
RENAME COLUMN authorizedScopes TO authorized_scopes;
--ALTER TABLE "authorization"
--RENAME COLUMN attributes TO attributes;
--ALTER TABLE "authorization"
--RENAME COLUMN state TO state;
ALTER TABLE "authorization"
RENAME COLUMN authorizationCodeValue TO authorization_code_value;
ALTER TABLE "authorization"
RENAME COLUMN authorizationCodeIssuedAt TO authorization_code_issued_at;
ALTER TABLE "authorization"
RENAME COLUMN authorizationCodeExpiresAt TO authorization_code_expires_at;
ALTER TABLE "authorization"
RENAME COLUMN authorizationCodeMetadata TO authorization_code_metadata;
ALTER TABLE "authorization"
RENAME COLUMN accessTokenValue TO access_token_value;
--ALTER TABLE "authorization" RENAME COLUMN accessTokenIssuedAt TO access_token_issued_at;
--ALTER TABLE "authorization"
--RENAME COLUMN accessTokenExpiresAt TO access_token_expires_at;
ALTER TABLE "authorization"
RENAME COLUMN accessTokenMetadata TO access_token_metadata;
ALTER TABLE "authorization"
RENAME COLUMN accessTokenType TO access_token_type;
ALTER TABLE "authorization"
RENAME COLUMN accessTokenScopes TO access_token_scopes;
ALTER TABLE "authorization"
RENAME COLUMN refreshTokenValue TO refresh_token_value;
ALTER TABLE "authorization"
RENAME COLUMN refreshTokenIssuedAt TO refresh_token_issued_at;
ALTER TABLE "authorization"
RENAME COLUMN refreshTokenExpiresAt TO refresh_token_expires_at;
ALTER TABLE "authorization"
RENAME COLUMN refreshTokenMetadata TO refresh_token_metadata;
ALTER TABLE "authorization"
RENAME COLUMN oidcIdTokenValue TO oidc_id_token_value;
ALTER TABLE "authorization"
RENAME COLUMN oidcIdTokenIssuedAt TO oidc_id_token_issued_at;
ALTER TABLE "authorization"
RENAME COLUMN oidcIdTokenExpiresAt TO oidc_id_token_expires_at;
ALTER TABLE "authorization"
RENAME COLUMN oidcIdTokenMetadata TO oidc_id_token_metadata;
ALTER TABLE "authorization"
RENAME COLUMN oidcIdTokenClaims TO oidc_id_token_claims;
ALTER TABLE "authorization"
RENAME COLUMN userCodeValue TO user_code_value;
ALTER TABLE "authorization"
RENAME COLUMN userCodeIssuedAt TO user_code_issued_at;
ALTER TABLE "authorization"
RENAME COLUMN userCodeExpiresAt TO user_code_expires_at;
ALTER TABLE "authorization"
RENAME COLUMN userCodeMetadata TO user_code_metadata;
ALTER TABLE "authorization"
RENAME COLUMN deviceCodeValue TO device_code_value;
ALTER TABLE "authorization"
RENAME COLUMN deviceCodeIssuedAt TO device_code_issued_at;
ALTER TABLE "authorization"
RENAME COLUMN deviceCodeExpiresAt TO device_code_expires_at;
ALTER TABLE "authorization"
RENAME COLUMN deviceCodeMetadata TO device_code_metadata;

ALTER TABLE authorizationConsent
RENAME COLUMN registeredClientId TO registered_client_id;
ALTER TABLE authorizationConsent
RENAME COLUMN principalName TO principal_name;
--ALTER TABLE authorizationConsent
--RENAME COLUMN authorities TO authorities;