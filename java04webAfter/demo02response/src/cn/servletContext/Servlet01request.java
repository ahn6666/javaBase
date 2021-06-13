package cn.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet01request")
public class Servlet01request extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //ServletContext对象获取
        //通过request对象获取、或者通过HttpServlet获取
        ServletContext s1 = request.getServletContext();
        ServletContext s2 = this.getServletContext();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request,response);
    }
}


