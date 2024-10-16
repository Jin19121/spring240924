USE db1;
#my_table39: 학생 정보
# 이름, 성별, 연락처(복수), 나이
CREATE TABLE my_table39
(
    id     INT PRIMARY KEY AUTO_INCREMENT,
    name   VARCHAR(30) NOT NULL DEFAULT '홍길동',
    gender VARCHAR(2)  NOT NULL DEFAULT 'NA',
    age    INT                  DEFAULT 0
#     phone  VARCHAR(100)
);
#my_table40: 학생 전화번호
CREATE TABLE my_table40
(
    student_id INT          NOT NULL REFERENCES my_table39 (id),
    phone      VARCHAR(100) NOT NULL,
    PRIMARY KEY (student_id, phone)
#     FOREIGN KEY fk1 (student_id) REFERENCES my_table39(id) 이렇게 해도 됨
);
#테이블 관계 형성됨
INSERT INTO my_table39#부모테이블
    (name, gender, age)
VALUES ('kim', 'm', 30),
       ('lee', 'f', 20),
       ('park', 'm', 15);
SELECT *
FROM my_table39;#자식테이블
INSERT INTO my_table40
VALUES (1, '999-9999'),
       (1, '444-0000'),
       (2, '777-9999');