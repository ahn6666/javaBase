<%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<script src="jquery-3.3.1.min.js"></script>
<script>
    function func() {
     //$ajax方式
        $.ajax({
            url:"day01",
            type:"POST",
            // data:"username=zhangdan&age=23",//请求参数
            data:{"username":"zhangsan","age":23},//请求参数 json方式
            success:function (data) {
                alert(data);
            },//响应成功后的回调函数
            error:function () {
                alert("出错了")
            },
            dataType:"text"//响应的数据格式
        })
    }
</script>
<body>
<input value="发送异步请求" type="button" onclick="func()">
<input >
</body>
</html>