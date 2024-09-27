<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>main13/sub8</title>
</head>
<body>
<c:forEach items="${datas}" var="data">
    <div style="border: 1px solid black">
        <c:forEach items="${data}" var="entry">
            <div style="margin: 30px;">
                <p>${entry.key}</p>
                <p>${entry.value}</p>
            </div>
        </c:forEach>
    </div>
</c:forEach>

<c:forEach items="${players}" var="p">
    <div style="border: 1px solid black">
        <c:forEach items="${p}" var="member">
            <div style="margin: 30px;">
                <p>${member.key}</p>
                <p>${member.value}</p>
            </div>
        </c:forEach>
    </div>
</c:forEach>

</body>
</html>
