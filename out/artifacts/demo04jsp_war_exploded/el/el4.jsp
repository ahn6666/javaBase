<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/20
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h4>	空运算符：empty
        </h4>
        <%
            ArrayList arrayList = new ArrayList();
            request.setAttribute("list",arrayList);
        %>
        ${empty requestScope.list}
        <h4>内置对象</h4>
        ${pageContext.request.contextPath}
</body>
</html>
