package zi06io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*	使用步骤：
		1：创建字符缓冲输出流对象，构造方法中传递字符输出流
		2:调用字符缓冲输出流中的方法write,把数据写入到内存缓冲区中
		3:调用字符缓冲输出流中的方法flush,把内存缓冲区中的数据，刷新到文件中
        4:释放资源*/
public class demo04Write {
    public static void main(String[] args) throws IOException {
        System.out.println();
        BufferedWriter obj = new BufferedWriter(new FileWriter("E:\\java-base\\untitled2\\src\\zi06io\\c.txt"));
        obj.write("Aaaa");
        obj.write("中国");
        System.out.println();
        for (int i = 0; i < 20; i++) {
            obj.write("你是个憨憨");
//            obj.write("\r\n");
            obj.newLine();
        }
        obj.flush();
        obj.close();
    }
}
