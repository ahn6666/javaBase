package servlet;

import domain.user;
import service.userService;
import service.userServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/checkServlet")
public class checkServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        userService userService = new userServiceImpl();
        user byUser = userService.findByUser(name, password);

        if (byUser!=null)
        {    request.getSession().setAttribute("user",byUser);
            response.sendRedirect(request.getContextPath()+"/pageServlet?currentPage=1&rows=5");
        }else
        {
            request.setAttribute("mgs","登录失败");
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
