<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>28-12</title>
</head>
<body>
<h3>직원 정보 조회 및 수정</h3>
<form>
    직원 번호
    <input type="number" name="id" value="${param.id}">
    <button>조회</button>
</form>
<hr>
<c:if test="${empty employee}">
    <h5>유효하지 않은 직원 번호입니다.</h5>
</c:if>
<c:if test="${not empty employee}">
    <form action="/main28/sub11" method="post">
        <div>
            직원 번호:
            <input type="number" readonly name="id" value="${employee.id}">
        </div>
        <div>
            직원 성씨:
            <input type="text" name="firstName" value="${employee.firstName}">
        </div>
        <div>
            직원 이름:
            <input type="text" name="lastName" value="${employee.lastName}">
        </div>
        <div>
            직원 생일:
            <input type="text" name="birthDate" value="${employee.birthDate}">
        </div>
        <div>
            직원 사진:
            <input type="text" name="photo" value="${employee.photo}">
        </div>
        <div>
            직원 비고:
            <input type="text" name="notes" value="${employee.notes}">
        </div>
        <div>
            <button>수정 저장</button>
        </div>
    </form>
</c:if>
</body>
</html>
