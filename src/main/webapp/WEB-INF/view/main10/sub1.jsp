<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main10.sub1</title>
</head>
<body>
<%--javaBeans의 get 메소드 사용시
    get 빼고 앞글자를 소문자, () 제거 --%>
<%--map과 같은 문법--%>
<%--property(속성) : id, name, email (주로 필드명=속성명)
    즉, get/set메소드와 같다.--%>
<p>${student.id}</p>
<p>${student.name}</p>
<p>${student.email}</p>
<hr>
<p>${student["id"]}</p>
<p>${student["name"]}</p>
<p>${student["email"]}</p>

<hr>
<%--선호되지 않는 문법--%>
<p>${student.getId()}</p>
<p>${student.getName()}</p>
<p>${student.getEmail()}</p>
</body>
</html>
