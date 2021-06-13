package day12InterfaceDrill;

public class windows implements USB {
    @Override
    public void open() {
        System.out.println("电脑开机");
    }

    @Override
    public void close() {
        System.out.println("电脑关机");
    }
    public void methon(USB usb)
    {
        usb.open();
        if(usb instanceof mouse)
        {
           mouse mou=(mouse) usb;
           mou.mouM();
        }else if(usb instanceof keyBorder)
        {
            keyBorder key=(keyBorder) usb;
            key.keyM();
        }
        usb.close();

    }
}
