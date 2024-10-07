<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>24-2</title>
    <style>
        td, th {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<table style="border-collapse: collapse; width: 100%">
    <thread>
        <tr>
            <th>이름</th>
            <th>번호</th>
            <th>주소</th>
        </tr>
    </thread>


    <c:forEach items="${customerList}" var="customer">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.contactName}</td>
            <td>${customer.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
