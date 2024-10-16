USE w3schools;

SELECT *
FROM Orders;
SELECT *
FROM OrderDetails
WHERE OrderID = 10248;

SELECT o.OrderDate, c.CustomerName, p.ProductName, od.Quantity
FROM Orders o
         JOIN OrderDetails od
              ON o.OrderID = od.OrderID
         JOIN Customers c
              ON c.CustomerID = o.CustomerID
         JOIN Products p
              ON od.ProductID = p.ProductID
WHERE OrderDate = '1996-07-04';

#1996년 7월 4일에 주문된 상품과 카테고리 정보 조회
SELECT o.OrderDate, p.ProductName, CategoryName, Description
FROM Orders o
         JOIN OrderDetails od
              ON o.OrderID = od.OrderID
         JOIN Products p
              ON od.ProductID = p.ProductID
         JOIN Categories c
              ON c.CategoryID = p.CategoryID
WHERE OrderDate = '1996-07-04';

#5번 직원이 처리한 주문의 주문날짜와 상품 조회
SELECT o.OrderDate, cu.CustomerName, p.ProductName, ca.CategoryName, p.Unit, p.Price
FROM Employees e
         JOIN Orders o
              ON e.EmployeeID = o.EmployeeID
         JOIN OrderDetails od
              ON o.OrderID = od.OrderID
         JOIN Products p
              ON p.ProductID = od.ProductID
         JOIN Categories ca
              ON ca.CategoryID = p.CategoryID
         JOIN Customers cu
              ON cu.CustomerID = o.CustomerID
WHERE e.EmployeeID = 5;
