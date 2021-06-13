package demo09thread;

public class ziThread03 extends Thread {
    public ziThread03(){

    }
    public ziThread03(String name)
    {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
