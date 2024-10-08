USE w3schools;

#LIKE : ~같은
SELECT *
FROM Customers
WHERE CustomerName = 'Alfreds Futterkiste';

SELECT *
FROM Customers
WHERE CustomerName LIKE '%ed%';

SELECT *
FROM Customers
WHERE CustomerName LIKE 'A%';

SELECT *
FROM Customers
WHERE CustomerName LIKE '%A';

# _ : 임의의 한글자
SELECT *
FROM Employees
WHERE BirthDate LIKE '195_-__-__';

#고객명에 OR이 포함
SELECT *
FROM Customers
WHERE CustomerName LIKE '%or%';

# A 시작, o 종료
SELECT *
FROM Customers
WHERE ContactName LIKE 'A%o';

#7월생
SELECT *
FROM Employees
WHERE BirthDate LIKE '____-07-__';
