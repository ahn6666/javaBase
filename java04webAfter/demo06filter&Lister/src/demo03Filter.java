import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 过滤器执行流程
 */
/*@WebFilter("/*")//拦截所有的路径
public class demo03Filter implements Filter {
    public void destroy() {
        System.out.println("filter3销毁了...");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filter3启动了");
        //放行
        chain.doFilter(req,resp);
        System.out.println("filter3启动后回来了");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("filter开始了...");
    }

}*/
