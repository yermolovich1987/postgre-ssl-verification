CREATE SCHEMA IF NOT EXISTS test;

CREATE TABLE IF NOT EXISTS test.test_table
(
    id                      serial4                                            NOT NULL,
    name                    varchar(50)                                        NOT NULL,
    tenant                  varchar(50)                                        NOT NULL,

    CONSTRAINT test_pkey PRIMARY KEY (id)
);