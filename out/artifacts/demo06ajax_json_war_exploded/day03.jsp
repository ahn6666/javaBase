<%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<script src="jquery-3.3.1.min.js"></script>
<script>
    function func() {
     //$.get||post方式
        /*$.get("day01","username=tom",function (a) {
            alert(a);
        },"text")*/
        $.post("day01","username=tom",function (a) {
            alert(a);
        },"text")
    }
</script>
<body>
<input value="发送异步请求" type="button" onclick="func()">
<input >
</body>
</html>