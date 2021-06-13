package demo05Fan;

public class demo022main {
    public static void main(String[] args) {
        demo02 obj=new demo02();
        obj.methon("a");
        obj.methon(1);
        obj.methon(10.00);
        System.out.println("=========");
        //静态方法最好使用类名称
        demo02.methon2("A");
        demo02.methon2("a");
        demo02.methon2(10);
    }
}
