USE db1;

CREATE TABLE my_table29
(
    name VARCHAR(2),
    age  INT
);

DESC my_table29;

#table 수정: 컬럼의 타입 혹은 제약사항 수정
#컬럼 추가
ALTER TABLE my_table29
    ADD COLUMN address VARCHAR(100) NOT NULL;

INSERT INTO my_table29
    VALUE ('s', 22, 'london');
SELECT *
FROM my_table29;
# ALTER TABLE my_table29
#     ADD COLUMN email VARCHAR(50) NOT NULL;

ALTER TABLE my_table29
    ADD COLUMN country VARCHAR(20);
ALTER TABLE my_table29
    ADD COLUMN city VARCHAR(20) AFTER address;
ALTER TABLE my_table29
    ADD COLUMN ssn VARCHAR(20) FIRST;

DESC my_table29;