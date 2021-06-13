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

        <table align="center" border="2" cellpadding="20" cellspacing="2" >

            <tr>
                <td>编号</td>
                <td>姓名</td>
                <td>性别</td>
                <td>年龄</td>
            </tr>

            <c:forEach var="list" varStatus="s" items="${list}">
                <c:if test="${s.count%2==0}">
                    <tr bgcolor="#7fffd4">
                        <td>${s.count}</td>
                        <td>${list.name}</td>
                        <td>${list.age}</td>
                        <td>${list.birthday}</td>
                    </tr>
                </c:if>
                <c:if test="${s.count%2==1}">
                        <td>${list.age}</td>
                        <td>${list.birthday}</td>
                    </tr>
                </c:if>
            </c:forEach>
        </table>
</body>
</html>
