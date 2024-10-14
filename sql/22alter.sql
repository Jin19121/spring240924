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

# UPDATE my_table29
#     SET address='LD';
#     WHERE
# MODIFY COLUMN ssn VARCHAR(3);#기존 것들을 3글자에 담지 못한 게 있음

#컬럼 삭제 : 매우 주의!!!
ALTER TABLE my_table29
    DROP COlumn city;


