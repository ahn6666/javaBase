<%@ page import="el.use" %>
<%@ page import="java.util.Date" %>
<%@ page import="javax.xml.crypto.Data" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>

<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/20
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/day01jqBase;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h5>获取对象</h5>
    <%
        use use = new use();
        use.setName("张三");
        use.setAge(18);
        use.setBir(new Date());
        request.setAttribute("u",use);
    %>
    <%--通过的是对象的属性来获取
        setter或getter方法，去掉set或者get，在将剩余部分，首字母变为小写
        setName->name
        --%>
    <h5>获取对象的值</h5>
    ${requestScope.u.name};
    <br>
    ${requestScope.u.age};
    <br>
    ${requestScope.u.bir};<br>
    ${u.bir.month};
    <br>
    ${u.birthday};


     <h4>通过list获取值</h4>
    <%
        ArrayList arrayList = new ArrayList();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add(use);
        request.setAttribute("list",arrayList);
    %>
    ${requestScope.list};
    <br>
    ${requestScope.list[0]};<br>
    ${requestScope.list[1]};<br>
    ${requestScope.list[2]};<br>
    ${requestScope.list[2].age};<br>
    <!-- 并不会报错 -->
    ${requestScope.list[3]};<br>

    <h4>通过MAP获取值  有两种形式</h4>
    <%
        Map map = new HashMap();
        map.put("na","王五");
        map.put("sex","男");
        map.put("use",use);
        request.setAttribute("map",map);
    %>
    ${requestScope.map.na};<br>
    <h8>这是第一种</h8><br>
    ${requestScope.map.sex};<br>
    <h8>这是第二种</h8><br>
    ${requestScope.map["sex"]};<br>
    ${requestScope.map.use};
</body>
</html>
