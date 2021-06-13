package cn.web;

import cn.dao.userDao;
import cn.user.User;
import org.apache.commons.beanutils.BeanUtils;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

//最后一步  包含编写成功和失败的案例
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //获取username和password值
        /*String username = request.getParameter("username");
        String password = request.getParameter("password");
        //进行封装
        User loginuser=new User();
        loginuser.setUsername(username);
        loginuser.setPassword(password);*/


        //用beanutils进行封装
        Map<String, String[]> parameterMap = request.getParameterMap();
        //创建对象
        User loginuser=new User();
        //使用utils进行封装
        try {
            BeanUtils.populate(loginuser,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        
        //userdao的login方法查询
        userDao userDao = new userDao();
        //真正获取的user
        User  user = userDao.login(loginuser);
        System.out.println("nihao");
        if (user ==null)
        {
            request.getRequestDispatcher("/failServlet").forward(request,response);
        }else
        {
            request.setAttribute("user",user );
            request.getRequestDispatcher("/successServlet").forward(request,response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
