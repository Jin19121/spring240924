<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>26-1</title>
</head>
<body>
<h3>카테고리별 상품 조회</h3>
<form>
    <select name="categoryId" id="">
        <%--      <option value="1">Beverages</option>--%>
        <%--      <option value="2">Condiments</option>--%>
        <%--      <option value="3">Confections</option>--%>
        <option value="0">전체</option>
        <c:forEach items="${categoryList}" var="category">
            <option value="${category.id}"
                ${param.categoryId==category.id ? 'selected': ''}>
                    ${category.name}</option>
        </c:forEach>
    </select>
    <br>
    <div style="border: 1px solid black; margin: 10px;">
        <h4>정렬 조건</h4>
        <input type="radio" name="order" value="name" id="order1" ${param.order=='name'?'checked':''}>
        <label for="order1">상품명</label>
        <input type="radio" name="order" value="price" id="order2" ${param.order=='price'?'checked':''}>
        <label for="order2">가격</label>
    </div>
    <button>조회</button>
</form>
<hr>
<c:if test="${not empty productList}">
    <table>
        <thead>
        <tr>
            <th>번호</th>
            <th>삼풍명</th>
            <th>공급자 번호</th>
            <th>카테고리 번호</th>
            <th>단위</th>
            <th>가격</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productList}" var="product">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.supplierId}</td>
                <td>${product.categoryId}</td>
                <td>${product.unit}</td>
                <td>${product.price}</td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</c:if>
</body>
</html>
