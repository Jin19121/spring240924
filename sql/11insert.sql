USE w3schools;

DESC Customers;

#INSER INTO 테이블명 (내용을 채울 필드명) VALUE (필드에 채울 내용);
INSERT INTO Customers
    (CustomerID, CustomerName)
    VALUE (92, 'DK');

SELECT*
FROM Customers
ORDER BY CustomerID DESC;

INSERT INTO Customers
    (CustomerID, CustomerName, ContactName)
    VALUE (93, '서명호', '디에잇');

#VALUES: 여러 행을 추가할 때
INSERT INTO Customers
    (CustomerID, CustomerName)
VALUES (94, '부승관'),
       (95, '이찬'),
       (96, '최한솔');

INSERT INTO Customers
    (CustomerID, CustomerName)
    VALUE ('97', '윤정한');

#CustomerID는 값을 넣지 않아도 NULL이 되지 않고 자동으로 값이 생성됨
INSERT INTO Customers
    (CustomerName)
    VALUE ('최승철');

#Customers 테이블에 2개 레코드 추가
INSERT INTO Customers
    (CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES ('권순영', '호시', '캐럿랜드', '남양시', '1010', 'Korea'),
       ('이지훈', 'WOOZI', '우주공장', '용산', '0526', 'Korea');

SELECT *
FROM Products
ORDER BY ProductID DESC;

#Products에 2개 레코드 추가
INSERT INTO Products
    (ProductID, ProductName, SupplierID, CategoryID, Unit, Price)
    VALUE (78, '캐럿봉', '17', '3', '1', '25.00');

INSERT INTO Products
    (ProductName, SupplierID, CategoryID, Unit, Price)
    VALUE ('Pizza', 10, 78, 13, '5.00');