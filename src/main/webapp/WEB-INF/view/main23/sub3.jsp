<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>23-3</title>
</head>
<body>
<h3>상품명 목록</h3>
<c:forEach items="${productList}" var="products">
    <li>${products}</li>
</c:forEach>
</body>
</html>
