package lister;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class demo01lisener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //加载资源文件
        //1.获取servletContextEvent
        ServletContext servletContext = servletContextEvent.getServletContext();
        //2.加载资源文件
        String initParameter = servletContext.getInitParameter("javax.faces.CONFIG_FILES");

        //3.获取真实路径
        String realPath = servletContext.getRealPath(initParameter);
        //4.加载进内存
        try {
            FileInputStream fis = new FileInputStream(realPath);
            System.out.println(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("监听器启动了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("监听器销毁了");
    }
}
