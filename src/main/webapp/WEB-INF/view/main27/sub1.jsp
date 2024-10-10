<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>27-1</title>
</head>
<body>
<h3>고객 번호로 고객 조회</h3>
<form>
    <input type="text" name="id" placeholder="고객 번호">
    <br>
    <button>조회</button>
</form>

<table>
    <thead>
    <tr>
        <th>번호</th>
        <th>고객명</th>
        <th>연락처상 명칭</th>
        <th>주소</th>
        <th>도시</th>
        <th>우편 번호</th>
        <th>국가</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customerList}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.customerName}</td>
            <td>${customer.contactName}</td>
            <td>${customer.address}</td>
            <td>${customer.city}</td>
            <td>${customer.postalCode}</td>
            <td>${customer.country}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
