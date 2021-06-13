
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <%String username=request.getParameter("username");%>
     <%String age=request.getParameter("age");%>
     <%String sex=request.getParameter("sex");%>
     <%String[] foods=request.getParameterValues("food");%>
     <% String fd="";
     if (foods!=null)
     {
         for (String food : foods) {
             fd=fd+","+food;
         }
     }

     %>
    <h1>欢迎你，
        <%= username%>
        您的姓名是：<%= age%><br/>
        年龄是：<%= sex%><br/>
        性别是：<%=age%><br/>
        喜欢吃的事物有:<%=fd%>

    </h1>
</body>
</html>
