<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main13/sub1</title>
</head>
<body>
<p>main13/sub1.jsp</p>
<p>${attr1}</p>

<%--EL implicit objects--%>
<%--param: request parameter를 map으로 담은 객체--%>
<%--name=흥민&age=33--%>
<p>${param.name}</p>
<p>${param.age}</p>

<%--?address=seoul&city=jeju--%>
<p>${param["address"]}</p>
<p>${param.city}</p>

<p>${param.email}</p>
<p>${param.hobby}</p>
<p>${param.score}</p>
<p>${param.location}</p>

<h5>paramValues</h5>
<%--paramValue: request parameter의 값들을 배열로 map에 넣음--%>
<%--?email=gmail&city=seoul --%>
<p>${param.email}</p>
<p>${paramValues.email[0]}</p>
<p>${param.city}</p>
<p>${paramValues.city[0]}</p>

<%--?hobby=축구&hobby=야구&hobby=농구&score=9.9&score=8/8--%>
<p>${paramValues.hobby[0]}</p>
<p>${paramValues.hobby[1]}</p>
<p>${paramValues.hobby[2]}</p>
<p>${paramValues.score[0]}</p>
<p>${paramValues.score[1]}</p>
<p>${param.hobby}</p>
<p>${param.score}</p>

<%--직접 쿼리스트링 작성 후 요청 보내보기--%>
<p>${paramValues.player[0]}</p>
<p>${paramValues.player[1]}</p>
<p>${paramValues.player[2]}</p>
<p>${paramValues.teams[0]}</p>
<p>${paramValues.teams[1]}</p>


</body>
</html>
