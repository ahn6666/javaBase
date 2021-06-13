package demo09thread;

public class demo06inner {
    //内部类
    public static void main(String[] args) {
      new Thread(){
           @Override
           public void run() {
               for (int i = 0; i < 20; i++) {
                   System.out.println("obj--->"+i);
               }
           }
       }.start();

      //实现接口名称
        Runnable obj1=new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("obj--->"+i+"小吕");
                }
            }
        };


        new Thread(obj1).start();
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("obj--->"+i+"小meng");
                }
            }
        }).start();
    }
}
