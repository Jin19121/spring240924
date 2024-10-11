USE w3schools;

UPDATE Customers
SET CustomerName = '이석민',
    ContactName  = '도겸',
    City         = '용인'
; #모든 record 내용 위와 같이 변경

UPDATE Customers
SET CustomerName = '이석민',
    ContactName  = '도겸',
    City         = '용인'
WHERE Country = 'usa';
#USA의 모든 고객 대상

#꼭 UPDATE 전에 같은 WHERE 절로 SELECT 먼저 해볼 것
SELECT *
FROM Customers
WHERE Country = 'usa';

SELECT *
FROM Customers
WHERE CustomerID = 1;

UPDATE Customers
SET CustomerName = '이석민',
    ContactName  = '도겸',
    City         = '용인'
WHERE CustomerID = 1;

#1번 상품 이름을 케이크로 바꾸기
SELECT *
FROM Products
WHERE ProductID = 1;

UPDATE Products
SET ProductName = 'Cake'
WHERE ProductID = 1;

#3번 직원의 생일 2000-01-01로 변경
SELECT *
FROM Employees
WHERE EmployeeID = 3;

UPDATE Employees
SET BirthDate = '2000-01-01'
WHERE EmployeeID = 3;

#1번 공급자의 도시Seoul 국가 Korea
SELECT *
FROM Suppliers
WHERE SupplierID = 1;

UPDATE Suppliers
SET City='Seoul',
    Country = 'Korea'
WHERE SupplierID = 1;