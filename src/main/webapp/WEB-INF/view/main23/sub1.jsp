<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>23-1</title>
</head>
<body>
<h3>직원 이름 목록</h3>
<c:forEach items="${nameList}" var="name">
    <li>${name}</li>
</c:forEach>
</body>
</html>
