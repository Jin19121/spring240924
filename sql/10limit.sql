USE w3schools;

#LIMIT: 조회 결과 수(record 수, 행의 수)를 제한

SELECT *
FROM Orders
ORDER BY OrderDate DESC
LIMIT 10;

SELECT *
FROM Employees
ORDER BY BirthDate
LIMIT 3;

SELECT *
FROM Employees
ORDER BY BirthDate DESC
LIMIT 2;

SELECT *
FROM Products
ORDER BY Price DESC
LIMIT 10;

SELECT *
From Products
WHERE CategoryID = 3
ORDER BY Price
LIMIT 5;

SELECT *
FROM Orders
WHERE CustomerID = 1
ORDER BY OrderDate DESC
LIMIT 3;

#LIMIT 수1 : 상위 (수1)개
#LIMIT 수1, 수2 : (수1)번째부터 (수2)개. 단, 수1은 0부터 시작
SELECT *
FROM Customers
ORDER BY CustomerID
LIMIT 3;

SELECT *
FROM Customers
ORDER BY CustomerID
LIMIT 3,5;
#4번째부터 5개

#두번째로 나이 많은 직원
SELECT *
FROM Employees
ORDER BY BirthDate
LIMIT 1, 1;

#페이지 나누기에 사용

#91명 고객
SELECT *
FROM Customers
ORDER BY CustomerID;

#한 페이지에 10명씩
#1p: 1~10
SELECT *
FROM Customers
ORDER BY CustomerID
LIMIT 10;

#2p, 11~20
SELECT *
FROM Customers
ORDER BY CustomerID
LIMIT 10, 10;
#3p, 21~30
SELECT *
FROM Customers
ORDER BY CustomerID
LIMIT 20, 10;

