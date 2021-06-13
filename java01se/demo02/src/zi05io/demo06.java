package zi05io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件的复制：
数据源： 目的地
文件复制的步骤：
1：创建一个字节输入流对象，构造方法中绑定要读取的数据源
2:创建一个字节输出流对象，构造方法中绑定要写入的目的地
3:使用字节输入流对象中的方法read读取文件
4:使用字节输出流中的方法write，把读取到的字节写入到目的地的文件中
5:释放资源
* */
public class demo06 {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        FileInputStream o = new FileInputStream("E:\\java-base\\untitled2\\src\\zi05io\\ob.txt");
        FileOutputStream obj = new FileOutputStream("E:\\java-base\\untitled2\\src\\zi05io\\obj1.txt");
        int len=0;
        while((len=o.read())!=-1)
        {
//            System.out.println(len);
            obj.write(len);
        }
        obj.close();
        o.close();
        long l1 = System.currentTimeMillis();
        System.out.println("复制文件总共需要的时间是"+(l1-l));
    }
}
