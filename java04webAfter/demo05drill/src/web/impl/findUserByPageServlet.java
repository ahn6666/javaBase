package web.impl;

import domain.pageBean;
import domain.user;
import service.UserService;
import service.impl.UserServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet("/findUserByPageServlet")
public class findUserByPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("utf-8");
        //接受参数
        String currentPage= request.getParameter("currentPage");

        String rows= request.getParameter("rows");

        if (rows==null ||"".equals(rows))
        {
            rows="5";
        }
        if (currentPage ==null ||"".equals(currentPage))
        {
            currentPage="1";
        }



        //获取条件查询
        Map<String, String[]> condition = request.getParameterMap();
        //调用service查询pageBean
        UserService service=new UserServiceimpl();
        pageBean<user> pageBean=service.findUserByPage(currentPage,rows,condition);

        //将pageBean存入request
        request.setAttribute("pageBean",pageBean);
        request.setAttribute("condition",condition);
        //转发list.jsp展示
        request.getRequestDispatcher("/list.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
