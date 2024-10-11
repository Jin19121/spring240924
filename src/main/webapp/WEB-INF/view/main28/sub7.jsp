<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>28-7</title>
</head>
<body>
<h3>상품 조회</h3>
<form>
    <input type="number" placeholder="상품 번호" name="id" value="${product.id}">
    <button>조회</button>
</form>
<hr>
<c:if test="${not empty product}">
    <div>
        상품 번호:
        <input type="text" value="${product.id}">
    </div>
    <div>
        상품명:
        <input type="text" value="${product.name}">
    </div>
    <div>
        공급자 번호:
        <input type="text" value="${product.supplierId}">
    </div>
    <div>
        분류 번호:
        <input type="text" value="${product.categoryId}">
    </div>
    <div>
        단위:
        <input type="text" value="${product.unit}">
    </div>
    <div>
        가격:
        <input type="text" value="${product.price}">
    </div>
    <br>
    <div>
        <form action="/main28/sub8" method="post">
            <input type="hidden" name="id" value="${product.id}">
            <button>삭제</button>
        </form>
    </div>
</c:if>

<c:if test="${empty product}">해당 상품은 존재하지 않습니다.</c:if>
</body>
</html>
