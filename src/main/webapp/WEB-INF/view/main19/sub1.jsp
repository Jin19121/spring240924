<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>19-1</title>
</head>
<body>
<h3>/main19/sub1.jsp</h3>
<%--action: request parameters가 전달되는 위치
            , 생략하면 주소창에 작성된 주소를 이용--%>
<form>
    <input type="text" name="address" value="서울">
    <br>
    <input type="text" name="nick" value="수도">
    <br>
    <%--submit 버튼
submit 버튼 클릭 시
 : action 속성(attribute)에 명시된 위치로 method 속성(attribute) 방식으로
   form 요소들의 name=value 쌍이 전달됨--%>
    <%--    ex) address = 서울--%>
    <button>제출</button>
</form>
<hr>
<form action="/main19/sub2">
    <input type="text" name="name" value="흥민">
    <br>
    <input type="text" name="age" value="44">
    <br>
    <button>제출</button>
</form>

<hr>
<form action="">
    <input type="text" name="food" value="pizza">
    <br>
    <input type="text" name="email" value="yahoo">
    <br>
    <input type="text" name="city" value="인천">
    <br>
    <button>전송</button>
</form>
<hr>
<form action="/main19/sub4">
    <input type="text" name="name" value="흥민">
    <br>
    <select name="food" id="">
        <option value="pizza">val1</option>
        <option value="coffee">val2</option>
        <option value="burger">val3</option>
    </select>
    <br>
    <textarea name="memo" id="" cols="30" rows="10">random letters</textarea>
    <br>
    <button>전송</button>
</form>

<hr>
<form action="/main19/sub5">
    <input type="checkbox" name="city" id="" value="seoul">
    Lorem.
    <br>
    <input type="checkbox" name="city" id="" value="busan">
    Nisi
    <br>
    <input type="checkbox" name="city" id="" value="jeju">
    Cupidtate
    <br>
    <button>전송</button>
</form>

<hr>
<%--체크박스에 value가 없는 경우--%>
<form action="/main19/sub6">
    <input type="checkbox" name="accept">
    동의합니다
    <br>
    <button>전송</button>
</form>

<hr>
<form action="main19/sub7">
    <input type="radio" name="location" id="" value="gangnam">
    Lorem.
    <br>
    <input type="radio" name="location" id="" value="sinchon">
    Amet.
    <br>
    <input type="radio" name="location" id="" value="hongdae">
    Illo.
    <br>
    <button>location 결정</button>
</form>

<hr>
<form action="/main19/sub8">
    <input type="date" name="birth">
    <br>
    <input type="datetime-local" name="now">
    <br>
    <input type="hidden" name="some" value="some value">
    <br>
    <button>전송</button>
</form>

<hr>
<form action="/main19/sub10">
    <input type="text" name="address" value="서울">
    <br>
    <br>
    <input type="checkbox" name="foods" id="" value="coffee">
    커피
    <br>
    <input type="checkbox" name="foods" id="" value="water">
    물
    <br>
    <input type="checkbox" name="foods" id="" value="tea">
    차
    <br>
    <br>
    <input type="radio" name="choice" id="sel1">
    1번
    <br>
    <input type="radio" name="choice" id="sel 2">
    2번
    <br>
    <input type="radio" name="choice" id="sel 3">
    3번
    <br>
    <br>
    <input type="date" name="birthDate" id="">
    <br>
    <input type="datetime-local" name="startDateTime">
    <br>
    <br>
    <select name="select" id="">
        <option value="some1">선택1</option>
        <option value="some2">선택2</option>
        <option value="some3">선택3</option>
    </select>
    <br>
    <textarea name="note" id="" cols="30" rows="10">Lorem ipsum dolor.</textarea>
    <br>
    <button>전송</button>
</form>
</body>
</html>
