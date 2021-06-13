package zi07stream;

public class demo07zi extends demo07fu{
    @Override
    public void fu()
    {
        System.out.println("这是父类重写子类");
    }
    //定义一个参数传递gree接口
    public void methon(demo07super ob)
    {
            ob.gree();
    }
/*
    public void show()
    {
        methon(()->{
            zi07stream.demo07fu fuzi= new zi07stream.demo07fu();
            fuzi.fu();
        });
    }
*/
    //使用本类的sUper访问子类
    public  void show()
    {
        methon(()->{ super.fu();
        });
    }

    public static void main(String[] args) {
        new demo07zi().show();
    }

}
