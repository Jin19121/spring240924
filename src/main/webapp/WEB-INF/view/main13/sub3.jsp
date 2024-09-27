<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>main13/sub3</title>
</head>
<body>
<%--jstl choose--%>
<c:choose>
    <c:when test="${param.country=='uk'}">
        <p>해리 케인</p>
    </c:when>
    <c:when test="${param.country=='jp'}">
        <p>오타니</p>
    </c:when>
    <c:when test="${param.country=='kr'}">
        <p>흥민</p>
    </c:when>
    <c:when test="${not empty param.country}">
        <p>해당 선수가 없습니다.</p>
    </c:when>
    <c:otherwise>
        <p>${param.country}</p>
        <p>국가를 선택해 주십시오.</p>
    </c:otherwise>
</c:choose>

<c:choose>
    <c:when test="${0<=param.age&&param.age<=13}">
        <p>어린이 영화</p>
    </c:when>
    <c:when test="${14<=param.age&&param.age<=19}">
        <p>청소년 영화</p>
    </c:when>
    <c:when test="${20<=param.age}">
        <p>성인 영화</p>
    </c:when>
    <c:when test="${empty param.age}">
        <p>나이를 입력해 주세요.</p>
    </c:when>
    <c:otherwise>
        <p>유효한 나이를 입력해 주세요.</p>
    </c:otherwise>
</c:choose>
</body>
</html>
