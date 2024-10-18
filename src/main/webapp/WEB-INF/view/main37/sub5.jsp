<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <style>
        table {
            border-collapse: collapse;
            width: 50%;
        }

        th, td {
            border: 1px solid black;
        }
    </style>
    <title>37-5</title>
</head>
<body>
<c:if test="${not empty message}">
    <h5 style="background-color: lightcyan">${message}</h5>
</c:if>

<h3>새 고객 입력</h3>
<form method="post">
    <div>
        이름
        <input type="text" name="name">
    </div>
    <div>
        도시
        <input type="text" name="city">
    </div>
    <div>
        국가
        <input type="text" name="country">
    </div>
    <div>
        <button>저장</button>
    </div>
</form>
<hr>
<%--<h3>고객 정보 삭제</h3>--%>
<%--<form method="post">--%>
<%--    <div>--%>
<%--        고객 번호--%>
<%--        <input type="number" step="1" name="id">--%>
<%--        <button>삭제</button>--%>
<%--    </div>--%>
<%--</form>--%>
<%--<hr>--%>
<table>
    <thead>
    <tr>
        <th>번호</th>
        <th>이름</th>
        <th>도시</th>
        <th>국가</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customerList}" var="customer">
        <%--      이 customerList는 어디서 불러오는거지--%>
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.city}</td>
            <td>${customer.country}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
