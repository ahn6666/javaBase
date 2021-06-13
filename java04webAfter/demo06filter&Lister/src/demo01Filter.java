import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 过滤器快速入门
 */
/*@WebFilter("/*")//拦截所有的路径
public class demo01Filter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filter启动了");
        //放行
        chain.doFilter(req,resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}*/
