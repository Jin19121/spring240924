USE db1;

DESC my_table16;

#constraint 제약사항

#Null 허용 여부
CREATE TABLE my_table17
(
    col1 VARCHAR(3),         # NULL 허용
    col2 VARCHAR(3) NOT NULL # NULL 비허용
);
INSERT INTO my_table17
    (col2) VALUE ('어떤값');
INSERT INTO my_table17
    (col1) VALUE ('어느값');
#2에 값이 없어서 실패

#명시적 NULL 추가
INSERT INTO my_table17
    (col1, col2) VALUE (NULL, '또다른');
INSERT INTO my_table17
    VALUE (NULL, 'abc'); #(컬럼명) 없으면 모든 컬럼에 순차적으로
INSERT INTO my_table17
    VALUE ('', '');
INSERT INTO my_table17
    VALUE (NULL, NULL); # x

CREATE TABLE my_table18
(
    name  VARCHAR(5) NOT NULL,
    price INT
);

