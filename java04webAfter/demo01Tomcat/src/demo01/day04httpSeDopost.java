package demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/day04")
//运行方式http://localhost:8080/demo01Tomcat/day04
//在此方式下只运行doget方法
//要运行dopost方法 需要通过表表单  find-->web/day04httpdepost  //运行路径运行路径：http://localhost:8080/demo01Tomcat/day04depost.html
public class day04httpSeDopost extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dopost........");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doget......");//运行
    }
}
