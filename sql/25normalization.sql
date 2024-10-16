USE db1;
SELECT *
FROM w3schools.Products;
SELECT *
FROM w3schools.Categories;
DESC w3schools.Products;
#상품: 1NF o, 2NF o
# 상품번호: 상품명, 단위, 가격, 카테고리 번호(FK), 공급자 번호(FK)

#카테고리: 1NF o, 2NF o, 3NF o
# 카테고리 번호, 카테고리명, 카테고리 설명

#공급자
# 공급자번호: 공급자명, 계약명, 주소, 도시, 우편번호, 국가, 전화번호 등등
