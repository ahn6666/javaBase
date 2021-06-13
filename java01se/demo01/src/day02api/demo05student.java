package day02api;
//使用对象类型作为参数
public class demo05student {
    public static void main(String[] args) {
        demo01student student05=methon();
        System.out.println(student05.name);
        System.out.println(student05.age);
    }
    //必须使用static
    public static demo01student methon()
    {
        demo01student one=new demo01student();
        one.age=18;
        one.name="李明";
        return  one;
    }
}
