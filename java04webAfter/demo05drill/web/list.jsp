<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/12/22
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/day01jqBase;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>用户信息管理系统</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet"/>
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
    <script>
        function delectbyuserId(id) {
            //先弹窗
            if (confirm("您确定删除吗？"))
            {
                location.href= " ${pageContext.request.contextPath}/delectServlet?id="+id;
            }
        }
        window.onload=function () {
                //给表单添加点击时间
            document.getElementById("delectSelect").onclick=function () {
                if (confirm("您确定删除选中吗？")){
                    //判断是否提交表单
                    var flag=false;
                    var uid = document.getElementsByName("uid");
                    for (var i=0;i<uid.length;i++)
                    {
                       if( uid[i].checked)
                       {
                           flag=true;
                           break;
                       }
                    }
                    if (flag==true)
                    {
                        //获取表单提交
                        document.getElementById("delectID").submit();
                    }

                }

            }
            document.getElementById("firstID").onclick=function () {
                var uid = document.getElementsByName("uid");
                for (var i=0;i<uid.length;i++)
                {
                    uid[i].checked=this.checked;
                }
            }
        }
    </script>
</head>
<body>
<div class="container">
    <h3 style="text-align: center">用户信息列表</h3>

   <form action="${pageContext.request.contextPath}/findUserByPageServlet">
       <div style="float: left;margin: 10px">
           <span class="input-group-text">姓名</span>
           <input type="text" name="name" value="${conditon.name[0]}" >
           <span class="input-group-text">籍贯</span>
           <input type="text" name="address" value="${conditon.address[0]}">
           <span class="input-group-text">邮箱</span>
           <input type="text" name="email" value="${conditon.email[0]}">
           <button type="submit" value="查询" class="btn btn-default"  >查询</button>
       </div>
   </form>
    <div style="float: right ; margin: 5px " >
        <td colspan="8" align="center"><a class="btn btn-primary" href="add.jsp">添加联系人</a></td>
        <td colspan="8" align="center"><a class="btn btn-primary" href="javascript:void(0)" id="delectSelect">删除选中</a></td>
    </div>
    <form action="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${pageBean.currentPage}&rows=${pageBean.rows}&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}" id="delectID" method="post">
    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <td><input type="checkbox" id="firstID"></td>
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>籍贯</th>
            <th>QQ</th>
            <th>邮箱</th>
            <th>操作</th>
        </tr>
       <c:forEach items="${pageBean.list}" var="list" varStatus="s">
        <tr>
            <td><input type="checkbox" name="uid" value="${list.id}" ></td>
            <td>${s.count}</td>
            <td>${list.name}</td>
            <td>${list.gender}</td>
            <td>${list.age}</td>
            <td>${list.address}</td>
            <td>${list.qq}</td>
            <td>${list.email}</td>
            <td><a class="btn btn-default btn-sm" href="${pageContext.request.contextPath}/findUserServlet?id=${list.id}">修改</a>
                &nbsp;<a class="btn btn-default btn-sm" href="javascript:delectbyuserId(${list.id})">删除</a></td>
        </tr>
       </c:forEach>
    </table>
    </form>

    <nav aria-label="Page navigation example">
        <ul class="pagination">
            <c:if test="${pageBean.currentPage==1}">
                <li class=" disabled">
            </c:if>
            <c:if test="${pageBean.currentPage!=1}">
                <li>
            </c:if>
                <a class="page-link" href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${pageBean.currentPage-1}&rows=${pageBean.rows}&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}" aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                </a>
                </li>
            <c:forEach begin="1" end="${pageBean.totalPage}" var="i" >
                <c:if test="${pageBean.currentPage==i}">
            <li class="active"><a class="page-link" href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${i}&rows=5">${i}</a></li>
               </c:if>
                <c:if test="${pageBean.currentPage!=i}">
                <li><a class="page-link" href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${i}&rows=5&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}">${i}</a></li>
            </c:if>
            </c:forEach>

                <c:if test="${pageBean.currentPage==pageBean.totalPage}">
               <li class="disabled">
                   <a class="page-link" href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${pageBean.currentPage}&rows=${pageBean.rows} &name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}"aria-label="Next">
                       <span aria-hidden="true">&raquo;</span>
                   </a>
               </li>
                </c:if>

                    <c:if test="${pageBean.currentPage!=pageBean.totalPage}">
                <li>

                <a class="page-link" href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${pageBean.currentPage+1}&rows=5&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]} "aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                </a>
                </li>
                    </c:if>
            <div style="float: right ; margin: 3px;font-size: 20px">共${pageBean.totalCount}条记录，共${pageBean.totalPage}页</div>
        </ul>

    </nav>
</div>
</body>
</html>

