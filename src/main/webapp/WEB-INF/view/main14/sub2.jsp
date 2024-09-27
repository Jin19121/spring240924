<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>main14/sub2</title>
    <style>
        table, th, td {
            border: 2px solid black;
        }

        table {
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<p>이름: ${actor.name}</p>
<p>소속사: ${actor.agency}</p>
<p>생일: ${actor.birth}</p>
<p>성격유형: ${actor.MBTI}</p>
<p>출연작
<ul>
    <c:forEach items="${actor.works}" var="title">
        <li>${title}</li>
    </c:forEach>
</ul>
</p>

<hr>

<table>
    <thead>
    <tr>
        <th>이름</th>
        <th>소속사</th>
        <th>생일</th>
        <th>성격유형</th>
        <th>출연작</th>
    </tr>
    </thead>
    <c:forEach items="${actorList}" var="actor">
        <tr>
            <td>${actor.name}</td>
            <td>${actor.agency}</td>
            <td>${actor.birth}</td>
            <td>${actor.MBTI}</td>
            <td>
                <ul>
                    <c:forEach items="${actor.works}" var="title">
                        <li>${title}</li>
                    </c:forEach>
                </ul>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
