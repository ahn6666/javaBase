package cn.ling;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( "/demo03ServletWrite")
public class demo03ServletWrite extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     //纯粹是偶然 只是这是了服务器是gbk和浏览器刚好对应上罢了
        //   response.setCharacterEncoding("gbk");
        //通过设置响应头，比较麻烦
//        response.setHeader("content-type","text/html;charset=utf-8");
        //简单方法
        response.setContentType("text/html;charset=utf-8");

        //获取输出对象

        PrintWriter w = response.getWriter();
        //写入
        w.write("你好");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                this.doPost(request,response);
    }
}
