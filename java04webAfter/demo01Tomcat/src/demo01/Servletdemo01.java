package demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//运行http://localhost:8080/demo01Tomcat/Servletdemo01
@WebServlet("/Servletdemo01")
public class Servletdemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        方法：
//        1.获取请求方法：get
//        String getMethod()
        String method = request.getMethod();
        System.out.println(method);//GET
//        2.获取虚拟目录：//servlet
//        String getContextPath()
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
//        3.获取Servlet路径：//demo1
//        String getServletPath()
        String servletPath = request.getServletPath();
        System.out.println(servletPath);
//        4.获取get方式请求参数：//name=zhangsan
//        String getQueryString()
        String queryString = request.getQueryString();
        System.out.println(queryString);
//        5.获取请求URL:/demo04
//                *String getRequestURI()：中华人民共和国 /servlet/demo1
//                *StringBuffer getRequestURL():共和国 http://localhost/servlet/demo1
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURI);
        System.out.println(requestURL);
//        6：获取协议以及版本：HTTP/1.1
//        String getProtocol()
        String protocol = request.getProtocol();
        System.out.println(protocol);
//        7:获取客户机的ip地址 0:0:0:0:0:0:0:1
//        String getRemoteAddr()
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
