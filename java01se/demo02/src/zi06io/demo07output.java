package zi06io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*		1：创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
		2:   使用OutputStreamWriter对象中的方法write,把子符转换为字节存储缓冲区中（编码）
		3：使用OutputStreamWriter对象方法中的flush,把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
        4：释放资源*/
public class demo07output {
    public static void main(String[] args) throws IOException {
//        OutputStreamWriter obj = new OutputStreamWriter(new FileOutputStream("E:\\java-base\\untitled2\\src\\zi06io\\f.txt"),"utf-8");
        OutputStreamWriter obj = new OutputStreamWriter(new FileOutputStream("E:\\java-base\\untitled2\\src\\zi06io\\fgbk.txt"),"gbk");
        obj.write("你好");
        obj.flush();
        obj.close();
    }
}
