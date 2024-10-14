<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>29-5</title>
</head>
<body>
<h3>자료입력</h3>
<form action="/main29/sub6" method="post">
    <div>
        <input type="text" name="title">
    </div>
    <div>
        <input type="number" name="price" step="1">
    </div>
    <div>
        <input type="number" name="score" step="0.1">
    </div>
    <div>
        <input type="date" name="published">
    </div>
    <div>
        <input type="datetime-local" name="inserted">
    </div>
    <div>
        <button>전송</button>
    </div>
</form>
</body>
</html>