package demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *urL：serVerl访问路径
 */
//第一种
@WebServlet({"/day5","/dd5","/ddd5"})
    //第二种
//    @WebServlet("/user/d5")
//    @WebServlet("/user/*")
    //第三种
//    @WebServlet("*.do")
public class day05urlpatten extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo05  url环境变量配置");
        System.out.println(req);
    }
}
