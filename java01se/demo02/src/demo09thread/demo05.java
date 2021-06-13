package demo09thread;
/*	1. 创建一个Runnable 接口的实现类
	2. 在实现类种重写Runnable接口的run方法，设置线程任务
	3：创建一个Runnable 接口的实现类对象
	4：创建Thread类对象，构造方法中传递Runnable接口的实现类对象
     5：调用Thread类中的start方法，开启新的线程执行run方法*/
public class demo05 {
    public static void main(String[] args) {
        ziThread05 obj = new ziThread05();
        Thread one = new Thread(obj);
        one.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);

        }
    }
}
