<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>로그인 창</title>
</head>
<body>
<c:import url="/WEB-INF/view/main17/sub4.jsp"/>
<p>계정주: ${sessionScope.userid}</p>

<h1>Longin</h1>
<form>
    <input type="text" name="id" placeholder="아이디">
    <br>
    <button>로그인</button>
</form>
</body>
</html>
