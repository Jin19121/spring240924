USE w3schools;

#테이블을 만들고 삭제할 때 현재 사용하고 있는 스키마(데이터베이스)를 확인할 것
#새 테이블 만들기
CREATE TABLE test_table
(
    id   INT,
    name VARCHAR(10)
);

# 새 테이블 삭제하기 (주의)
DROP TABLE test_table;

#스키마 만들기
CREATE DATABASE db1;
# CREATE SCHEMA도 가능
USE db1;

#스키마 삭제하기
DROP DATABASE db1;
# DROP SCHEMA test1;


#새 테이블 만들기
CREATE TABLE my_table1
(
    # 컬럼 나열
    #컬럼명 데이터타입
    col1 VARCHAR(3),
    col2 varchar(3),
    col3 varchar(3)
);

#table명 작성 관습
# : lower_snake_case
# : UPPER_SNAKE_CASE
# : UpperCamelCase

CREATE TABLE my_table2
(
    author          VARCHAR(10),
    number_of_title VARCHAR(20),
    id              INT
);

#my_table3 만들기
CREATE TABLE my_table3
(
    person_id  VARCHAR(100),
    last_name  VARCHAR(100),
    first_name VARCHAR(100)
);

#테이블 구조 확인
DESCRIBE my_table3;
DESC my_table3; #두개는 같은 방식