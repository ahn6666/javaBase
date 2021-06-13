package zi01lock;

public class zi04main {
    public static void main(String[] args) {
        zi04lockimp r = new zi04lockimp();
        Thread obj = new Thread(r);
        Thread obj1 = new Thread(r);
        Thread obj2 = new Thread(r);

        obj.start();
        obj1.start();
        obj2.start();
    }
}