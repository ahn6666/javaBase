package demo10throwable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//异常的情况
public class demo01 {
    public static void main(String[] args){
//        这是正确的 应该传参数
//        SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat date=new SimpleDateFormat();
       /* Date one=date.parse("1999-10-10");//异常错误java.text.ParseException; 必须对其进行捕获或声明以便抛出
        System.out.println(one);*/
        //修改一
        /*Date one=date.parse("1999-10-10");//  public static void main(String[] args) throws ParseException
        System.out.println(one);//ParseException 解析异常 jvm会终止 后续代码会执行*/
        //修改二
        Date one=null;
        try {
            one=date.parse("1999-10-10");
            System.out.println(one);
        } catch (ParseException e) {
            e.printStackTrace();
            //接下来把异常打印出来
            System.out.println(e);//java.text.ParseException: Unparseable date: "1999-10-10"
        }
        System.out.println("你好");//Unparseable 你好
        //用 try catch 后续代码会执行
    }
}
