<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/16
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/day01jqBase;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<%-- true  输出错误  false  不输出错误 默认false--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h1>页面出错了测试index.jsp中的error page..</h1>
        <% String message = exception.getMessage();

            System.out.println(message);
        %>
</body>
</html>
