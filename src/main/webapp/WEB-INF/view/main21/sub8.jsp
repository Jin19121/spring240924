<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>21-8</title>
</head>
<body>
<form action="/main21/sub9" method="post">
    <input type="text" name="userName" value="your name">
    <br>
    <input type="number" name="age" value="0">
    <br>

    <input type="checkbox" name="foodList" value="빵">
    빵
    <br>
    <input type="checkbox" name="foodList" value="김치">
    김치
    <br>
    <input type="checkbox" name="foodList" value="바나나">
    바나나
    <br>

    <input type="date" name="startDate">
    <br>
    <input type="datetime-local" name="endDateTime">

    <br>
    <input type="checkbox" name="expired" value="true">
    expired

    <br>
    <input type="number" name="score" value="0">
    <br>

    <button>전달</button>
</form>

</body>
</html>
