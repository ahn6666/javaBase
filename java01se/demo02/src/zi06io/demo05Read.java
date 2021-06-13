package zi06io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*	使用步骤：
		1：创建字符缓冲输入流对象，构造方法中传递字符输入流
		2：使用字符缓冲输入流对象中的方法read/readline读取文本
        3：释放资源*/
public class demo05Read {
    public static void main(String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new FileReader("E:\\java-base\\untitled2\\src\\zi06io\\c.txt"));
        /*System.out.println(obj.read());
        System.out.println(obj.readLine());*/
        String len;
        while ((len=obj.readLine())!=null)
        {
            System.out.println(len);
        }
        obj.close();
    }
}
