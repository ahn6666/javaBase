<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/20
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--foreach:相当于java代码的for 语句
i. 完成重复的操作
for(int i=0;i<10;i++)
属性：begin:开始值
end:结束值
var：临时变量
step:步长
varStatus:循环状态对象
count:循环次数，从1开始--%>
        <h4>foreach 完成重复的操作</h4>
      <f:forEach begin="1" end="10" step="2" var="i" varStatus="s">
          ${i} ${s.count} ${s} ${s.current} <br>
      </f:forEach>

            <%--遍历容器
            for(user user:list)
            属性：
            items：容器对象
            var:容器中元素的临时变量
            varStatus:循环状态对象
            index:容器中元素的索引，从0开始
            count :循环次数，从1开始--%>
        <h4>foreach 遍历容器</h4>
        <%
            List arrayList = new ArrayList();
            arrayList.add("aaa");
            arrayList.add("bbb");
            request.setAttribute("list",arrayList);
        %>
        <f:forEach items="${list}" var="l" varStatus="s" >
            ${l} ${s.count} ${s.index}<br>
        </f:forEach>

</body>
</html>
