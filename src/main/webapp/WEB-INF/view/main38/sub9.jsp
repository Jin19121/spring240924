<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>38-9</title>
</head>
<body>
<h3>직원 정보 검색 및 수정</h3>
<form action="/main38/sub9" method="get">
    <div>
        <h5>직원 ID
            <input type="text" name="id" value="${employee.id}">
            <button>검색</button>
        </h5>
    </div>
</form>
<c:if test="${empty employee}">
    <h5>유요하지 않은 번호입니다.</h5>
</c:if>
<hr>
<c:if test="${not empty employee}">
    <form action="/main38/sub10" method="post">
        <div>직원 번호
            <input type="number" name="id" value="${employee.id}" readonly>
        </div>
        <div>이름
            <input type="text" name="firstName" value="${employee.firstName}">
        </div>
        <div>성
            <input type="text" name="lastName" value="${employee.lastName}">
        </div>
        <div>생년월일
            <input type="date" name="birthDate" value="${employee.birthDate}">
        </div>
        <div>사진
            <input type="text" name="photo" value="${employee.photo}">
        </div>
        <div>비고
            <input type="text" name="notes" value="${employee.notes}">
        </div>
        <div>
            <button>저장</button>
        </div>
    </form>
</c:if>
</body>
</html>
