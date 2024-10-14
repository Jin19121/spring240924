<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>29-9</title>
</head>
<body>
<c:if test="${not empty message}">${message}</c:if>
<h3>새 책 등록</h3>
<form action="/main29/sub10" method="post">
    <div>
        등록 번호:
        <input type="text" name="isbn">
    </div>
    <div>
        책 제목:
        <input type="text" name="title">
    </div>
    <div>
        저자:
        <input type="text" name="author">
    </div>
    <div>
        책 가격:
        <input type="number" step="0.01" name="price">
    </div>
    <div>
        출판일:
        <input type="date" name="published">
    </div>
    <button>등록</button>
</form>
</body>
</html>
