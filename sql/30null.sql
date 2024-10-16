USE db1;
CREATE TABLE my_table50
(
    id   INT,
    name VARCHAR(30)
);
INSERT INTO my_table50
    (id, name) VALUE (1, 'kim'),
    (2, 'lee'),
    (3, 'park'),
    (null, 'choi'),
    (null, 'son'),
    (4, null),
    (5, null);
SELECT *
FROM my_table50;

#IS NULL: 값이 NULL 여부
SELECT *
FROM my_table50
WHERE id IS NULL;
SELECT *
FROM my_table50
WHERE name IS NOT NULL;

#NULL과의 모든 연산은 FALSE
SELECT *
FROM my_table50
WHERE id > 3;

SELECT *
FROM my_table50
WHERE id <= 3;

#NULL 대체 IFNULL()
SELECT *
FROM my_table50
WHERE IFNULL(id, 0) > 3;

SELECT *
FROM my_table50
WHERE IFNULL(id, 0) <= 3;

#집계함수(COUNT, SUM, AVG, MIN, MAX)
SELECT *
FROM my_table50;
SELECT COUNT(id)
FROM my_table50;
SELECT SUM(id)
FROM my_table50;
SELECT AVG(id)
FROM my_table50;
SELECT AVG(IFNULL(id, 0))
FROM my_table50;