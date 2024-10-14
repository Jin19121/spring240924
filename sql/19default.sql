USE db1;

#DEFAULT: 값을 넣지 않을 때의 기본값
CREATE TABLE my_table24
(
    col1 VARCHAR(1),
    col2 VARCHAR(1) DEFAULT 'x'
);
INSERT INTO my_table24
    (col2) VALUE ('a');
INSERT INTO my_table24
    (col1) VALUE ('a');
INSERT INTO my_table24
    (col1, col2) VALUE ('a', NULL);
SELECT *
FROM my_table24;
DESC my_table24;

CREATE TABLE my_table25
(
    col1 INT NOT NULL UNIQUE DEFAULT 0
);
DESC my_table25;

CREATE TABLE my_table26
(
    ssn     VARCHAR(10) NOT NULL UNIQUE,
    name    VARCHAR(5)  NOT NULL DEFAULT '홍길동',
    age     INT CHECK (age > 18),
    address VARCHAR(100) UNIQUE
);

INSERT INTO my_table26
    (ssn, age, address) VALUE ('950218', 27, '레미나');
SELECT *
FROM my_table26;