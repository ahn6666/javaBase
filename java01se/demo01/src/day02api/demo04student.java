package day02api;
//两个对象使用同一个内存图
public class demo04student {
    public static void main(String[] args) {
        demo01student studen04=new demo01student();
        System.out.println(studen04);
        System.out.println(studen04.name);
        System.out.println(studen04.age);
        System.out.println("========");
        studen04.name="李明";
        studen04.age=20;
        System.out.println(studen04);
        System.out.println(studen04.name);
        System.out.println(studen04.age);
        System.out.println("========");
        System.out.println("========");

        demo01student studen05=new demo01student();
        System.out.println(studen05);
        System.out.println(studen05.name);
        System.out.println(studen05.age);
        System.out.println("========");
        studen05.name="俞敏洪";
        studen05.age=45;
        System.out.println(studen05);
        System.out.println(studen05.name);
        System.out.println(studen05.age);


    }
}
