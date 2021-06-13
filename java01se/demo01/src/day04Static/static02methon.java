package day04Static;
//static 修饰成员方法
public class static02methon {
    int age;
    static String sex;
    public void studen(){
        System.out.println("这不是一个静态方法");
        //成员方法可以访问成员变量和静态变量
        System.out.println(sex);
        System.out.println(age);
    }
    public  static void student1()
    {
        //静态成员方法只可以访问静态变量
        System.out.println("这是一个静态方法");
        System.out.println(sex);
        //System.out.println(age);
    }

    public static void main(String[] args) {
        student1();
//        student();不可访问 因为是静态
    }
}
