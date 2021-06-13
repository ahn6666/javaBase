package demo02Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/Servlet03Session")
public class Servlet03Session extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //创建对象
        HttpSession session = request.getSession();
        //创建共享数据
        //可以在客户端关闭还可以访问到
        //之后在专户servlet2中
        session.setAttribute("mgs","hello");
        Cookie cookie = new Cookie("JSESSIONID",session.getId());
        cookie.setMaxAge(60*600);
        response.addCookie(cookie);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
