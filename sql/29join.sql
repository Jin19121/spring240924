USE db1;
DROP TABLE my_table48;
DROP TABLE my_table49;

CREATE TABLE my_table48
(
    a    INT,
    name VARCHAR(20)
);
CREATE TABLE my_table49
(
    b    INT,
    note VARCHAR(20)
);
INSERT INTO my_table48
VALUES (3, 'kim'),
       (4, 'lee'),
       (5, 'park'),
       (6, 'choi');

INSERT INTO my_table49
VALUES (4, '노벨상'),
       (5, '금상'),
       (6, '대상'),
       (7, '장려상'),
       (8, '참가상');

#카테시안 곱
SELECT *
FROM my_table48
         JOIN my_table49;

#Inner
SELECT *
FROM my_table48 A
         JOIN my_table49 B
              ON A.a = B.b;

#Left JOIN
SELECT *
FROM my_table48 A
         LEFT JOIN my_table49 B
                   ON A.a = B.b;

#RIGHT
SELECT *
FROM my_table48 A
         RIGHT JOIN my_table49 B
                    ON A.a = B.b;

#오른쪽 테이블에만 있는 레코드들
SELECT *
FROM my_table48 t8
         RIGHT JOIN my_table49 t9
                    ON t8.a = t9.b
WHERE a IS NULL;

USE w3schools;
#주문 이력이 있는 고객 명
SELECT c.CustomerID, c.CustomerName
FROM Orders o
         RIGHT JOIN Customers c
                    ON o.CustomerID = c.CustomerID
WHERE o.CustomerID IS NULL;

INSERT INTO Employees
    (LastName, FirstName, BirthDate, Photo, Notes)
VALUES ('DK', 'LEE', '1997-02-18', '1234', 'TEAM SVT');
#주문을 처리한 적 없는 직원
SELECT e.EmployeeID, LastName, FirstName
FROM Employees e
         LEFT JOIN Orders o
                   ON e.EmployeeID = o.EmployeeID
WHERE o.EmployeeID IS NULL;

INSERT INTO Products
    (ProductName, SupplierID, CategoryID, Unit, Price) VALUE
    ('포카', '1717', '7777', '13', 48);
SELECT *
FROM Products
ORDER BY Products.ProductID DESC;
#주문된 적 없는 상품명
SELECT ProductName
FROM Products p
         LEFT JOIN OrderDetails o
                   ON p.ProductID = o.ProductID
WHERE o.ProductID IS NULL;