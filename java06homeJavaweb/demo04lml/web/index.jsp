<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/4/10
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
        <div style="margin-top: 200px; margin-left: 300px;width: 500px;background: aqua;height: 200px;">
            <h1 style="margin-left: 90px">登录页面</h1>
            <%--验证登录--%>
            <form action="${pageContext.request.contextPath}/checkServlet" method="post" style="margin-left: 80px">
                姓名<input type="text" name="name" value="${name}"><br>
                密码<input type="password" name="password" value="${password}"><br><br>
                <input type="submit" value="登录"> <a href="regist.jsp">注册</a><br>
                ${mgs}
            </form>

        </div>

</body>
</html>
