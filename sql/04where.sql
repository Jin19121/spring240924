USE w3schools;

#SELECT 컬럼명들 FROM 테이블명
SELECT CustomerName, Country
FROM Customers

#조건에 맞는 행들
#WHERE : 조회될 행의 조건이 작성되는 곳

# SELECT 컬럼명 FROM 테이블명 WHERE 조건
SELECT CustomerName
FROM Customers
WHERE Country='Mexico'; #회사와 프로그램에 따라 "쌍따옴표"로 하기도

SELECT *
FROM Employees
WHERE BirthDate = '1968-12-08';

SELECT *
FROM Products
WHERE Price = '10.00';

SELECT SupplierName
FROM Suppliers
WHERE Country = 'Spain';
SELECT *
FROM Suppliers
WHERE country = 'Spain';
SELECT *
FROM Suppliers
WHERE counTRy = 'sPAin';
#대소문자 구분없음


# 상파울루(São Paulo)에 있는 고객들(Customers)
SELECT CustomerName
FROM Customers
WHERE City = 'São Paulo';

SELECT LastName, FirstName
FROM Employees
WHERE BirthDate = '1963-08-30';

SELECT *
FROM Categories
WHERE  CategoryID = 2;
SELECT *
FROM Categories
WHERE  CategoryID = '2';

SELECT *
FROM Products
WHERE Price = '10.00';
SELECT *
FROM Products
WHERE Price = 10.00;
#수형식이면 따옴표 생략 가능