package day07Inherit;

public class inherit07zi extends inherit07fu {
    int num=10;
    public inherit07zi()
    {
        super();
    }
    public void methonzi()
    {
        System.out.println(super.num);
    }
    @Override
    public void methon()
    {
        super.methon();
        System.out.println("这是子类的成员方法");
    }

}
