package zi01lock;

public class zi05main {
    public static void main(String[] args) {
        zi05lockimp r = new zi05lockimp();
        Thread obj = new Thread(r);
        Thread obj1 = new Thread(r);
        Thread obj2 = new Thread(r);

        obj.start();
        obj1.start();
        obj2.start();
    }
}