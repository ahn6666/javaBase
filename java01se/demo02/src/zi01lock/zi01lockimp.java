package zi01lock;

public class zi01lockimp implements  Runnable{
    private Integer tik=100;
    @Override
    public void run() {
        while (true)
        {
            if (tik>0)
            {
                System.out.println(Thread.currentThread().getName()+"卖的票的"+tik+"数");
                tik--;
            }
        }

    }
}
