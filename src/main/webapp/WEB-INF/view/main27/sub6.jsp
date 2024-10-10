<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>27-6</title>
</head>
<body>
<h3>주문 내역 조회(page: ${param.page})</h3>
<hr>
<table>
    <thead>
    <tr>
        <th>번호</th>
        <th>고객번호</th>
        <th>직원 전호</th>
        <th>주문일</th>
        <th>운송사 번호</th>
    </tr>
    </thead>
    <tbody style="text-align: center">
    <c:forEach items="${orderList}" var="order">
        <tr>
            <td>${order.orderId}</td>
            <td>${order.customerId}</td>
            <td>${order.employeeId}</td>
            <td>${order.orderDate}</td>
            <td>${order.shipperId}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<hr>
<div style="margin: 10px">
    <c:forEach begin="${beginPageNumber}" end="${endPageNumber}" var="pageNumber">
        <span class="${currentPageNumber == pageNumber?'active':''}"
              style="background-color: lightyellow">
            <a href="sub6?page=${pageNumber}">${pageNumber}</a>
        </span>
    </c:forEach>
</div>
</body>
</html>
