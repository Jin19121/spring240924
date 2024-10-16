USE w3schools;

#subquery 외부쿼리 내에 내부쿼리 작성

#1번 고객과 같은 국가에 있는 고객들
SELECT *
FROM Customers
WHERE CustomerID = 1;

SELECT *
FROM Customers
WHERE Country = 'Germany';

#subquery
SELECT CustomerName, Country
FROM Customers
WHERE Country = (SELECT Country
                 FROM Customers
                 WHERE CustomerID = 1)
ORDER BY CustomerName;

#join 같은 결과
SELECT c1.CustomerName, c1.Country
FROM Customers c1
         JOIN Customers c2
WHERE c2.CustomerID = 1
  AND c1.Country = c2.Country
ORDER BY c1.CustomerName;

#subquery는 SELECT, FROM, WHERE에 작성 가능

#SELECT
#각 고객이 주문한 건수
SELECT c.CustomerID, c.CustomerName, COUNT(o.OrderID) 건
FROM Customers c
         LEFT Join Orders o on c.CustomerID = o.CustomerID
GROUP BY c.CustomerID
ORDER BY 건 DESC, CustomerID;

SELECT COUNT(OrderID)
FROM Orders
WHERE CustomerID = 2;

SELECT CustomerID,
       CustomerName,
       (SELECT COUNT(OrderID)
        FROM Orders o
        WHERE o.CustomerID = c.CustomerID) 건
FROM Customers c
ORDER BY 건 DESC, CustomerID;

#FROM
SELECT AVG(Price)
FROM Products;

SELECT *
FROM Products
WHERE Price > (SELECT AVG(Price)
               FROM Products);

#평균 처리 건수보자 많은 주문을 처리한 직원 목록
SELECT *
FROM Employees;

SELECT COUNT(OrderID)
FROM Orders;
SELECT COUNT(EmployeeID)
FROM Employees;

SELECT ((SELECT COUNT(OrderID) FROM Orders) / (SELECT COUNT(EmployeeID) FROM Employees));
##아직 안 끝남

#고객이 가장 많은 국가의 고객 목록
SELECT Country
FROM Customers
GROUP BY Country
ORDER BY COUNT(CustomerID) DESC
LIMIT 1;

SELECT *
FROM Customers
WHERE Country = (SELECT Country
                 FROM Customers
                 GROUP BY Country
                 ORDER BY COUNT(CustomerID) DESC
                 LIMIT 1);
