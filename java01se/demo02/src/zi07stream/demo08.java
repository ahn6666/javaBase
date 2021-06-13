package zi07stream;

public class demo08 {
    void buy(demo08this s)
    {
        s.buy();
    }
    //定义一个方法
    public  void methon()
    {
        System.out.println("买一个大房子");
    }
    //定义一个this
    public  void  sohappy()
    {
//        buy(()->{this.methon();});
        buy(this::methon);
    }


    public static void main(String[] args) {
        new demo08().sohappy();
    }
}
