#data들이 table 안에 저장됨
# table들은 database(schema) 내에 저장됨
# 여기선 w3schools가 테이블이 저장되는 database(schema)

# database(schema) 만들기
CREATE DATABASE test1;

# table 만들기
CREATE TABLE book
(
    title varchar(100),
    price int
);

#database(schema) 이동
USE test1;
USE w3schools;

#table 지우기
DROP DATABASE test1;
DROP TABLE book;

#SELECT: 테이블 조회
SELECT *
FROM Customers;

#모든 행은 같은 열을 가지고 있다.

#특정 칼럼만 조회
#SELECT 컴럼명[, 컬럼명] FROM 테이블명
SELECT CustomerID
FROM Customers;

SELECT CustomerID, CustomerName
FROM Customers;

#DESCRIBE 테이블명: 테이블 구조 확인
DESCRIBE Customers;
DESC Customers;

#Employees 테이블에 어떤 컬럼(필드)가 있는지 확인
DESC Employees;

#Employees 테이블의 레코드 EmployeeID, LastName, FirstName 컬럼만 조회하기
SELECT EmployeeID, LastName, FirstName
FROM Employees;

# * 모든 컬럼 조회

#Products 테이블의 모든 칼럼과 모든 행 조회
SELECT *
FROM Products;
#Products 테이블의 ProductName, Unit, Price 컬럼 조회
SELECT ProductName, Unit, Price
FROM Products;
#Suppliers 테이블의 City, Country, SupplierName 컬럼 조회(열순서 유지)
SELECT City, Country, SupplierName
FROM Suppliers;

SELECT FirstName
FROM Employees;