package demo01;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//运行方式：http://localhost:8080/demo01Tomcat/servlet08.html
@WebServlet( "/Servletdemo08")
public class Servletdemo08 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //通过request对象回去请求转发器对象
        System.out.println("88888888");
        //共享
        request.setAttribute("omg","hello");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Servletdemo07");
        requestDispatcher.forward(request,response);

        //获取
        ServletContext servletContext = request.getServletContext();
        System.out.println(servletContext);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
