DROP TABLE PERSON IF EXISTS;

CREATE TABLE PERSON  (
    id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    name VARCHAR(20),
    family VARCHAR(20)
);