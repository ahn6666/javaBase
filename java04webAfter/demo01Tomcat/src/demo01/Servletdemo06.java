package demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

//在web/http://localhost:8080/demo01Tomcat/servlet06.html
@WebServlet("/Servletdemo06")
public class Servletdemo06 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //为了防止post请求方式乱码
       request.setCharacterEncoding("utf-8");

        //根据参数名称获取参数值
        /*String parameter = request.getParameter("name");//zhangsan
        System.out.println(parameter);*/
        //根据参数名称获取参数数值的数组 勾选几个输出几个
        /*String[] apples = request.getParameterValues("apple");
        for (String s : apples) {
            System.out.println(s);
        }*/
        //获取所有请求参数名称的集合
       /* Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements())
        {
            String s = parameterNames.nextElement();//获取参数
            System.out.print(s);
            System.out.print("---");
            String value = request.getParameter(s);//获取参数的值
            System.out.println(value);

        }*/
        //获取所有的参数的map集合
        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<String> strings = parameterMap.keySet();
        for (String s : strings) {
            System.out.println(s );//输出键
            //通过键获取值
            String[] value = parameterMap.get(s);
            for (String s1 : value) {
                System.out.println(s1);//输出值
            }
            System.out.println("---------");
        }
    }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
