package demo03date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class date02drill {
    public static void main(String[] args) throws ParseException {
        //输入生日 格式1998-11-21
        Scanner birth = new Scanner(System.in);
        System.out.println("请输入您的年月日，格式1998-11-21");
        String one = birth.next();
        System.out.println(one);
        //把文本解析为日期
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        long parse = simpleDateFormat.parse(one).getTime();
        System.out.println(parse);//911577600000
        System.out.println(simpleDateFormat.parse(one));//Sat Nov 21 00:00:00 CST 1998
        //获取当前日期.getTime 变成毫秒
       long date = new Date().getTime();

       long day=(date-parse)/24/60/60/1000;
        System.out.println(day);



    }
}
