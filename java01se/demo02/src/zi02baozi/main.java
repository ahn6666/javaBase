package zi02baozi;

public class main {
    public static void main(String[] args) {
        baozi01 bz=new baozi01();
        baozi02pu  bz1=new baozi02pu(bz);
        baozi03per bz2=new baozi03per(bz);
        bz1.start();
        bz2.start();
        new baozi02pu(bz).start();
        new  baozi03per(bz).start();
    }
}
