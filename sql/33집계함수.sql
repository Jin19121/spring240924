#집계함수 (Aggregate Functions)
#COUNT, AVG, SUM, MAX, MIN
#집계함수 사용 시 NULL 포함되지 않음

#COUNT 개수
USE w3schools;
SELECT COUNT(*)
FROM Customers;

DESC Customers;

INSERT INTO Customers
    (CustomerName) VALUE ('도겸');
SELECT COUNT(*)
FROM Customers;
SELECT COUNT(CustomerName)
FROM Customers;
SELECT COUNT(ContactName)
FROM Customers; #NULL 제외하고 count

SELECT COUNT(Country)
FROM Customers;
SELECT COUNT(DISTINCT Country)
FROM Customers;

SELECT SUM(Price)
FROM Products;
SELECT AVG(Price)
FROM Products;
SELECT MAX(Price)
FROM Products;
SELECT MIN(Price)
FROM Products;

DELETE
FROM Customers
WHERE CustomerID = 92;

#GROUP BY : 소계시 사용
SELECT COUNT(CustomerID)
FROM Customers;
SELECT Country, COUNT(CustomerID)
FROM Customers
GROUP BY Country;
SELECT Country, COUNT(CustomerID) 인원
FROM Customers
GROUP BY Country
ORDER BY 인원 DESC;

SELECT Country, COUNT(CustomerID) 인원
FROM Customers
GROUP BY Country
ORDER BY 인원 DESC
LIMIT 5;

#카테고리별 평균 상품 가격
SELECT p.CategoryID, CategoryName, AVG(Price)
FROM Products p
         JOIN Categories c
              ON c.CategoryID = p.CategoryID
GROUP BY p.CategoryID
ORDER BY p.CategoryID;

#직원별 주문처리 건수
SELECT e.EmployeeID, e.LastName, e.FirstName, COUNT(o.OrderID)
FROM Employees e
         JOIN Orders o
              ON e.EmployeeID = o.EmployeeID
GROUP BY o.EmployeeID
ORDER BY e.EmployeeID;

SELECT *
FROM Orders
WHERE EmployeeID = 1;

#고객별 주문 건수
SELECT c.CustomerID, c.CustomerName, COUNT(o.OrderID)
FROM Orders o
         RIGHT JOIN Customers c
                    ON o.CustomerID = c.CustomerID
GROUP BY c.CustomerID;

#한번도 주문하지 않은 고객 추가
SELECT *
FROM Customers c
         LEFT JOIN Orders o
                   ON c.CustomerID = o.CustomerID
WHERE o.OrderID IS NULL;

#1997년 1월에 주문 처리 건수를 직원별로 조회
SELECT e.EmployeeID, e.LastName, e.FirstName, COUNT(o.OrderID)
FROM Orders o
         JOIN Employees e #LEFT, RIGHT 해도 안됨 ->NULL 결정 되기 전에 이미 합쳐서 값
              ON o.EmployeeID = e.EmployeeID
WHERE OrderDate LIKE '1997-01-__'
GROUP BY e.EmployeeID;

SELECT *
FROM Orders
WHERE OrderDate LIKE '1997-01-__'
ORDER BY EmployeeID;

SELECT *
FROM Employees
ORDER BY EmployeeID;

SELECT e.EmployeeID, FirstName, LastName, COUNT(e.EmployeeID)
FROM Employees e
         LEFT JOIN Orders o
                   ON e.EmployeeID = o.EmployeeID
GROUP BY e.EmployeeID; #여기서 날짜 검색하는 거라 그냥 사라져버리는 거


SELECT e.EmployeeID, FirstName, LastName, COUNT(OrderID)
FROM (SELECT *
      FROM Orders
      WHERE OrderDate LIKE '1997-01-__') AS JanOrder
         RIGHT JOIN Employees e
                    ON JanOrder.EmployeeID = e.EmployeeID
GROUP BY e.EmployeeID;



