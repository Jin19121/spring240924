<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>23-2</title>
</head>
<body>
<h3>고객 이름 목록</h3>
<c:forEach items="${nameList}" var="name">
    <li>${name}</li>
</c:forEach>
</body>
</html>
