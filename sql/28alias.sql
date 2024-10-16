USE w3schools;

#alias: 별칭
#컬럼, 테이블에 별칭을 줄 수 있다.

SELECT Products.ProductName, Suppliers.SUpplierName
FROM Products
         JOIN Suppliers
              ON Products.SupplierID = Suppliers.SupplierID
WHERE Suppliers.SupplierID = 1;

SELECT p.ProductName 상품명, s.SUpplierName 공급자명
FROM Products p
         JOIN Suppliers s
              ON p.SupplierID = s.SupplierID
WHERE s.SupplierID = 1;

SELECT ProductName AS 상품명, UNIT AS 단위, Price AS 가격
FROM Products;

#연습: 카테고리별 상품명 조회
SELECT CategoryName 카테고리명, ProductName 상품명
FROM Categories c
         JOIN Products p
              ON c.CategoryID = p.CategoryID
ORDER BY c.CategoryID;

#연습: 공급자별 공급 상품 조회
SELECT SupplierName, ProductName, Unit, Price
FROM Suppliers s
         JOIN Products p
              ON s.SupplierID = p.SupplierID
ORDER BY SupplierName;

#1996.07.08에 주문을 처리한 직원 이름 조회
SELECT e.LastName, e.FirstName, OrderDate
FROM Employees e
         JOIN Orders o
              ON e.EmployeeID = o.EmployeeID
WHERE o.OrderDate = '1996-07-08';
