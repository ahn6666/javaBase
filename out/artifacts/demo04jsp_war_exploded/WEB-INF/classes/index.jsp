<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/16
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%--
指令page：下的属性
charset 只是准备高级的解析器浏览器  pageEncoding 是比较低级的
 buffer 是缓冲大小 默认是8kb
 errorPage=是出错访问的页面
 is errorPage是访问页面是否也出错
import 是java导包
 --%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" errorPage="500.jsp"  language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- 访问：http://localhost:8080/demo04jsp --%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <%
        System.out.println("hello jsp");
      %>
      <%-- 可以定义的java代码--%>
      <%
        List a=new ArrayList();
        int b=3/0;

      %>
      <%-- 可以定义的成员变量和成员方法--%>
      <%! int i=5;  %>
      <%-- 定义的输出--%>
      <%= i %>


  </body>
</html>
