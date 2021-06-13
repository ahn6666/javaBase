package demo09thread;

public class demo03 {
    public static void main(String[] args) {
        /*ziThread03 obj=new ziThread03();
        obj.setName("小青");
        obj.run();
        obj.start();*/
        /*匿名内部类放实现线程的创建
            匿名：没有名字
            内部类：写在其他类内部的类
        匿名内部类作用：简化代码
            把子类继承父类：重写父类的方法，创建子类对象合一步完成
            把实现类实现类接口，重写接口中的方法，创建子类对象一步完成
        匿名内部类的最终产物：子类/实现类对象 而这个类没有名字

        格式： new 父类/接口（）{重复父类/接口中的方法 }；*/
        new ziThread03("小青").start();
    }
}
