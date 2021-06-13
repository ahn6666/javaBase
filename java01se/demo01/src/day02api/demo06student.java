package day02api;
//使用对象类型作为方法的返回值
public class demo06student {
    public static void main(String[] args) {
        demo01student student06=new demo01student();
        student06.name="李明";
        student06.age=20;
        methon(student06);
    }
    public static void methon(demo01student one)
    {
        System.out.println(one.name);
        System.out.println(one.age);
    }
}
