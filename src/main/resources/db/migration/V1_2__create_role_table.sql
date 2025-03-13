CREATE TABLE "public"."role"
(
    id BIGINT NOT NULL,
    name VARCHAR(255) NULL,
    CONSTRAINT pk_role PRIMARY KEY(id)
);

CREATE TABLE "public"."token"
(
    id BIGINT NOT NULL,
    value VARCHAR(255) NULL,
    user_id BIGINT NULL,
    expiry_at TIMESTAMP NULL,
    CONSTRAINT pk_token PRIMARY KEY(id)
);

CREATE TABLE "public"."user"
(
    id BIGINT NOT NULL,
    name VARCHAR(255) NULL,
    email VARCHAR(255) NULL,
    hashed_password VARCHAR(255) NULL,
    is_email_verified BIT(1) NOT NULL,
    CONSTRAINT pk_user PRIMARY KEY (id)
);