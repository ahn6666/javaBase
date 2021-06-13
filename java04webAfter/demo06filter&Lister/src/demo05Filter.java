import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 拦截方式配置：资源被访问的方式
 */
//@WebFilter(value ="/demo05.jsp",dispatcherTypes = DispatcherType.REQUEST)//浏览器直接请求index.jsp时，该过滤器会被执行
//@WebFilter(value ="/demo05.jsp",dispatcherTypes = DispatcherType.FORWARD)//浏览器转发inde.jsp 会被执行
//@WebFilter(value ="/demo05.jsp",dispatcherTypes = {DispatcherType.FORWARD,DispatcherType.REQUEST})//请求转发都可以
public class demo05Filter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filter05启动了");
        //放行
        chain.doFilter(req, resp);
        System.out.println("filter05启动回来了");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
