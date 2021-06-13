package zi02baozi;

public class baozi02pu extends Thread{

    private baozi01 bz;

    public baozi02pu(baozi01 bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count=0;
        while(true){
            //必须同步技术 保证两个线程只有一个在执行
            synchronized (bz){
                //有包子的状态下
                if(bz.plag==true)
                {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //没有包子的状态下
                //设置两种不同的
                if(count%2==1){
                    bz.pi="薄皮";
                    bz.xian="三鲜";
                }else {
                    bz.pi="冰皮";
                    bz.xian="猪肉大葱";
                }

            count++;
            System.out.println("包子铺生产包子"+bz.pi+bz.xian);
            //设置三秒
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bz.plag=true;
            //唤醒线程
            bz.notify();
            System.out.println("包子已经生成好了");
            System.out.println("=================");
        }
        }

    }
}
