package zi06io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class demo12prin {
    public static void main(String[] args) throws FileNotFoundException {
        /*PrintStream ob = new PrintStream(new FileOutputStream("E:\\java-base\\untitled2\\src\\zi06io\\print.txt"));
        ob.print("1");
        ob.write(97);
        ob.print(97);
        ob.close();//1a97*/
/*	使用System.setOut方法改变输出语句的目的地改为参数中传递的打印流的目的地
		Static void setOut(PrintStream out)
重新分配“标准”输出流*/
        System.out.println("我是在控制台输出");
        PrintStream o = new PrintStream("E:\\javaStudy\\java-se\\demo002\\src\\zi06io\\c.txt");
        System.setOut(o);
        System.out.println("改变路径");
        o.close();
    }
}
