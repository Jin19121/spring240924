<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <style>
        table {
            border-collapse: collapse;
            width: 70%;
            text-align: center;
        }

        th, td {
            border: 1px solid cornflowerblue;
        }
    </style>
    <title>37-6</title>
</head>
<body>
<c:if test="${not empty done}">${done}</c:if>
<h3>새 상품 입력</h3>
<form method="post">
    <div>
        상품명
        <input type="text" name="name">
    </div>
    <div>
        상품 가격
        <input type="text" name="price">
    </div>
    <div>
        <button>저장</button>
    </div>
</form>
<hr>
<h3>최근 상품</h3>
<table>
    <thead>
    <tr>
        <th>상품번호</th>
        <th>상품명</th>
        <th>가격</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${productList}" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.price}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
