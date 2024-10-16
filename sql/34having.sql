USE w3schools;

#HAVING: 집계 결과에 조건을 주기 위한 키워드
SELECT Country, COUNT(CustomerID) 인원
FROM Customers
GROUP BY Country
HAVING 인원 > 5;

# SELECT Country, COUNT(CustomerID)
# FROM Customers
# WHERE COUNT(CustomerID) > 5
# GROUP BY Country;

SELECT p.CategoryID, c.CategoryName, AVG(Price)
FROM Products p
         JOIN Categories c
              ON p.CategoryID = c.CategoryID
GROUP BY p.CategoryID
HAVING AVG(Price) >= 30;

#직원별 주문 건수 조회 (단, 100건 이상 처리한 직원만)
SELECT e.EmployeeID, e.LastName, COUNT(o.OrderID) count
FROM Employees e
         JOIN Orders o
              ON e.EmployeeID = o.EmployeeID
GROUP BY e.EmployeeID
HAVING count >= 100;