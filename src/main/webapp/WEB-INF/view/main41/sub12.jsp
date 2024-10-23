<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<%--bootstrap grid--%>
<%--container : 화면 크기에 따라 적절한 너비를 갖게 됨--%>
<div class="container bg-success">
    <h1>Lorem.</h1>
</div>
<hr>
<div class="container bg-secondary-subtle h-50">
    <div class="row bg-success h-50">
        <div class="col-5 bg-info h-50"></div>
        <div class="col bg-warning h-50"></div>
        <div class="col bg-primary h-50">3</div>
    </div>
</div>

<hr>
<div class="container bg-secondary-subtle h-50">
    <div class="row bg-success h-50">
        <div class="col-3 col-sm-6 col-md-12 bg-info h-50"></div>
        <div class="col-6 col-sm-12 col-md-12 bg-warning h-50"></div>
        <div class="col-3 col-sm-6 col-md-12 bg-primary h-50">3</div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
        integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
        crossorigin="anonymous"></script>
</body>
</html>
