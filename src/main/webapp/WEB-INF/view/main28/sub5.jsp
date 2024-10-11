<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>28-5</title>
</head>
<body>
<h3>고객 조회</h3>
<form action="">
    <input type="number" placeholder="고객번호" name="id">
    <button>조회</button>
</form>
<hr>
<c:if test="${not empty customer}">
    <div>
        <input type="text" readonly="" value="${customer.id}">
    </div>
    <div>
        <input type="text" readonly="" value="${customer.customerName}">
    </div>
    <div>
        <input type="text" readonly="" value="${customer.contactName}">
    </div>
    <div>
        <input type="text" readonly="" value="${customer.address}">
    </div>
    <div>
        <input type="text" readonly="" value="${customer.city}">
    </div>
    <div>
        <input type="text" readonly="" value="${customer.postalCode}">
    </div>
    <div>
        <input type="text" readonly="" value="${customer.country}">
    </div>
    <div>
        <form action="/main28/sub6" method="post">
            <input type="hidden" name="id" value="${customer.id}">
            <button>삭제</button>
        </form>
    </div>

</c:if>
<c:if test="${empty customer}">
    <h4>해당 번호의 고객은 존재하지 않습니다.</h4>
</c:if>
</body>
</html>
