package Zhujie;

//框架类
@pro(className = "Zhujie05.pre",methodName = "show")
public class test {
    //可以创建任意对象的类  可以执行任何方法
    public static void main(String[] args) throws Exception {
        //解析注解
        //1.1获取该类的字节码文件对象
        Class<test> testClass = test.class;
        System.out.println(testClass);
        //获取上面的注解对象
        pro an = testClass.getAnnotation(pro.class);//其实就是在内存中生存了一个该注解接口的子类实现类
        //调用注解对象中定义的抽象方法 获取返回值
        String cla = an.className();
        String s = an.methodName();
        System.out.println(cla);//Zhujie05.pre
        System.out.println(s);

    }
}
