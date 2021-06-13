package zi06io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*	1:创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
	2:使用InputStreamReader对象中的方法read读取文件
	3：释放资源
	注意事项：
构造方法中指定的编码表和文件的编码相同 否则回发生乱码*/
public class demo08Input {
    public static void main(String[] args) throws IOException {
//        InputStreamReader obj = new InputStreamReader(new FileInputStream("E:\\java-base\\untitled2\\src\\zi06io\\fgbk.txt"), "gbk");
        InputStreamReader obj = new InputStreamReader(new FileInputStream("E:\\java-base\\untitled2\\src\\zi06io\\f.txt"), "utf-8");
        int len=0;
        while ((len=obj.read())!=-1)
        {
            System.out.println((char)len);
        }
        obj.close();
    }
}
