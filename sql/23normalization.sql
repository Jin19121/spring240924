USE db1;
#1NF
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

#AUTO_INCREMENT: 순차적으로 id 자동생성
CREATE TABLE my_table34
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20)
);
INSERT INTO my_table34
    (name)
VALUES ('kim'),
       ('lee'),
       ('choi');
SELECT *
FROM my_table34;

#단일값(원자성, atomic)
DROP TABLE my_table35;
CREATE TABLE my_table35
(
    id   INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30)
);
CREATE TABLE my_table36
(
    id     INT PRIMARY KEY AUTO_INCREMENT,
    t35_id INT,
    skill  VARCHAR(100)
#     PRIMARY KEY (id, skill) 묶어서 할 수도 있음
);
INSERT INTO my_table35
    (name)
VALUES ('kim'),
       ('lee'),
       ('park'),
       ('choi');
SELECT *
FROM my_table35;
SELECT *
FROM my_table36;

INSERT INTO my_table36
    (t35_id, skill)
VALUES (1, 'js'),
       (1, 'css'),
       (1, 'js'),
       (2, 'java'),
       (2, 'html'),
       (3, 'js'),
       (3, 'react'),
       (4, 'java');

#정규화로 여러 테이블이 생성되었을 때 여러 테이블을 결합(join)해서 조회
SELECT name, skill
FROM my_table35 t35
         JOIN my_table36 t36
              ON t35.id = t36.t35_id;

#foreign key
CREATE TABLE my_table37
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30)
);
CREATE TABLE my_table38
(
    t37_id INT REFERENCES my_table37 (id), #--Foreign Key 제약사
    tel    VARCHAR(30)
);

INSERT INTO my_table37
    (name)
VALUES ('kim'),
       ('lee');
SELECT *
FROM my_table37;

INSERT INTO my_table38
VALUES (1, '222-3333'),
       (1, '333-4444'),
       (2, '4444-555');
# INSERT INTO my_table38
#     VALUE (3, '999-0000'); 제약사항으로 인해 불가
SELECT *
FROM my_table38;

#2NF
#부분적 함수 종속이 없어야 함
#부분적 함수 종속: 키가 아닌 컬럼이 커컬럼 일부에 종속됨

#3NF
#이행적 종속이 없어야 함
#이행적 종속: 키가 아닌 컬럼끼리 종속
# -> 새 테이블로 분리 생성하여 해결