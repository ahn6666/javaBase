package zi02baozi;

public class baozi03per extends Thread{
    private baozi01 bz;

    public baozi03per(baozi01 bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if(bz.plag==false)
                {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货吃包子");

                bz.plag=false;
                bz.notify();
                System.out.println("=========");
            }
        }

    }
}
