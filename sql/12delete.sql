USE w3schools;

#DELETE FROM 테이블명: 모든 레코드 삭제
# DELETE
# FROM Customers;

SELECT *
FROM Customers
WHERE CustomerName = '이지훈';

DELETE
FROM Customers
WHERE CustomerName = '이지훈';

#꼭 DELETE 실행 전 같은 WHERE 절로 SELECT 해볼 것

SELECT *
FROM Customers
ORDER BY CustomerID DESC;

DELETE
FROM Customers
WHERE CustomerID = 104;

SELECT *
FROM Products
ORDER BY ProductID DESC;