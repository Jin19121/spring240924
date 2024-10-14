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