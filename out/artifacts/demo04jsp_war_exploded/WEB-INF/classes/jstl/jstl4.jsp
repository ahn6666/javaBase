<%@ page import="java.util.ArrayList" %>
<%@ page import="el.use" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/22
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
            ArrayList arrayList = new ArrayList();
            arrayList.add(new use("张三",13,new Date()));
            arrayList.add(new use("李四",14,new Date()));
            arrayList.add(new use("王五",15,new Date()));
            arrayList.add(new use("蟹柳",16,new Date()));
            request.setAttribute("list",arrayList);
        %>

        <table align="center" width="20" border="2" >
            <tr>编号</tr>
            <tr>姓名</tr>
            <tr>年龄</tr>
            <tr>生日</tr>

            <c:forEach var="list" varStatus="s" items="${list}">
                <tr>${s.count}</tr>
                <tr>${list.name}</tr>
                <tr>${list.age}</tr>
                <tr>${list.birthday}</tr>

            </c:forEach>
        </table>
</body>
</html>
