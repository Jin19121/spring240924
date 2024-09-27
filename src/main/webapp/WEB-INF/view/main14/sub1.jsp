<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>main14/sub1</title>
    <style>
        table, th, td {
            border: 2px solid cornflowerblue;
        }

        table {
            border-collapse: collapse;
            width: 60%;
        }

        thead {
            text-align: center
        }
    </style>
</head>
<body>
<c:forEach items="${list}" var="book">
    ${book.title}
    ${book.author}
    ${book.publisher}
    ${book.pages}
    ${book.price}
</c:forEach>

<table>
    <thead>
    <tr>
        <th>제목</th>
        <th>작가</th>
        <th>출판사</th>
        <th>페이지</th>
        <th>가격</th>
    </tr>
    </thead>
    <c:forEach items="${list}" var="book">
        <tr>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.publisher}</td>
            <td>${book.pages}</td>
            <td>${book.price}</td>
        </tr>
    </c:forEach>
</table>

<hr>

<table>
    <thead>
    <tr>
        <th>이름</th>
        <th>신장</th>
        <th>체중</th>
        <th>생일</th>
        <th>소속</th>
        <th>역할</th>
    </tr>
    </thead>
    <c:forEach items="${members}" var="i">
        <tr>
            <td>${i.name}</td>
            <td>${i.height}</td>
            <td>${i.weight}</td>
            <td>${i.birth}</td>
            <td>${i.team}</td>
            <td>${i.position}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
