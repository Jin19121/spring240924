<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>main13/sub9</title>
</head>
<body>
<c:forEach items="${data}" var="entry">
    <p>${entry.key}</p>
    <ul>
        <c:forEach items="${entry.value}" var="item">
            <li>${item}</li>
        </c:forEach></ul>
</c:forEach>

<c:forEach items="${movies}" var="production">
    <p>${production.key}</p>
    <ul>
        <c:forEach items="${production.value}" var="title">
            <li>${title}</li>
        </c:forEach>
    </ul>
</c:forEach>
</body>
</html>
