<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <style>
        .active {
            background-color: yellow;
        }
    </style>
    <title>27-5</title>
</head>
<body>
<h3>고객 정보 조회 (page: ${param.page})</h3>

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
<hr>
<div style="margin:10px;">
    <%--  방법 1, 2 있다는 거 참고
      1. a href = ${pageNumber}
      2. c:url로 걸기--%>
    <c:forEach begin="${beginPageNo}" end="${endPageNo}" var="pageNumber">
        <c:url value="/main27/sub5" var="Link">
            <c:param name="page" value="${pageNumber}"/>
        </c:url>
        <span class="${currentPageNo == pageNumber ? 'active' : ''}">
            <a href="${Link}">${pageNumber}</a>
        </span>
    </c:forEach>
</div>
</body>
</html>
