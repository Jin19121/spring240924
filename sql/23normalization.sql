USE db1;

#모든 레코드는 고유해야 한다.
#적어도 하나의 UNIQUE NOT NULL(primary key) column이 있어야 한다.
CREATE TABLE my_table30
(
    title  VARCHAR(20),
    author VARCHAR(20),
    price  INT
);
INSERT INTO my_table30
VALUEs ('소년이 온다', '한강', 10000),
       ('채식주의자', '한강', 20000),
       ('git', 'linus', 30000);
INSERT INTO my_table30
    VALUE ('소년이 온다', '한강', 10000);
#중복 발생 -> 고유하지 못함 -> 고유번호 지정

ALTER TABLE my_table30
    ADD COLUMN isbn VARCHAR(10) UNIQUE;
ALTER TABLE my_table30
    MODIFY COLUMN isbn VARCHAR(10) UNIQUE NOT NULL;
DROP TABLE my_table30;

CREATE TABLE my_table30
(
    isbn   VARCHAR(10),
    title  VARCHAR(20),
    author VARCHAR(20),
    price  INT
);
INSERT INTO my_table30
VALUEs (1, '소년이 온다', '한강', 10000),
       (2, '채식주의자', '한강', 20000),
       (3, 'git', 'linus', 30000),
       (4, '소년이 온다', '한강', 10000);

SELECT *
FROM my_table30;
DESC my_table30;
CREATE TABLE my_table31
(
    isbn    VARCHAR(10) PRIMARY KEY,
    title   VARCHAR(20),
    authoer VARCHAR(20),
    price   INT
);
DESC my_table31;

CREATE TABLE my_table33
(
    id      VARCHAR(10) PRIMARY KEY,
    ssn     VARCHAR(13),
    name    VARCHAR(20),
    address VARCHAR(20),
    gender  VARCHAR(20)
);

#AUTO_INCREMENT