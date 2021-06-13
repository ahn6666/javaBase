<%@ page import="domain.product" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/4/2
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="zh-CH">
  <head>
    <title>登录页面</title>
  </head>
  <body>
    <div style="width: 500px ;height: auto; margin-left: 400px;margin-top: auto">
      <h4>您查询的信息如下</h4>
     <%--查询--%>
      <table cellspacing="5px" border="2px" bgcolor="#ffc0cb">

        <tr>
          <td>编号</td>
          <td>商品</td>
          <td>单价</td>
          <td><a href="addList.jsp">添加</a></td>
        </tr>
        <c:forEach items="${product.getList()}" var="p">
          <tr>
            <td>${p.id}</td>
            <td>${p.pname}</td>
            <td>${p.pprice}</td>
            <td><a href="${pageContext.request.contextPath}/deleteServlet?id=${p.id}">删除</a></td>
            <td><a href="${pageContext.request.contextPath}/selectByIdServlet?id=${p.id}">修改</a></td>
          </tr>
        </c:forEach>
      </table>

      <%--利用bootstrap组件设置的分页--%>
      <nav aria-label="Page navigation example">
        <ul class="pagination">
        <a class="page-link" href="${pageContext.request.contextPath}/pageServlet?currentPage=1&rows=5">首页</a>
          <a class="page-link" href="${pageContext.request.contextPath}/pageServlet?currentPage=${product.currentPage-1}&rows=5" aria-label="Previous">
            <span aria-hidden="true">&laquo;</span>
          </a>
          <c:forEach begin="1" end="${product.totalPage}" var="i" >
          <a class="page-link" href="${pageContext.request.contextPath}/pageServlet?currentPage=${i}&rows=5">${i}</a>
          </c:forEach>
          <a class="page-link" href="${pageContext.request.contextPath}/pageServlet?currentPage=${product.currentPage+1}&rows=5" aria-label="Next">
            <span aria-hidden="true">&raquo;</span>
          </a>
          <a class="page-link" href="${pageContext.request.contextPath}/pageServlet?currentPage=${product.totalPage}&rows=5">尾页</a>
          总共${product.totalCount}条/总共${product.totalPage}页
        </ul>
      </nav>
    </div>
  </body>
</html>
