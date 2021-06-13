package test;

import dao.productDao;
import dao.productDaoImpl;
import domain.pageBean;
import domain.product;
import domain.user;
import org.junit.Test;
import service.productServiceImpl;
import service.userService;
import service.userServiceImpl;

public class test {
    @Test
    public void page(){
        productServiceImpl productService = new productServiceImpl();
        //获取参数
        pageBean<product> product=productService.findByPage(0,5);
        System.out.println(product);
        System.out.println(product.getList().get(0));
        System.out.println(product.getTotalPage());
    }
    @Test
    public void Total(){
        productDao p = new productDaoImpl();
        int totalCount = p.findTotalCount();
        System.out.println(totalCount);
    }
    @Test
    public void login()
    {
        userService userService = new userServiceImpl();
        user zhangsan = userService.findByUser("zhangsan", "123");
        System.out.println(zhangsan);
    }
}
