package demo09thread;

public class ziThread01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println("run"+i);
        }
    }
}
