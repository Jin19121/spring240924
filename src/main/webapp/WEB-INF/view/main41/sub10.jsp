<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <style>
        span:nth-child(odd) {
            background-color: lightcyan;
        }

        span:nth-child(even) {
            background-color: paleturquoise;
        }

        div:nth-child(odd) {
            background-color: lightcyan;
        }

        div:nth-child(even) {
            background-color: paleturquoise;
        }

    </style>
</head>
<body>
<%--요소배치: inline(span, a), block(p, div, h1)--%>
<span class="m-3 p-3">Lorem.</span>
<span class="m-3 p-3">Quidem?</span>
<span class="m-3 p-3">Ipsum.</span>
<span class="m-3 p-3">Magnam!</span>
<span class="m-3 p-3">Facere.</span>
<hr>
<div class="m-3 p-3">Lorem ipsum dolor.</div>
<div class="m-3 p-3">Cupiditate eum, excepturi.</div>
<div class="m-3 p-3">Accusamus, eos, magni?</div>
<div class="m-3 p-3">Architecto, cum, vitae.</div>
<div class="m-3 p-3">A, porro, provident.</div>
<hr>
<%--flexbox--%>
<%--flex container--%>
<div style="display: flex; background-color: yellow">
    <%--  flex items: 가장 높은 높이, 오른쪽(옆)에 배치--%>
    <div class="m-3 p-3">1</div>
    <div class="m-3 p-3">2</div>
    <div class="m-3 p-3">3</div>
    <div class="m-3 p-3">1</div>
    <div class="m-3 p-3">2</div>
    <div class="m-3 p-3">3</div>
    <div class="m-3 p-3">1</div>
    <div class="m-3 p-3">2</div>
    <div class="m-3 p-3">3</div>
</div>
<hr>
<div style="display: flex; background-color: palevioletred; height: 300px;
justify-content: space-evenly;">
    <div>1</div>
    <div>2</div>
    <div>3</div>
    <div>4</div>
</div>
<hr>
<div style="display: flex; background-color: palevioletred; height: 300px;">
    <div style="flex-grow: 1">1</div>
    <div style="flex-grow: 3">2</div>
    <div style="flex-grow: 3">3</div>
    <div>4</div>
</div>
<hr>
<div style="display: flex; background-color: palevioletred; height: 300px;">
    <div style="flex: 1">1</div>
    <div style="flex: 3">2</div>
    <div style="flex: 3">3</div>
    <div>4</div>
</div>


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
        integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
        crossorigin="anonymous"></script>
</body>
</html>
