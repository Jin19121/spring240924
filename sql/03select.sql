USE w3schools;
SELECT *
FROM Employees;
SELECT FirstName, LastName
FROM Employees;

# Customers 테이블의 총 레코드 수는 91개
SELECT *
FROM Customers;
SELECT Country
FROM Customers;

# DISTINCT 중복 제거
SELECT DISTINCT Country
FROM Customers;

#COUNT(): 레코드 수
SELECT COUNT(CustomerName)
FROM Customers;
SELECT COUNT(Country)
FROM Customers;
SELECT COUNT(DISTINCT Country)
FROM Customers;

#query 작성 관습
#키워드는 대문자, 테이블명과 컬럼명은 소문자 (단 회사마다 차이가 있을 수 있음)
#키워드 앞에서 줄바꿈으로 읽기 쉽게

#SQL은 대소문자를 구분하지 않음
#현재 우리가 사용하는 MariaDB는 테이블명만 대소문자 구분
SELECT *
FROM Customers;
# SELECT * FROM customers; x
SELECT CustomerID
FROM Customers;
SELECT customerid
FROM Customers; #o
SELECT CUSTOMERID
FROM Customers; #o

SELECT DISTINCT Country
FROM Customers;
SELECT DISTINCT Country
FROM Suppliers;

