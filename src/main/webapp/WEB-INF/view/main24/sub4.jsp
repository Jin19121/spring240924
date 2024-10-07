<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>24-4</title>
    <style>
        table {
            border-collapse: collapse;
        }

        th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<h3>상품 목록</h3>
<table>
    <thead>
    <tr>
        <th>상품 번호</th>
        <th>상품명</th>
        <th>단위</th>
        <th>가격</th>
    </tr>
    </thead>
    <c:forEach items="${productList}" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.unit}</td>
            <td>${p.price}</td>
        </tr>
    </c:forEach></table>
</body>
</html>
