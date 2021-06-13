package web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebFilter("/*")
public class demo01Filter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
       //获取httpservlet
        HttpServletRequest request= (HttpServletRequest) req;
        //获取路径
        String url = request.getRequestURI();
        if (url.contains("/login.jsp")
                ||url.contains("/loginServlet")
                ||url.contains("/loginyzm")
                ||url.contains("/css/")
                ||url.contains("/js/")
                ||url.contains("/fonts/")
        )
        {
            chain.doFilter(req, resp);
        }else
        {
            Object user = request.getSession().getAttribute("user");
            if (user!=null)
            {
                chain.doFilter(req, resp);
            }else{
            request.setAttribute("login_mgs","请登录");
            request.getRequestDispatcher("/login.jsp").forward(request,resp);
        }}
    }
    public void init(FilterConfig config) throws ServletException {


    }

}
