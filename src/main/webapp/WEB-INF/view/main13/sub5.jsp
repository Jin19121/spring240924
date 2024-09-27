<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>main14/sub5</title>
</head>
<body>
<%--forEach 반복--%>
<c:forEach begin="1" end="3">
    <p>반복해야 하는 컨텐츠</p>
</c:forEach>
<c:forEach begin="0" end="4">
    <p>다섯번 반복</p>
</c:forEach>

<c:forEach begin="1" end="4" var="idx">
    <p>${idx}번</p>
</c:forEach>

<hr>
<c:forEach begin="11" end="15" var="i">
    <p>${i}</p>
</c:forEach>

<hr>
<c:forEach begin="1" end="9" var="i">
    <p>5X${i}=${5*i}</p>
</c:forEach>
<hr>

<c:if test="${1<=param.dan && param.dan<=9}" var="validDan">
    <h3>구구단 ${param.dan}단</h3>
    <c:forEach begin="1" end="9" var="b">
        <p>${param.dan}X${b}=${param.dan*b}</p>
    </c:forEach>
</c:if>
<c:if test="${not validDan}">
    <p>유효한 수를 입력해 주세요</p>
</c:if>
<hr>

<c:forEach begin="1" end="9" var="a">
    <h3>구구단 ${a}단</h3>
    <c:forEach begin="1" end="9" var="b">
        <p>${a}X${b}=${a*b}</p>
    </c:forEach>
</c:forEach>


</body>
</html>
