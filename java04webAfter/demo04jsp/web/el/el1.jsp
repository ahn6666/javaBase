<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/16
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/day01jqBase;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>获取域中的对象</title>
</head>
<body>
        ${3>4}

        <%
            request.setAttribute("name","张三");
            session.setAttribute("Sex","男");
        %>
        <h3>获取值</h3>
        ${requestScope.name}
        ${sessionScope.Sex}
</body>
</html>
