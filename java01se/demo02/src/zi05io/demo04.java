package zi05io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*Java.io.InputStream:字节输入流
此抽象类是字节输入流的所有类的超类
定义了所有子类共性的方法：
Int read()从输入流中读取数据的下一个字节
Int read(byte[] b)从输入流中读取一定数量的字节 并将其存储在缓冲区数组b中
Void close() 关闭此输入流并释放与该流关联的所有的系统资源


1:创建FileInputStream对象 构造方法中绑定要读取的数据源
2：使用FileInputStream对象中的方法read 读取文件
3：释放资源
*/
public class demo04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("E:\\java-base\\untitled2\\src\\zi05io\\obj.txt");
       /* int read = fileInputStream.read();
        System.out.println(read);//97
        System.out.println(fileInputStream.read());//98
        System.out.println(fileInputStream.read());//115
        System.out.println(fileInputStream.read());//-1
        System.out.println(fileInputStream.read());//-1*/
        int len=0;
        while ((len=fileInputStream.read())!=-1)
        {
            System.out.println((char)len);//abs
        }
        fileInputStream.close();


    }
}
