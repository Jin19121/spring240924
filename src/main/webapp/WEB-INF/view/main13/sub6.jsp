<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>main13/sub6</title>
</head>
<body>
<p>${products[0]}</p>
<p>${products[1]}</p>
<p>${products[2]}</p>
<hr>
<c:forEach begin="0" end="2" var="i">
    <p>${products[i]}</p>
</c:forEach>

<hr>
<%--<c:forEach begin="0" end="${product.size()-1}" var="i">--%>
<%--    <p>${products[i]}</p>--%>
<%--</c:forEach>--%>

<%--items: 반복할 attribute--%>
<c:forEach items="${products}" var="products">
    <p>${products}</p>
</c:forEach>
<hr>
<c:forEach items="${members}" var="members">
    <p>${members}</p>
</c:forEach>

<hr>
<c:forEach items="${cityList}" var="cityList">
    <p>${cityList}</p>
</c:forEach>

</body>
</html>
