<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/16
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取域中的对象</title>
</head>
<body>

<%-- 运行路径 http://localhost/demo04jsp/el/el1.jsp --%>
<%
    session.setAttribute("name","李四");
    request.setAttribute("name","张三");
    session.setAttribute("Sex","男");
%>
<h3>获取值</h3>
${requestScope.name}
${sessionScope.Sex}
${sessionScope.desdfs}
<h3> 不使用域对象</h3>
${name}
<h3>session.setAttribute("name","李四");
    request.setAttribute("name","张三");
    session.setAttribute("Sex","男");


        request 的域比session的小
</h3>
</body>
</html>

