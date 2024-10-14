USE db1;

#UNIQUE: 같은 컬럼, 다른 레코드의 값이 같은 값을 가질 수 없다.
CREATE TABLE my_table19
(
    col1 VARCHAR(2),
    col2 VARCHAR(2) UNIQUE
);
SELECT *
FROM my_table19;
INSERT INTO my_table19
    VALUE ('a', 'b');
INSERT INTO my_table19
    VALUE ('a', 'c');
INSERT INTO my_table19
    VALUE ('d', 'b'); #x b중복
INSERT INTO my_table19
    VALUE (null, 'd');
INSERT INTO my_table19
    VALUE ('a', null);
INSERT INTO my_table19
    VALUE ('b', null);
#null은 값이 없기 때문에 unique 제약 사항과 무관하다.

DESC my_table19;
CREATE TABLE my_Table20
(
    title VARCHAR(20) NOT NULL,
    price INT,
    isbn  VARCHAR(20) UNIQUE
);

CREATE TABLE my_table21
(
    ssn  INT UNIQUE,
    name VARCHAR(5) NOT NULL,
    age  INT
);
DESC my_table21;

CREATE TABLE my_table22
(
    col1 VARCHAR(1),
    col2 VARCHAR(2) UNIQUE NOT NULL
);
INSERT INTO my_table22
    VALUE (NULL, 'b');
INSERT INTO my_table22
    VALUE (NULL, 'b'); #-> 중복이라 불가
INSERT INTO my_table22
    VALUE ('a', NULL); #-> 2는 null 불가
DESC my_table22;
DESC my_table21;