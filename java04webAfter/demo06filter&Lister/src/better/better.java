package better;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class better {
    public static void main(String[] args) {
        //创建真实对象
        ausu ausu = new ausu();

        //动态代理增强ausu对象
        //代理逻辑编写的方法：代理对象调用所有的方法都会触发该方法执行
        //参数：
        //1.proxy：代理对象
        //method:代理对象调用的方法，被封装为的对象
        //args:代理对象调用的方法时，传递的实际参数
        sale proxy_com= (sale) Proxy.newProxyInstance(ausu.getClass().getClassLoader(), ausu.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
               /* System.out.println("方法执行l");
                System.out.println(method.getName());
                System.out.println(args[0]);*/
                /*Object invoke = method.invoke(ausu, args);
                return invoke;*/


                //判断是是否是price方法
                if (method.getName().equals("price"))
                {
                    //增强方法
                    int money = (int) args[0] * 2;
                    //使用真实对象调用该方法
                    String invoke = (String) method.invoke(ausu, money);
                    //增强返回值
                    return invoke + "送鼠标";
                }else {
                    Object one = method.invoke(ausu, args);
                    return one;
                }
            }
        });
        //调用啊方法
        String computer = proxy_com.price(8000);
        System.out.println(computer);
        String ausu1 = proxy_com.ausu();
        System.out.println(ausu1);
    }
}
