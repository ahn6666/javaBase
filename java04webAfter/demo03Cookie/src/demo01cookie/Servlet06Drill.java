package demo01cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

//记住上一次访问的时间
//需求：1.访问一个servlet，如果是第一次访问，则提示：您好，欢迎您首次访问
//如果不是第一次访问，则提示：欢迎回来，您上次访问时间为：显示字符串
@WebServlet("/demo01cookie.Servlet06Drill")
public class Servlet06Drill extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式
        response.setContentType("text/html;charset=utf-8");
            //创建
        boolean flag=false;
        Cookie[] cookies = request.getCookies();
        //如果不是第一次访问
        if (cookies!=null||cookies.length>0)
            {

                //查找是否有lastTime
                for (Cookie cookie : cookies) {
                    String name= cookie.getName();
                    if ("lastTime".equals(name))
                    {
                        flag=true;

                        //则获取值 响应输出
                        String value = cookie.getValue();
                        value= URLDecoder.decode(value,"utf-8");
                        response.getWriter().write("欢迎回来，您上次访问的时间是"+value);

                        //设置现在访问的时间
                        Date date = new Date();//获取当前时间
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        value = simpleDateFormat.format(date);
                        //设置中文编码
                        System.out.println("编码前"+value);
                         value = URLEncoder.encode(value, "utf-8");
                        System.out.println("编码后"+value);
                        //设置缓存
                        cookie.setValue(value);
                        cookie.setMaxAge(10000);
                        response.addCookie(cookie);
                        //解码
                        System.out.println("解码前"+value);
                        value= URLDecoder.decode(value,"utf-8");
                        System.out.println("解码后"+value);
                        response.getWriter().write("现在访问的时间为:"+value);
                    }

               break;
                }
            }
        //如果是第一次访问
        if (cookies==null||cookies.length==0||flag==false)
        {
            Date date = new Date();//获取当前时间
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           String value = simpleDateFormat.format(date);
            value = URLEncoder.encode(value, "utf-8");
            Cookie cookie = new Cookie("lastTime",value);
            //设置缓存
            cookie.setMaxAge(10000);
            response.addCookie(cookie);
            value= URLDecoder.decode(value,"utf-8");
            response.getWriter().write("您好，欢迎首次访问的时间为"+value);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
