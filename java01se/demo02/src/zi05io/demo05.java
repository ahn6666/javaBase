package zi05io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//一次读取多个字节
public class demo05 {
    public static void main(String[] args) throws IOException {
        FileInputStream obj = new FileInputStream("\\java-base\\untitled2\\src\\zi05io\\obj.txt");
        //使用字符数组
        //使用FileInputStream对象中的方法read读取文件
        //int read(byte[] b)从输入流中读取一定数量的字节 并将其存储在缓冲区数组b中
       /* byte[] len = new byte[2];
        int one = obj.read(len);
        System.out.println(one);//2
        System.out.println(new String(len));//ab
        one = obj.read(len);
        System.out.println(new String(len));//bs
        one = obj.read(len);
        System.out.println(new String(len));//bs
        obj.close();*/

        //使用循环一次读取
        byte[] bytes=new byte[1024];//存储读取到的多个字节
        int len=0;//记录每次读取的有效字节的个数
        while ((len=obj.read(bytes))!=-1)
        {
            //String(byte[] bytes,int offset,int length) 把字节数组的一部分转换为字符串 offset：数组的开始索引 length:转换的字节个数
            System.out.println(new String(bytes));
        }
    }
}
