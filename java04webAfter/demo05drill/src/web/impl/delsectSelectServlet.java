package web.impl;

import service.UserService;
import service.impl.UserServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delsectSelectServlet")
public class delsectSelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //获取id数组
        String[] uids = request.getParameterValues("uid");
       /* for (String uid : uids) {
            System.out.println(uid);
        }*/
        //调用service删除
        UserService service=new UserServiceimpl();
        service.delectSECECTByid(uids);
            //跳转到查询所有的Servlet
        response.sendRedirect(request.getContextPath()+"/UserListServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
