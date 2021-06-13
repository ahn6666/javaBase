package demo05Fan;

public class demo1main {
    public static void main(String[] args) {
        demo01 obj=new demo01();
        obj.setObj("nihao");
        //不写默认的创建的类型
        Object obj1 = obj.getObj();
        System.out.println(obj1);
        /*demo01<String> obj1=new demo01<>();
        obj1.setObj("nihao");
        String obj2 = obj1.getObj();
        System.out.println(obj2);*/
    }
}
