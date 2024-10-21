USE db1;

DROP TABLE db1.my_table58;

CREATE TABLE my_table58
(
    name  VARCHAR(30),
    money INT
);
INSERT INTO my_table58
VALUES ('kim', 10000),
       ('lee', 10000);
#kim -> lee 500원 송금
# transaction 한번에 성공해야 할 업무 단위
UPDATE my_table58
SET money = money - 500
WHERE name = 'kim';
UPDATE my_table58
SET money = money + 500
WHERE name = 'lee';
SELECT *
FROM my_table58;

#transaction: 하나의 업무 단위 (모두 실패, 또는 모두 성공)
COMMIT; #반영
ROLLBACK;
#되돌리기

#kim -> lee 500원 송금
UPDATE my_table58
SET money = money + 500
WHERE name = 'kim';

#마지막 커밋으로 되돌리기
ROLLBACK;

UPDATE my_table58
SET money = money - 500
WHERE name = 'lee';

#DB 반영
COMMIT;

ROLLBACK;

UPDATE my_table58
SET money = money - 1000
WHERE name = 'kim';
UPDATE my_table58
SET money = money + 1000
WHERE name = 'lee';
