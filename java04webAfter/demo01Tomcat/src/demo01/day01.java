package demo01;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
//运行方式http://localhost:8080/demo01Tomcat/day01
@WebServlet("/day01")
public class day01 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("启动了");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
