package web.impl;

import domain.user;
import org.apache.commons.beanutils.BeanUtils;
import service.UserService;
import service.impl.UserServiceimpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码
        request.setCharacterEncoding("utf-8");

        //获取数据
        //1.获取验证码对象
        String verifycode = request.getParameter("verifycode");
        //验证码校验
        //获取自动生成的验证码
        HttpSession checkcode_server = request.getSession();
        String checkcode_server1 = (String) checkcode_server.getAttribute("CHECKCODE_SERVER");
        //确保一次性
        checkcode_server.removeAttribute("CHECKCODE_SERVER");
        //判断是否和之前的一样
        if (!checkcode_server1.equalsIgnoreCase(verifycode)) {
            //验证码不正确
            //提示信息
            request.setAttribute("login_mgs", "验证码错误");
            //跳转登录页面
            request.getRequestDispatcher( "/login.jsp").forward(request,response);
            return;
        }

            //封装user对象
            user user = new user();
            //2.封装user对象
            Map<String, String[]> map = request.getParameterMap();
            try {
                BeanUtils.populate(user, map);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

            // 调用service
            UserService userService = new UserServiceimpl();
            user LoginService = userService.login(user);
            //判断是否登录成功

            if (LoginService != null) {

                //将用户存入session
                checkcode_server.setAttribute("user", LoginService);
                //跳转
                response.sendRedirect(request.getContextPath() + "/index.jsp");

            } else {

                //验证码不正确
                //提示信息
                request.setAttribute("login_mgs", "账户密码错误");
                //跳转登录页面
                request.getRequestDispatcher("/login.jsp").forward(request,response);
                return;
            }
        }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
