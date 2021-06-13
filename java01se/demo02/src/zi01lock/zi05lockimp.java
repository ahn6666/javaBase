package zi01lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*		修饰符 synchronized 返回值类型 方法名 （参数列表）
		{
			可能会出现线程安全问题的代码（访问共享数据的代码）
		}

*/
public class zi05lockimp implements Runnable {
    private static Integer tik = 100;
    Lock l=new ReentrantLock();
    @Override
    public void run() {
       /* while (true)
        {
            l.lock();

            if (tik > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "卖的票的" + tik + "数");
                tik--;
                l.unlock();
            }
        }*/
        while (true)
        {
            l.lock();

            if (tik > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l.unlock();
                }
                System.out.println(Thread.currentThread().getName() + "卖的票的" + tik + "数");
                tik--;

            }
        }
    }
}