package servlet;

import dao.userDaoImpl;
import service.userService;
import service.userServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registServlet")
public class registServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
            //获取前台传来的参数
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        userService userDao = new userServiceImpl();
        userDao.addUser(name,password);
        request.setAttribute("name",name);
        request.setAttribute("password",password);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
