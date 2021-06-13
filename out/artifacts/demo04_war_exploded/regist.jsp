<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/4/10
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<div style="margin-top: 200px; margin-left: 300px;width: 500px;background: aqua;height: 200px;">
    <h1 style="margin-left: 90px">注册页面</h1>
    <%--验证登录--%>
    <form action="${pageContext.request.contextPath}/registServlet" method="post" style="margin-left: 80px">
        姓名<input type="text" name="name"><br>
        密码<input type="password" name="password"><br><br>
        <input type="submit" value="注册"></a><br>
    </form>
</div>
</body>
</html>
