SELECT 3;
SELECT 4 + 5;
SELECT 4 * 4;
SELECT 5 / 4;
SELECT 5 % 4;
# SELECT 'hello' || 'world'; 아님
SELECT CONCAT('hello', 'world');

USE w3schools;
SELECT *
FROM Employees;

SELECT CONCAT(FirstName, ' ', LastName) FullName
FROM Employees;
SELECT CONCAT(Address, ' ', City, ' ', Country) FullAddress
FROM Customers;

#1번 고객의 총 주문 곰액
SELECT CustomerName, ProductName, Price, Quantity, Price * Quantity Total
FROM Customers c
         JOIN Orders o
              ON c.CustomerID = o.CustomerID
         JOIN OrderDetails od
              ON o.OrderID = od.OrderID
         JOIN Products p
              ON od.ProductID = p.ProductID
WHERE c.CustomerID = 1;

SELECT c.CustomerName,
       SUM(p.Price * od.Quantity) Total
FROM Customers c
         JOIN Orders o
              ON c.CustomerID = o.CustomerID
         JOIN OrderDetails od
              ON o.OrderID = od.OrderID
         JOIN Products p
              ON od.ProductID = p.ProductID
GROUP BY c.CustomerID;

#1998년 3월 최고매출 직원 조회
SELECT e.*, SUM(Price * Quantity) total
FROM Employees e
         JOIN Orders o
              ON e.EmployeeID = o.EmployeeID
         JOIN OrderDetails od
              ON od.OrderID = o.OrderID
         JOIN Products p
              ON p.ProductID = od.ProductID
WHERE OrderDate LIKE '1998-03-__'
GROUP BY e.EmployeeID
ORDER BY total DESC;

