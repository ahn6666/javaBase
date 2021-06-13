package demo09thread;

public class ziThread02 extends Thread{
    @Override
    public void run() {
        //获取线程名称
        /*String name=getName();
        System.out.println(name);*/
       /* Thread thread = Thread.currentThread();
        System.out.println(thread);
        String name = thread.getName();
        System.out.println(name);*/
        /*链式编程*/
        System.out.println(Thread.currentThread().getName());
    }
}
