USE db1;

#데이터타입:
# - 문자형
#     - 가변형
# - 숫자형
#     - 정수
#     - 실수
# - 날짜형
#     - 년월일
#     - 년월일시분초

#문자형: VARCHAR(길이)
CREATE TABLE my_table4
(
    col1 VARCHAR(2),
    col2 VARCHAR(3),
    col3 VARCHAR(4)
);

INSERT INTO my_table4
    (col1, col2, col3)
    VALUE ('a', 'b', 'c');

INSERT INTO my_table4
    (col1, col2, col3) VALUE ('abc', 'abc', 'abc');

INSERT INTO my_table4
    (col1, col2, col3)
    VALUE ('도겸', '이석민', '팀세븐틴');

SELECT *
FROM my_table4;

CREATE TABLE my_table5
(
    title  VARCHAR(300),
    author VARCHAR(100)
);

#my_table6
CREATE TABLE my_table6
(
    team   VARCHAR(10),
    name   VARCHAR(5),
    age    VARCHAR(3),
    number VARCHAR(2)
);

#숫자형
CREATE TABLE my_table7
(
    price VARCHAR(10)
);

INSERT INTO my_table7
    (price) VALUE ('1000');
INSERT INTO my_table7
    (price) VALUE (2000);
INSERT INTO my_table7
    (price) VALUE ('천원');
#VARCHAR이기 때문에 가능

#정수형 INT, INTEGER  -2147483648 to 2147483647
CREATE TABLE my_table8
(
    price INT
);
INSERT INTO my_table8
    (price) VALUE (1000);
INSERT INTO my_table8
    (price) VALUE ('2000');
INSERT INTO my_table8
    (price) VALUE ('천원');
INSERT INTO my_table8
    (price) VALUE (50.12); #잘려서 정수로 들어간다.
SELECT *
FROM my_table8;

#고정된 실수형 DEC, DECIMAL
#DEC(총 숫자 개수, 소숫점 이후 숫자 개수)
CREATE TABLE my_table9
(
    col1 DEC(3, 1),
    col2 DEC(5, 2)
);
INSERT INTO my_table9
    (col1) VALUE (31.4);
INSERT INTO my_table9
    (col1) VALUE (3.14);#잘린다
INSERT INTO my_table9
    (col2) VALUE (314.1); #--> x
INSERT INTO my_table9
    (col2) VALUE (314); # --> x

SELECT *
FROM my_table9;

CREATE TABLE my_table10
(
    price  DEC(10, 2),
    score  DEC(3, 1),
    age    INT,
    length DEC(3, 2),
    width  DEC(3, 2),
    height DEC(3, 2)
);

SELECT *
FROM my_table10;

#날짜 DATE: 년월일
#YYYY-MM-DD
CREATE TABLE my_table11
(
    col1 DATE
);
INSERT INTO my_table11
    (col1) VALUE ('2024-10-14');
INSERT INTO my_table11
    (col1) VALUE ('1000-01-01');
INSERT INTO my_table11
    (col1) VALUE ('9999-12-31');

SELECT *
FROM my_table11;

#날짜+시간 DATETIME
#'YYYY-MM-DD HH:MM:SS.ffffff'
CREATE TABLE my_table12
(
    col1 DATETIME
);

INSERT INTO my_table12
    (col1) VALUE ('2024-10-14 10:35:08.123456');
SELECT *
FROM my_table12;

CREATE TABLE my_table13
(
    col1 DATETIME(6) #밀리초까지 보고싶으면 명시
);
INSERT INTO my_table13
    (col1) VALUE ('2024-10-14 10:35:08.123456');
SELECT *
FROM my_table13;

CREATE TABLE my_table14
(
    birth_date      DATE,
    start_date_time DATETIME,
    end_date_time   DATETIME(6)
);#이거 insert가 잘 안되네?

SELECT *
FROM my_table14;

#다른 스키마에 있는 테이블 사용하기
SELECT *
FROM w3schools.Products;

USE w3schools;
SELECT *
FROM db1.my_table11;

USE db1;
CREATE TABLE my_table15
(
    col1 VARCHAR(300),
    col2 INT,
    col3 DEC(15, 2),
    col4 DATE,
    col5 DATETIME
);

SELECT *
FROM my_table15;

CREATE TABLE my_table16
(
    title     VARCHAR(300),
    price     INT,
    score     DEC(15, 2),
    published DATE,
    inserted  DATETIME
);

SELECT *
FROM my_table16;