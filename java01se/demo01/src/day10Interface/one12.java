package day10Interface;
class A//父类对象
{
    //计应1909吕孟玲
    void callme()
    {
        System.out.println("调用a类中的方法");
    }
}

class  B extends A//子类
{
    void callme()//子类重写方法
    {
        System.out.println("调用b类中的方法");
    }
}

public class one12 {
    public static void main(String[] args) {
        A a=new B();//向上转型
        a.callme();//调用b类中的方法
    }

}
