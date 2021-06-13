package day02api;

import java.util.Scanner;

//使用匿名对象进行传参和返回值
public class api02scanner {
    public static void main(String[] args) {
        //使用匿名对象的方式
   /*     Scanner student=new Scanner(System.in);
        mehton(student);*/

        //使用匿名对象传参
        mehton(new Scanner(System.in));

        //使用匿名对象作为参数的返回值
        Scanner sr =methon1();
        int num=sr.nextInt();
        System.out.println("第二次您输入的数字为"  + num);
    }
    public  static void mehton(Scanner src){
        int num=src.nextInt();
        System.out.println("您输入的数字是"+num);
    }
    public static Scanner methon1()
    {
        return (new Scanner(System.in));
    }

}
