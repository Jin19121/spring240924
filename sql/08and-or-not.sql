USE w3schools;

#and or not => 설명 확인
SELECT *
From Customers
WHERE Country = 'Mexico'
   OR Country = 'USA'
ORDER BY Country, City;

SELECT *
FROM Customers
WHERE Country <> 'mexico';
SELECT *
FROM Customers
WHERE NOT Country = 'mexico';

SELECT *
From Customers
WHERE NOT (Country = 'mexico'
    OR Country = 'usa');
SELECT *
FROM Customers
WHERE Country != 'mexico'
  AND Country != 'usa';

#미국이나 브라질에 사는 G-
SELECT *
FROM Customers
WHERE CustomerName LIKE 'g%'
  AND (Country = 'USA'
    OR Country = 'Brazil');

SELECT *
FROM Employees
WHERE BirthDate LIKE '195%';

SELECT *
FROM Products
WHERE Price < 10.00
   OR Price > 100.00;

SELECT *
FROM Orders
WHERE OrderDate
          LIKE '1997-07-__';

SELECT *
FROM Suppliers
WHERE Country = 'USA'
   OR Country = 'UK';

#연습
SELECT *
FROM Products
ORDER BY Price DESC;