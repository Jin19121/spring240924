<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>26-5</title>
</head>
<body>
<h3>가격으로 상품 검색</h3>
<form action="">
    <input type="number" name="start" step="0.01" placeholder="부터" value="${param.start}">
    ~
    <input type="number" name="end" step="0.01" placeholder="까지" value="${param.end}">
    <button>검색</button>
</form>
<table>
    <thead>
    <tr>
        <th>상품번호</th>
        <th>상품명</th>
        <th>공급자</th>
        <th>카테고리</th>
        <th>단위</th>
        <th>가격</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${productList}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.supplierId}</td>
            <td>${product.categoryId}</td>
            <td>${product.unit}</td>
            <td>${product.price}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
