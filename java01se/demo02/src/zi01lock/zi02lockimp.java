package zi01lock;

public class zi02lockimp implements  Runnable{
    private Integer tik=100;
    Thread obj=new Thread();
    @Override
    public void run() {

     while (true)
     {
         synchronized (obj)
         {
             if (tik>0)
             {
                 System.out.println(Thread.currentThread().getName()+"卖的票的"+tik+"数");
                 tik--;
             }}
     }
    }
}