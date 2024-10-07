<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>24-3</title>
    <style>
        td, th {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<table style="border-collapse: collapse" width=100%>
    <thread>
        <tr>
            <th>번호</th>
            <th>이름</th>
            <th>성</th>
            <th>생년월일</th>
        </tr>
    </thread>
    <c:forEach items="${employeeList}" var="employee">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name1}</td>
            <td>${employee.name2}</td>
            <td>${employee.birthDate}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
