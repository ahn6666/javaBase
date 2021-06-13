import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/demo05.jsp")
public class demo07Filter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("demo07Filter启动了");
        chain.doFilter(req, resp);
        System.out.println("demo07Filter启动回来了");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
