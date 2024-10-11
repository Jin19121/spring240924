<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>28-3</title>
</head>
<body>
<c:if test="${not empty message}">
    <h4 style="background-color: lightskyblue">${message}</h4>
</c:if>
<h3>상품 정보 입력</h3>
<form action="/main28/sub4" method="post">
    상품명:
    <input type="text" name="name">
    <br>
    단위:
    <input type="text" name="unit">
    <br>
    가격:
    <input type="number" step="0.01" name="price">
    <br>
    <button>등록</button>
</form>
</body>
</html>
