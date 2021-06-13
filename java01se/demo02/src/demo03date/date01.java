package demo03date;

import java.util.Date;

public class date01 {
    public static void main(String[] args) {
        demo3();
    }
    public static void demo1()
    {
        Date obj=new Date();
        System.out.println(obj);//Sat Oct 10 23:46:40 CST 2020
        String s = obj.toLocaleString();
        System.out.println(s);//2020年10月10日 下午11:46:40
    }
    public static  void demo2()
    {

        Date date = new Date(100000000L);
        System.out.println(date);//Fri Jan 02 11:46:40 CST 1970

    }
    public static  void demo3()
    {

        Date date = new Date();
        System.out.println(date.getTime());//1602344614776



    }

}
