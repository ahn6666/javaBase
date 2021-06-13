package web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * 敏感词汇的过滤
 */
@WebFilter("/*")
public class demo02sensitiveFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

                //代理模式
        ServletRequest proxy_do= (ServletRequest) Proxy.newProxyInstance(req.getClass().getClassLoader(), req.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //增强getParameter方法
                if (method.getName().equals("getParameter"))
                {
                    //获取方法
                   String valus = (String) method.invoke(req, args);
                   if (valus!=null)
                   {
                       for (String str : list) {
                           if (valus.contains(str))
                           {
                               valus=valus.replaceAll(valus,"***");
                           }
                       }
                   }
                    return valus;

                }
                return method.invoke(req,args);
            }
        });
        //放行
        chain.doFilter(proxy_do,resp);
    }

        private List<String> list=new ArrayList<String>();//敏感词汇词组
    public void init(FilterConfig config) throws ServletException {

        try {
            //加载文件
            //获取文件的真实路径
            ServletContext path = config.getServletContext();
            String realPath = path.getRealPath("/WEB-INF/classes/sensitive.txt");
            //读取文件
            BufferedReader bufferedReader = new BufferedReader(new FileReader(realPath));
            //将文件的每一行添加到list中
            String line=null;
            while ((line=bufferedReader.readLine())!=null)
            {
                    list.add(line);
            }
            bufferedReader.close();
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
