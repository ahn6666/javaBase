package day13final;

public class local03 {
    public static void main(String[] args) {
        int num=20;
        System.out.println(num);
        final int  num1=30;
//        num1=40; 报错 不可改变
        System.out.println(num1);
        local01 stu=new local01();
        stu.setName("赵丽颖");
        System.out.println(stu.getName());
        stu=new local01("霍建华");
        System.out.println(stu.getName());

       final local01 stu1=new local01();
        stu1.setName("张翰");
        //第二次赋值错误
//        stu1=new local01("袁姗姗");
        System.out.println(stu1.getName());
        //地址不变可以赋值
        stu.setName("张翰涵涵");
        System.out.println(stu.getName());

    }
}
