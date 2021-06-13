<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/20
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--    jstl: if
    test 为必须的属性
    		a. if:相当于java代码的if语句
			i. 属性
				1) test 必须属性 接受boolean表达式
				2) 如果表达式为true 则显示if标签体内容，如果为false ，则不显示标签体内容
				3) 一般情况下，test 属性值会结合el表达式一起使用
			ii. 注意
c:if标签没有else情况，想要else情况，则可以再定义一个if
    --%>
    <c:if test="true">
        10<br>
    </c:if>
</body>
</html>
