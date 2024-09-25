<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%> <%--반복문 사용법 (나중에 자세히)--%>
<html>
<head>
    <title>main8/sub7</title>
</head>
<body>
    <p>${jobs}</p>
    <p>${jobs[0]}</p>
    <p>${jobs[1]}</p>
    <p>${jobs[2]}</p>
    <hr>
    <p>${pointList}</p>
    <p>${pointList[0]}</p>
    <p>${pointList[1]}</p>
    <p>${pointList[2]}</p>
    <hr>
<%--반복문. 추후--%>
    <c:forEach items="${jobs}" var="job">
      <p>${job}</p>
    </c:forEach>
</body>
</html>
