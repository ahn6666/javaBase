package day12InterfaceDrill;

public class main {
    public static void main(String[] args) {
        windows win=new windows();
        win.open();
    //首先创建一个鼠标
      /*  mouse mou=new mouse();
        mou.open();
        mou.close();*/
        USB mou=new mouse();//向上转型
        win.methon(mou);

        //创建一个键盘
       keyBorder key=new keyBorder();
       //第二种：方法参数是usb类型 传递进去的是实现类
        win.methon(key);//也是正确写法 发生了向上转型
//        win.methon(new keyBorder());也是正确写法

        win.close();
    }
}
