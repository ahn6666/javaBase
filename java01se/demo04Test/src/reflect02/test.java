package reflect02;

import java.lang.reflect.Method;
import java.util.Properties;

//框架类
public class test {
    //可以创建任意对象的类  可以执行任何方法
    public static void main(String[] args) throws Exception {
        /*person one= new person();
        one.eat();

        student two=new student();*/
        //加载配置文化
        //创建properties
        Properties pro=new Properties();
        //加载配置文件 转换为一个集合
        ClassLoader classLoader = reflect02.test.class.getClassLoader();
        pro.load(classLoader.getResourceAsStream("pro.properties"));
//        1:需要将创建的对象的全类名和需要执行的方法定义在配置文件中
//        2:在程序中加载读取配置文件
        String className = pro.getProperty("className");
        String methonName = pro.getProperty("methodName");

//        3:使用反射技术来加载类文件进内存
        Class aClass = Class.forName(className);
//        4:创建对象
        Object o = aClass.newInstance();
//        5:执行方法
        //获取方法对象
        Method method = aClass.getMethod(methonName);
        method.invoke(o);
    }
}
