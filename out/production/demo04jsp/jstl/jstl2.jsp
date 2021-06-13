<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/20
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/day01jqBase;charset=UTF-8" language="java" %>
<%@ taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--b. choose :相当于java代码的switch语句
i. 使用choose标签声明  相当于switch声明
ii. 使用when标签做判断  相当于case
使用otherwise标签做其他情况的声明   相当于default--%>
        <%
        request.setAttribute("number",10);
        %>
        <h3>星期？</h3>
        <d:choose>
            <d:when test="${number==1}">星期一</d:when>
            <d:when test="${number==2}">星期二</d:when>
            <d:when test="${number==3}">星期三</d:when>
            <d:when test="${number==4}">星期四</d:when>
            <d:when test="${number==5}">星期五</d:when>
            <d:when test="${number==6}">星期六</d:when>
            <d:when test="${number==7}">星期七</d:when>
            <d:otherwise>数字输入错误</d:otherwise>
        </d:choose>


</body>
</html>
