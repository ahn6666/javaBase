package demo09thread;

public class demo02 extends Thread{
    public static void main(String[] args) {
        ziThread02 obj=new ziThread02();
        obj.start();//Thread-0  Thread[Thread-0,5,main] Thread-0
        new ziThread02().start();//Thread-1 Thread[Thread-2,5,main] Thread-2
        new ziThread02().start();//Thread-2 Thread[Thread-1,5,main] Thread-1
    }

}
