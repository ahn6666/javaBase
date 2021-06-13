package demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servletdemo03")
public class Servletdemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //演示获取请求头数据 user-agent
        String header = request.getHeader("user-agent");
        System.out.println(header);
        if (header.contains("Chrome"))
        {
            System.out.println("谷歌来了....");
        }if (header.contains("Firefox"))
        {
            System.out.println("火狐来了");
        }
        {
            System.out.println("狼来了");
        }
    }
}
