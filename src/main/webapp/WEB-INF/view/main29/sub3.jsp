<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>29-3</title>
</head>
<body>
<h3>데이터 타입별 입력</h3>
<form action="/main29/sub4" method="post">
    <div>
        <input type="text" name="val1" value="some data12">
    </div>
    <div>
        <input type="number" step="1" name="val2" value="456789">
    </div>
    <div>
        <input type="number" step="0.01" name="val3" value="7890.12">
    </div>
    <div>
        <input type="date" name="val4" value="2024-10-14">
    </div>
    <div>
        <input type="datetime-local" name="val5" value="2024-10-14 12:08:12">
    </div>
    <div>
        <button>전송</button>
    </div>

</form>
</body>
</html>
