CREATE TABLE role (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NULL
);

CREATE TABLE users (  -- Renamed from "user" to "users"
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NULL,
    email VARCHAR(255) NOT NULL UNIQUE,  -- Ensured email is unique
    hashed_password VARCHAR(255) NOT NULL,
    is_email_verified BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE token (
    id BIGSERIAL PRIMARY KEY,
    value VARCHAR(255) NOT NULL,
    user_id BIGINT NOT NULL,
    expiry_at TIMESTAMP NULL,
    CONSTRAINT fk_token_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);
