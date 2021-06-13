package day07Inherit;

public class inherit08zithis extends inherit08futhis{
    public inherit08zithis()
    {
//        super 不再赠送
        this(10);
//        this(20,30);//本类中的无参构造，调用本类的有参构造
    }
    public inherit08zithis(int a)
    {
        this(10,30);
    }
    public inherit08zithis(int a,int b)
    {

    }
    int num=20;
    public void methon()
    {
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
    public void methonA()
    {

        System.out.println("AAA");
    }
    public void methonB()
    {
        this.methonA();
        System.out.println("BBB");
    }
}
