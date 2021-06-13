package demo09thread;

public class demo04 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
