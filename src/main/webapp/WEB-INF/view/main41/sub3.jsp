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
<%--form 요소들--%>
<input type="text" class="form-control">
<input type="number" class="form-control">
<input type="date" class="form-control">
<input type="datetime-local" class="form-control">
<textarea class="form-control" name="" id="" cols="30" rows="10"></textarea>
<input type="text" class="form-control">

<hr>

<label class="form-label" for="input1">이름</label>
<input class="form-control" type="text" id="input1">

<label class="form-label" for="input2">주소</label>
<input class="form-control" type="text" id="input2">

<hr>
<%--select--%>
<select class="form-select" name="" id="">
    <option value="">Lorem.</option>
    <option value="">Ipsa.</option>
    <option value="">Dolorem?</option>
    <option value="">Commodi!</option>
    <option value="">Doloribus?</option>
</select>

<hr>
<%--checkbox, radio button--%>
<div class="form-check">
    <input class="form-check-input" type="checkbox" id="check1">
    <label class="form-check-label" for="">check1</label>
</div>
<div class="form-check">
    <input class="form-check-input" type="radio" id="check2">
    <label class="form-check-label" for="">check2</label>
</div>
<div class="form-check form-switch">
    <input class="form-check-input" type="radio" id="check3">
    <label class="form-check-label" for="">check3</label>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
        integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
        crossorigin="anonymous"></script>
</body>
</html>
