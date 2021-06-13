<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/4/7
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>
    <form  action="${pageContext.request.contextPath}/addProductServlet" method="post">
        <%--只有设置了 name 属性的表单元素才能在提交表单时传递它们的值，
        因为服务端获取表单提交的数据是通过表单元素的 name 属性的值而得到的，没有 name 属性就无法得到表单元素提交给服务端的值--%>
        商品<input type="text" name="pname" >
        价格<input type="text" name="pprice" >
        <input type="submit" name="添加">
    </form>
</body>
</html>
