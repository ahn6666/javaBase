package day04Static;
//一旦使用static修饰成员方法 那么这就成立静态方法 静态方法不属于对象 而是属于类的
public class static02methon2 {
    public static void main(String[] args) {
        //如果没有static关键字 必须首先创建对象 然后通过对象才能使用它
        static02methon obj=new static02methon();
        obj.studen();
        System.out.println("====");
        //如果有了static关键字那么不需要创建对象 直接就能通过类名称来使用它
        static02methon.student1();
        System.out.println("====");
        //对于在当前页面的静态方法 不需要通过类名称也能使用
        student2();

    }
    public  static void student2()
    {
        System.out.println("这是一个本类静态方法");
    }
}
