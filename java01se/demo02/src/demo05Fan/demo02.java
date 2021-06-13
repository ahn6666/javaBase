package demo05Fan;

public class demo02 {
    //定义一个含有泛型的方法
    public <E> void methon(E e)
    {
        System.out.println(e);
    }
    //定义一个静态泛型的方法
    public static <E> void methon2(E e)
    {
        System.out.println(e);
    }

}
