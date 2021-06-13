package demo03date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateformat {
    public static void main(String[] args) throws ParseException {
        /*1：把日期格式化文本  1，创建simpleDateFormat对象，构造方法中传递指定的模式
				  2，调用simpleDateFormat对象中的方法 format 按照构造方法中指定的模式，把Date日期格式话
        Date date = new Date();
        SimpleDateFormat dateformat = new SimpleDateFormat("yyy-MM-dd HH-mm-ss");
        System.out.println(dateformat.format(date));*/
        /* 2：把文本解析为日期：1，创建simpleDateFormat对象，构造方法中传递指定的模式
            2，调用simpleDateFormat对象中的方法parse 把符合构造方法中模式的字符串解析为Date日期*/
        SimpleDateFormat dateformat = new SimpleDateFormat("yyy年MM月dd日 HH时mm分ss秒");
        Date date =dateformat.parse("2088年01月01日 14时00分00秒");
        System.out.println(date);

    }
}
