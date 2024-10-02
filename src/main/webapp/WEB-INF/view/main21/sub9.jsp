<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>21-9</title>
</head>
<body>
<p>${myBean8.userName}</p>
<p>${myBean8.age}</p>
<div>
    <c:forEach items="${myBeans8.foodList}" var="food">
        <p>${food}</p>
    </c:forEach>
</div>
<p>${myBean8.startDate}</p>
<p>${myBean8.endDateTime}</p>
<p>${myBean8.expired}</p>
<p>${myBean8.score}</p>
</body>
</html>
<%--수정--%>