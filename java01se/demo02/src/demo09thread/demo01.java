package demo09thread;
/*		1：创建一个Thread类的子类
		2:  在Thread类的子类中重写Thread类中的方法，设置线程任务（开启线程要做什么？）
		3：创建Thread类的子类对象
		4: 调用Thread类中的方法start方法，开启新的线程，执行run方法
*/
public class demo01 {
    public static void main(String[] args) {
        ziThread01 obj=new ziThread01();
        obj.start();
        obj.run();
       /* for  (int i = 0; i <10; i++) {
            System.out.println("main"+i);
        }*/
        //运行结果是随机执行
    }
}
