<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>26-2</title>
</head>
<body>
<h3>국가별 고객 조회</h3>
<form>
    <select name="country" id="">
        <option value="0">전체</option>
        <c:forEach items="${countryList}" var="country">
            <option value="${country.countryName}"
                ${param.country==country.countryName ? 'selected':''}>
                    ${country.countryName}
            </option>
        </c:forEach>
    </select>
    <div style="border: 1px solid black; margin: 10px">
        <h5>정렬 조건</h5>
        <input type="radio" name="order" value="customerName" id="name1" ${param.order=='customerName'?'checked':''}>
        <label for="name1">고객명</label>
        <input type="radio" name="order" value="contactName" id="name2" ${param.order=='contactName'?'checked':''}>
        <label for="name2">연락처상 고객명</label>
        <input type="radio" name="order" value="customerID" id="blank" ${param.order=='customerID'?'checked':''}>
        <label for="blank">초기화</label>
    </div>
    <button>조회</button>
</form>
<c:if test="${not empty customerList}">
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
</c:if>
</body>
</html>
