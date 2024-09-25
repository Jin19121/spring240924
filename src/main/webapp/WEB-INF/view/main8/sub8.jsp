<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main8/sub8</title>
</head>
<body>
    <p>${students[0]}</p>
    <p>${students[1]}</p>
    <p>${students[2]}</p>
<hr>
    <p>${num}</p>
    <p>${index}</p>
    <p>${point}</p>
<hr>
    <p>${students[num]}</p>
<%--${students[0]}과 동일하다 (num=0)--%>
    <p>${students[index]}</p>
    <%--${students["1"]}과 동일하다 (index="1")--%>
    <p>${students[point]}</p>
    <%--${students["2"]}과 동일하다 (point="2")--%>

</body>
</html>
