package demo01cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet04cookie")
public class Servlet04cookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //创建cookie对象
        //持久化存储
        Cookie s = new Cookie("mgs","setMaxAge");
        //设置响应
        //正数，存活时间
        s.setMaxAge(30);
        //0删除cookie信息
      //  s.setMaxAge(0);
        //默认 关闭浏览器就没有了
      //  s.setMaxAge(-1);
        response.addCookie(s);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
