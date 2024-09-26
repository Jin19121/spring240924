<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main9/sub1</title>
</head>
<body>
<%--element 명 tab : 자동완성--%>
<h1></h1>
<p></p>
<div></div>
<%-- p+div --%>
<p></p>
<div></div>
<%--h1+p--%>
<h1></h1>
<p></p>

<%-- > 자식 셀렉터 --%>
<div>
    <p></p>
</div>

<%-- h1>span --%>
<h1>
    <span></span>
</h1>

<%-- # --%>
<%--h1#head1--%>
<h1 id="head"></h1>

<%--h1#head2>p#para1--%>
<h1 id="head2">
    <p id="para1"></p>
</h1>

<%--h1#head3+h2#sub1--%>
<h1 id="head3"></h1>
<h2 id="sub1"></h2>

<%--div#box1--%>
<div id="box1"></div>

<%--.--%>
<%--h1.head--%>
<h1 class="head"></h1>
<%--h1.head.note--%>
<h1 class="head note"></h1>

<%--[]--%>
<%--h1[title]--%>
<h1 title=""></h1>

<%--h1[title="my head"]--%>
<h1 title="my head"></h1>

<%--input[value="hello"][name="message"][title="input"]--%>
<input type="text" value="hello" name="message" title="input">

<%--*--%>
<%--p*3--%>
<p></p>
<p></p>
<p></p>

<%--table>tr*3>td*4--%>
<table>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
</table>

<%--^--%>
<%--div>h1>span^p--%>
<div>
    <h1>
        <span></span>
    </h1>
    <p></p>
</div>

<%--table>thead>tr>th*4^^tbody>hr*3>td*4--%>
<table>
    <thead>
    <tr>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <hr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <hr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <hr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    </tbody>
</table>

<%--lorem 아무글씨--%>
Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet debitis dicta dolor esse eum eveniet laudantium quod
repellendus sequi tempore! Ab distinctio ducimus est illo nobis non quod sequi suscipit.

<%--lorem3--%>
Lorem ipsum dolor.

<%--table>thead>tr>th*4>lorem1^^^tbody>tr*3>th*4>lorem1--%>
<table>
    <thead>
    <tr>
        <th>Lorem.</th>
        <th>Alias.</th>
        <th>Laudantium.</th>
        <th>Nesciunt.</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th>Lorem.</th>
        <th>Possimus?</th>
        <th>Numquam!</th>
        <th>Reiciendis.</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Rem?</th>
        <th>Enim!</th>
        <th>Maiores!</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Sequi?</th>
        <th>Sequi!</th>
        <th>Eveniet.</th>
    </tr>
    </tbody>
    <tbody>
    <tr>
        <th>Lorem.</th>
        <th>Quaerat!</th>
        <th>Error!</th>
        <th>Ullam!</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Illo.</th>
        <th>Neque!</th>
        <th>Odio.</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Cum.</th>
        <th>Quo.</th>
        <th>Voluptatum!</th>
    </tr>
    </tbody>
    <tbody>
    <tr>
        <th>Lorem.</th>
        <th>Maiores?</th>
        <th>Numquam!</th>
        <th>Facere?</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Minus!</th>
        <th>Facilis.</th>
        <th>Nulla.</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Dolores.</th>
        <th>Est.</th>
        <th>Iure?</th>
    </tr>
    </tbody>
    <tbody>
    <tr>
        <th>Lorem.</th>
        <th>Quaerat!</th>
        <th>Incidunt.</th>
        <th>Perferendis.</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Molestiae.</th>
        <th>Animi!</th>
        <th>Corporis!</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Rerum?</th>
        <th>Sit.</th>
        <th>Eius!</th>
    </tr>
    </tbody>
</table>

<%--$--%>
<%--h1#header$*3--%>
<h1 id="header1"></h1>
<h1 id="header2"></h1>
<h1 id="header3"></h1>
<%--h1.note$*3--%>
<h1 class="note1"></h1>
<h1 class="note2"></h1>
<h1 class="note3"></h1>

<%--{}--%>
<%--h1{hello world}--%>
<h1>hello world</h1>

<%--div{$}*5--%>
<div>1</div>
<div>2</div>
<div>3</div>
<div>4</div>
<div>5</div>

<%--() group--%>
<%--(h1>p)*3--%>
<h1>
    <p></p>
</h1>
<h1>
    <p></p>
</h1>
<h1>
    <p></p>
</h1>

</body>
</html>
