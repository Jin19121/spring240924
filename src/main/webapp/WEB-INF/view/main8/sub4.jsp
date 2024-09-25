<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main8/sub4</title>
</head>
<body>
    <p>
      국적: ${countries[0]} <br>
      고향: ${islands[0]}<br>
      좌표: ${points[2]}<br>
    </p>
    <hr>
    <!-- html 주석: 응답에 포함됨 -->
    <%-- jsp 주석: 응답에 포함 안됨 --%>
    <%-- 단축키 ctrl +/ --%>
    <p>
      <%--        배열 인덱스로 문자열 사용 가능--%>
      ${countries["0"]}
      ${countries["1"]}
      ${countries[2]}
    </p>
</body>
</html>
