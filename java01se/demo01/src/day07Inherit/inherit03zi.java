package day07Inherit;

public class inherit03zi extends inherit03fu{
    int num=20;
    public void methon()
    {
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }

}
