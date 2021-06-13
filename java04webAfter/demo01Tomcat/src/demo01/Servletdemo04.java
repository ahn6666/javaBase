package demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//测验防钓鱼网站  //运行web/ http://localhost:8080/demo01Tomcat/servlet04.html
@WebServlet("/Servletdemo04")
public class Servletdemo04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String referer = request.getHeader("referer");
        System.out.println(referer);http://localhost:8080/demo01Tomcat/servlet04.html
        if (referer!=null)
        {
            if (referer.contains("/demo01Tomcat"))
            {
                System.out.println("播放电影....");
            }else
            {
                System.out.println("请跳转到优酷......");
            }
        }
    }
}
