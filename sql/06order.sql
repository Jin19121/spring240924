USE w3schools;

SELECT *
FROM Products;

#ORDER BY : 조회 결과의 순서를 결정
#ORDER BY 컬럼명

SELECT *
FROM Employees
ORDER BY BirthDate;

SELECT *
FROM Customers
ORDER BY CustomerName;

SELECT *
FROM Customers
WHERE Country = 'usa'
ORDER BY CustomerName;

SELECT *
FROM Products
WHERE CategoryID = 1
ORDER BY Price;

#오름차순 ASC 생략 가능
#내림차순 DESC => 이거 강의 확인
SELECT *
FROM Products
ORDER BY Price DESC;

SELECT *
FROM Employees
ORDER BY BirthDate DESC;

SELECT *
FROM Customers
WHERE Country = 'Mexico'
ORDER BY CustomerName DESC;

SELECT *
FROM OrderDetails
WHERE OrderID = '10248'
ORDER BY Quantity DESC;

SELECT *
FROM Products
WHERE SupplierID = 1
ORDER BY ProductName ASC;

#ORDER BY 컬럼, 컬럼, 컬럼: 여러 컬럼 기준으로 정렬
SELECT CustomerName, City, Country
FROM Customers
ORDER BY Country;

SELECT CustomerName, City, Country
FROM Customers
ORDER BY Country, City DESC;

SELECT CustomerName, City, Country
FROM Customers
ORDER BY Country, City, CustomerName;

SELECT CustomerName, City, Country
FROM Customers
ORDER BY Country, City DESC, CustomerName DESC;

SELECT *
FROM Products
WHERE CategoryID = 1
ORDER BY SupplierID, Price DESC;

#컬럼명 대신 컬럼 인덱스 사용 가능
#단 테이블의 컬럼 인덱스가 아닌, 해당 SELECT 출력 시 생성되는 테이블의 인덱스다
SELECT *
FROM Products
WHERE CategoryID = 1
ORDER BY 3, 6 DESC;
