<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>main13.sub7</title>
</head>
<body>
<c:forEach items="${people}" var="person">
    <p>${person.key} : ${person.value}</p>
</c:forEach>

<c:forEach items="${players}" var="players">
    <div style="margin:30px">
        <p>${players.key} : ${players.value}</p>
    </div>
</c:forEach>

<c:forEach items="${food}" var="food">
    <div style="margin:15px">
        <p> 종류: ${food.key}
            <br>
            음식: ${food.value}</p>
    </div>
</c:forEach>


</body>
</html>
