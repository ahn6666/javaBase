package zi01lock;
//线程不安全
public class zi01main {
    public static void main(String[] args) {
        zi01lockimp r=new zi01lockimp();
        Thread obj=new Thread(r);
        Thread obj1=new Thread(r);
        Thread obj2=new Thread(r);

        obj.start();
        obj1.start();
        obj2.start();

    }
}
