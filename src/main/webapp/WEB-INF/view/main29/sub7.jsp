<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>29-7</title>
</head>
<body>
<h3>새 책 입력 프로그램</h3>
<form action="/main29/sub8" method="post">
    <div>
        <input type="text" name="isbn" placeholder="등록번호">
    </div>
    <div>
        <input type="text" name="title" placeholder="제목">
    </div>
    <div>
        <input type="text" name="author" placeholder="저자">
    </div>
    <div>
        <input type="number" step="0.5" name="price" placeholder="00.00">
    </div>
    <div>
        <input type="date" name="published">
    </div>
    <button>등록</button>
</form>
</body>
</html>
