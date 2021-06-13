
<%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<script>
    function func() {
        /*XMLHttpRequest 对象
    所有现代浏览器均支持 XMLHttpRequest 对象（IE5 和 IE6 使用 ActiveXObject）。
        XMLHttpRequest 用于在后台与服务器交换数据。这意味着可以在不重新加载整个网页的情况下，对网页的某部分进行更新。
        为了应对所有的现代浏览器，包括 IE5 和 IE6，请检查浏览器是否支持 XMLHttpRequest 对象。
        如果支持，则创建 XMLHttpRequest 对象。如果不支持，则创建 ActiveXObject ：*/
        var xmlhttp;
        if (window.XMLHttpRequest)
        {// code for IE7+, Firefox, Chrome, Opera, Safari
            xmlhttp=new XMLHttpRequest();
        }
        else
        {// code for IE6, IE5
            xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
        }
        /*2.建立连接
        * 参数：
        *   1.请求方式：get、post
        *   get方式：请求参数在url后边拼接，send方法为空参
        *   post方式：请求参数在send方法中定义
        *   2.请求的url
        *   3.同步或异步请求：true(异步)或false（同步)
        * */
        xmlhttp.open("GET","day01?username=tom",true);
        //发送请求
        xmlhttp.send();
        //接收并处理来自服务器的响应结果
        //服务器响应成功以后再获取
        //当xmlhttp对象的就绪状态改变时，触发事件ononreadystatechange
       xmlhttp.onreadystatechange=function()
        {
            if (xmlhttp.readyState==4 && xmlhttp.status==200)
            {
                //获取服务器的响应结果
                var r = xmlhttp.responseText;
                alert(r)

                document.getElementById("myDiv").innerText=xmlhttp.responseText;
            }
        }
    }
</script>
<body>
        <input value="发送异步请求" type="button" onclick="func()">
        <input >
</body>
</html>