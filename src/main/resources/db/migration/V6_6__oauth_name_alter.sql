--ALTER TABLE "authorization"
--RENAME COLUMN accessTokenExpiresAt TO access_token_expires_at;

ALTER TABLE "authorization"
RENAME COLUMN accessTokenIssuedAt TO access_token_issued_at;
