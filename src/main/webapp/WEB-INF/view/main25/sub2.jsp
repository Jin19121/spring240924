<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>25-2</title>
</head>
<body>
<h3>가격의 상품 조회</h3>
<form action="/main25/sub2" method="get">
    가격
    <input type="text" step="0.01" value="${param.price}" name="price">
    <button>조회</button>
</form>
<hr>
<c:if test="${not empty nameList}" var="name">
    <ul>
        <c:forEach items="${nameList}" var="name">
            <li>${name}</li>
        </c:forEach></ul>
</c:if>
</body>
</html>
