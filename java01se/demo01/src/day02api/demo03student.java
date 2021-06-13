package day02api;
//两个对象指向一个内存
public class demo03student {
    public static void main(String[] args) {
        demo01student student03= new demo01student();
        System.out.println(student03);
        System.out.println(student03.name);
        System.out.println(student03.age);
        System.out.println("========");
        student03.name="李明";
        student03.age=20;
        System.out.println(student03);
        System.out.println(student03.name);
        System.out.println(student03.age);
        System.out.println("========");

        demo01student student04=student03;
        System.out.println(student04);
        System.out.println(student04.name);
        System.out.println(student04.age);
        System.out.println("========");

        student03.name="姚明";
        student03.age=21;
        System.out.println(student04);
        System.out.println(student04.name);
        System.out.println(student04.age);
        System.out.println("========");

        System.out.println(student03);
        System.out.println(student03.name);
        System.out.println(student03.age);
    }
}
