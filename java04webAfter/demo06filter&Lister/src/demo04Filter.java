import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * 过滤器拦截路径配置
 */
//@WebFilter("/index.jsp")//1.具体路径拦截
//@WebFilter("/user/*")//2.拦截目录
//@WebFilter("/user/demo2Servlet")//2.1拦截目录
 // @WebFilter("*.jsp") //3.后缀名拦截

/*public class demo04Filter implements Filter {
    public void destroy() {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filter4启动了");


    }

    public void init(FilterConfig config) throws ServletException {

    }

}*/
