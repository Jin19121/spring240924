<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main9.sub3</title>
</head>
<body>
<p>${person["name"]}</p>
<p>${person["address"]}</p>
<p>${person["email"]}</p>
<%--키가 자바 변수명 작성 규칙(영문대소문자, 숫자, _, $)에 맞다면
    .키 사용가능--%>
<hr>
<p>${person.name}</p>
<p>${person.address}</p>
<p>${person.email}</p>
</body>
</html>
