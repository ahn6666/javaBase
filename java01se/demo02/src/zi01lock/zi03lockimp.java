package zi01lock;
/*		修饰符 synchronized 返回值类型 方法名 （参数列表）
		{
			可能会出现线程安全问题的代码（访问共享数据的代码）
		}

*/
public class zi03lockimp implements Runnable{
    private Integer tik=100;
    Thread obj=new Thread();
    @Override
    public void run() {

        while (true)
        {
            methon(obj);
        }
}
public  synchronized void  methon(Thread obj)
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
