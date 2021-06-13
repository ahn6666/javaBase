package servlet;

import domain.product;
import org.apache.commons.beanutils.BeanUtils;
import service.productService;
import service.productServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/addProductServlet")
public class addProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置中文编码
        request.setCharacterEncoding("utf-8");
        //request.getParameterMap()方法也是通过前台表单中的name值进行获取的，获取到后又进行了一次封装
        Map<String, String[]> map = request.getParameterMap();
        System.out.println(map);
        product product = new product();
        //利用包装类
        try {
            //BeanUtils.populate用来将一些 key-value 的值（例如 hashmap）映射到 bean 中的属性。
            BeanUtils.populate(product,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        productService productServive = new productServiceImpl();
         productServive.Add(product);
         //request.getContextPath()获取路径
         response.sendRedirect(request.getContextPath()+"/pageServlet?currentPage=1&rows=5");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
