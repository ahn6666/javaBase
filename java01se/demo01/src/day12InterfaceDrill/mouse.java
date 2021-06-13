package day12InterfaceDrill;

public class mouse implements USB {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }
    public  void mouM()
    {
        System.out.println("鼠标输入");
    }
}
