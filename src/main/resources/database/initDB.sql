
--DROP TABLE IF EXISTS authors;
--DROP SEQUENCE IF EXISTS authors_id_seq;

CREATE TABLE IF NOT EXISTS authors
(
    id    INTEGER PRIMARY KEY ,
    nickname  VARCHAR(200) NOT NULL ,
    name  VARCHAR(200),
    country  VARCHAR(200),
    description VARCHAR(1000)
    );

CREATE SEQUENCE authors_id_seq START WITH 4 INCREMENT BY 1;