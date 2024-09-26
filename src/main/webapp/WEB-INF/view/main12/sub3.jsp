<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main12/sub3</title>
</head>
<body>
<%--el에서 사용가능한 연산자--%>
<%--산술연산자 +, -, *, /, %--%>
<p>산술 연산자</p>
<p>${3+3}</p>
<p>${5-2}</p>
<p>${4*3}</p>
<p>${3/2}</p>
<p>${10%3}</p>
<%--/, %는 키워드로도 연산할 수 있다.--%>
<p>${5 div 3}</p>
<p>${14 mod 5}</p>
<hr>
<p>${"3"+"3"}</p>

<hr>

<p>${num1-num2}</p>
<p>${num1/num3}</p>
<hr>

<%--비교연산자 == != < > <= >= --%>
<p>비교 연산자</p>
<p>${5==5}</p>
<p>${5 eq 5}</p>
<p>${5!=3}</p>
<p>${5 ne 3}</p>
<p>${5<3}</p>
<p>${5 lt 3}</p>
<p>${5>3}</p>
<p>${5 gt 3}</p>
<p>${6<=3}</p>
<p>${6 le 3}</p>
<p>${6>=3}</p>
<p>${6 ge 3}</p>
<hr>
<%--비교 연산 시 주의: 다른 타입끼리 연산 시 수로 변환 후 비교--%>
<p>${"12"<"6"}</p>
<p>${"ab"<"f"}</p>
<p>${12<6}</p>
<p>${"12"<6}</p>
<p>${12<"6"}</p>
<%--<p>${12<"six"}</p>--%>
<hr>
<%--논리 연산자 && || !--%>
<p>논리연산자</p>
<p>${true && true}</p>
<p>${true and true}</p>
<p>${false || false}</p>
<p>${false or false}</p>
<p>${!true}</p>
<p>${not true}</p>
<hr>

<p>empty</p>
<%--"", 길이가 0인 컬렉션(List, Set, Map), null이면 true--%>
<p>${empty ""}</p>
<p>${empty attr1}</p>
<p>${empty attr2}</p>
<p>${empty attr3}</p>
<p>${empty attr4}</p>
<p>${empty attr5}</p>
<hr>
<p>${attr2.size()==0}</p>
<p>${attr3.size()==0}</p>
<p>${attr4.size()==0}</p>
<hr>
<p>빈문자열, 빈콜렉션, null이 아닌지?</p>
<p>${not empty ""}</p>
<p>${not empty attr1}</p>
<p>${not empty attr2}</p>
<p>${not empty attr3}</p>
<p>${not empty attr4}</p>
<p>${not empty attr5}</p>
<hr>
<p>${attr2.size()>0}</p>
<p>${attr3.size()>0}</p>
<p>${attr4.size()>0}</p>
</body>
<hr>

<p>삼항연산자</p>
<%--삼항연산자 ? : --%>
<p>${true ?"hello":"world"}</p>
<p>${false ?"hello":"world"}</p>
</html>
