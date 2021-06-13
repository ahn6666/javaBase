package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class loginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
       HttpServletRequest request= (HttpServletRequest) req;
        String url = request.getRequestURI();
        if (url.contains("/regist.jsp")
        ||url.contains("/index.jsp")
        ||url.contains("/css")
        ||url.contains("/js")
        ||url.contains("registServlet")
        ||url.contains("checkServlet")
        ){
            chain.doFilter(req, resp);
        }else
        {
            Object user = request.getSession().getAttribute("user");
            if (user!=null)
            {
                chain.doFilter(req, resp);
            }else{
                request.setAttribute("mgs","请登录");
                request.getRequestDispatcher("/index.jsp").forward(request,resp);
            }}


    }

    public void init(FilterConfig config) throws ServletException {

    }

}
