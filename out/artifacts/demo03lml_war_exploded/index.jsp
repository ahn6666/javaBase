<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/3/18
  Time: 22:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>通过数据库的获取的信息</title>
  </head>
  <body>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/user?useSSL=false&serverTimezone=UTC", "root", "admin");
      PreparedStatement preparedStatement = connection.prepareStatement("select * from user");
      ResultSet rs = preparedStatement.executeQuery();
      while(rs.next())
      {

    %>
    姓名：<%=rs.getString("username")%>
    年龄：<%=rs.getString("sex")%>
    性别<%=rs.getInt("age")%><br/>
  <%
    }
      rs.close();
      preparedStatement.close();
  %>
  </body>
</html>