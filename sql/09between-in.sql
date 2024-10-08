USE w3schools;

# 열 BETWEEN 값1 AND 값2 : 값1과 값2 사이(값1, 값2 포함)
# 열 >= 값 AND 열 <= 값2
SELECT *
FROM Products
WHERE Price >= 10
  AND Price <= 20
ORDER BY Price;



# 열 IN (값1, 값2, 값3) : 값1이거나 값2이거나 값3이거나...
# 열 = 값1 OR 열=값2 OR 열=값3
SELECT *
FROM Customers
WHERE Country IN ('USA', 'mexico')
ORDER BY Country, City;

#practice
#1997년에 주문된 주문들
SELECT *
FROM Orders
WHERE OrderDate BETWEEN '1997-01-01' AND '1997-12-31';

#미국, 영국 공급자
SELECT *
FROM Suppliers
WHERE Country IN ('USA', 'UK');

#1, 2번 카테고리
SELECT *
FROM Products
WHERE CategoryID IN (1, 2);