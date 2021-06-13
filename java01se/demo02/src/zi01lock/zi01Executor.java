package zi01lock;
/*1：使用线程池的工厂类Executors里面提供的静态方法newFixedThreasPool生产一个指定线程数量的线程池
2:   创建一个类，实现Runnable接口，重写run方法，设置线程任务
3：  调用ExecutorService中的方法submit,传递线程任务（实现类)，开启线程 ，执行run方法
4:    调用ExecutorService中的方法shutdown销毁线程池（不建议执行）*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class zi01Executor {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new zi02Runnable());
        es.submit(new zi02Runnable());
        es.submit(new zi02Runnable());
        es.submit(new zi02Runnable());
        es.shutdown();
//        es.submit(new zi02Runnable());//RejectedExecutionException
    }
}
