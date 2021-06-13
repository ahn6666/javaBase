package cn.ling;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//进行测验重定向，这和转发是不一样的
@WebServlet( "/demo01Servlet")
public class demo01Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //    设置响应行中的响应码
            response.setStatus(302);
            //设置响应头 用location
            response.setHeader("location","demo02Servlet");
//              response.sendRedirect("demo02Servlet");
        //测试是否共享
        request.setAttribute("mgs","message");
        //可以进行简写



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request,response);
    }
}
