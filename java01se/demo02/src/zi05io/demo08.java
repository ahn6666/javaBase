package zi05io;

import java.io.FileWriter;
import java.io.IOException;

/*Java.io.writer抽象类是表示用于写出字符流的所有类的超类，将指定的字符信息写出到目的地，它定义了字节输出流的基本共性功能方法
-void write(int c):写入单个字符
-void write（char[] cbuf）:写入字符数组
-abstract void write(char[] cbuf,int off,int len):写入字符数组的某一部分，off数组的开始索引，len写的字符个数
-void write(String str):写入字符串
-void write(String str,int off,int len):写入字符串的某一部分，off字符串的开始索引，len写的个数。
-void flush():刷新该流的缓冲
-void  close():关闭此流，但要先刷新它

字符输出流的使用步骤（重点）：
	1：创建FileWriter对象，构造方法中绑定要写入数据的目的地
	2:   使用FileWriter中的方法write,把数据写入到内存缓冲区中（字符转换为字节的过程）
	3:   使用FileWriter中的方法flush,把内存缓冲区中的数据，刷新到文件中
    4:   释放资源（会把内存缓冲区中的数据刷新到文件中）*/
public class demo08 {
    public static void main(String[] args) throws IOException {
        FileWriter obj = new FileWriter("E:\\java-base\\untitled2\\src\\zi05io\\obj2.txt");
        obj.write('a');
        obj.flush();
        char[] a={'a','b','c','d'};
        obj.write(a);
        obj.flush();
        obj.write(a,2,1);

        //写入字符串
        String one="helloworld";
        obj.write(one);
        obj.flush();
        obj.write(one,3,3);
        obj.close();
    }
}
