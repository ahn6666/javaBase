package cn.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet05URL")
public class Servlet05URL extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //获取文件对象
        ServletContext s = this.getServletContext();
        //获取web下的文件的目录
        String web1 = s.getRealPath("./b1.txt");
        System.out.println(web1);//E:\javaStudy\out\artifacts\demo07response_war_exploded\b1.txt
        //获取WEB-INF目录下的文件的目录
        String web2= s.getRealPath("/WEB-INF/a.txt");
        System.out.println(web2);//E:\javaStudy\out\artifacts\demo07response_war_exploded\WEB-INF\a.txt
        //获取src下的文件的目录
        String web3 = s.getRealPath("/WEB-INF/classes/c.txt");
        System.out.println(web3);//E:\javaStudy\out\artifacts\demo07response_war_exploded\WEB-INF\classes\c.txt
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request,response);
    }
}
