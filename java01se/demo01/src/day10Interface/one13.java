package day10Interface;
//计应1909吕孟玲
class E
{
    public  static  void p()//静态方法
    {
        System.out.println("I am B");
    }
}

public class one13 {
    public static void main(String[] args) {
        E.p();//静态方法直接类名调用即可
    }
}
