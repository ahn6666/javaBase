package zi06io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*	1:创建FileInputStream 对象 ，构造方法中绑定要读取的数据源
	2:创建BufferendInputStream对象，构造方法中传递FileInputStream 增加一个缓冲区，提高FileInputStream的读取效率
	3：使用BufferendInputStream对象中的方法read,读取文件
      4：释放资源*/
public class demo02intput {
    public static void main(String[] args) throws IOException {
        BufferedInputStream obj = new BufferedInputStream(new FileInputStream("E:\\java-base\\untitled2\\src\\zi06io\\a.txt"));
        /*System.out.println(obj.read());
        System.out.println(obj.read());
        System.out.println(obj.read());
        System.out.println(obj.read());*/
        int len=0;
        while ((len=obj.read())!=-1)
        {
            System.out.println((char)len);
        }
        obj.close();
    }
}
