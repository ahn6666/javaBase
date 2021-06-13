package zi01lock;

import java.util.Objects;

public class zi06drill {
    public static void main(String[] args) {
        Object a=new Object();
        new Thread(){
            @Override
            public void run() {
                synchronized (a)
                {
                    System.out.println("老板，我要的包子的数量和价格");
                    try {
                        a.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("开吃");
            }
        }.start();
        Object l=new Object();
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (a){
                    System.out.println("顾客1,您的包子已经好了");
                     a.notify();
                }
            }

        }.start();
    }
}
