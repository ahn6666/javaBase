package day02api;
//一个对象的
public class demo02stdent {
    public static void main(String[] args) {
        demo01student stu=new demo01student();
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.name="丁禹锡";
        stu.age=18;
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.eat();
    }
}
