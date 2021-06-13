package zi01lock;

public class zi02Runnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"这是创建的一个线程");
    }
}
