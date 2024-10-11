<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>28-10</title>
</head>
<body>
<h3>고객 조회 후 수정</h3>
<form action="">
    고객 번호
    <input type="number" name="id" value="${param.id}">
    <button>조회</button>

    <hr>
    <c:if test="${empty customer}">
        <h5>조회 결과가 없습니다.</h5>
    </c:if>
    <c:if test="${not empty customer}">
    <div>
        <input type="number" name="id" readonly value="${customer.id}">
    </div>
    <div>
        <input type="text" name="customerName" readonly value="${customer.customerName}">
    </div>
    <div>
        <input type="text" name="contactName" readonly value="${customer.contactName}">
    </div>
    <div>
        <input type="text" name="address" readonly value="${customer.address}">
    </div>
    <div>
        <input type="text" name="city" readonly value="${customer.city}">
    </div>
    <div>
        <input type="text" name="postalCode" readonly value="${customer.postalCode}">
    </div>
    <div>
        <input type="text" name="country" readonly value="${customer.country}">
    </div>
    <div>
        <button>저장</button>
    </div>
</form>
</c:if>
</body>
</html>
