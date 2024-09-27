<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>main13/sub2</title>
</head>
<body>
<p>/main13/sub2</p>
<%--반복된 코드실행
    출력 여부--%>
<%--<forEach></forEach>--%>
<%--<if></if>--%>
<c:if test="true">
    <p>출력이 된다</p>
</c:if>
<c:if test="false">
    <p>출력이 안된다</p>
</c:if>

<c:if test="${param.g=='남자'}">
    <p>남자입니다.</p>
</c:if>
<c:if test="${param.g=='여자'}">
    <p>여자입니다.</p>
</c:if>

<c:if test="${param.age<13}">
    <p>어린이용 컨텐츠</p>
</c:if>
<c:if test="${param.age>=13 &&param.age<20}">
    <p>청소년용 컨텐츠</p>
</c:if>
<c:if test="${param.age>=20}">
    <p>성인용 컨텐츠</p>
</c:if>

<c:if test="${param.country=='US'}">
    <p>Vernon</p>
</c:if>
<c:if test="${param.country=='China'||param.country=='중국'}">
    <p>명호, 준</p>
</c:if>
<c:if test="${param.country=='Korea'||param.country=='한국'}">
    <p>도겸</p>
</c:if>
</body>
</html>
