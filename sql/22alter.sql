USE db1;

#컬럼 변경
ALTER TABLE my_table29
    MODIFY COLUMN ssn varchar(10) DEFAULT '0000' UNIQUE;
SELECT *
FROM my_table29;

#컬럼변경시 제약사항을 위반하는 기존 레코드의 값을 적절히 수정해야함
UPDATE my_table29
SET ssn = '1'
WHERE name = 's';
ALTER TABLE my_table29
    MODIFY COLUMN ssn VARCHAR(10) NOT NULL DEFAULT '0000' UNIQUE;
DESC my_table29;

UPDATE my_table29
SET address='lon'
WHERE address = 'london';

ALTER TABLE my_table29
    MODIFY COLUMN address VARCHAR(3) NOT NULL;

INSERT INTO my_table29
    VALUE ('2가', 'DK', 28, '플디', 'Weverse', 'Korea');

#컬럼 삭제 : 매우 주의!!!
ALTER TABLE my_table29
    DROP COlumn city;

SELECT *
FROM my_table29;

CREATE TABLE book
(
    isbn      VARCHAR(10),
    title     VARCHAR(10),
    author    VARCHAR(5),
    price     DOUBLE,
    published DATE
);

SELECT *
FROM book;
