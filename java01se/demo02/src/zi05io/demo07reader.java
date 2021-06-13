package zi05io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*	Java.io.reader:抽象类是表示用于读取字符流的所有类的超类，可以读取字符信息到内存中，它定义了字符输入流的基本共性功能方法。
	-public void close():关闭此流并释放与此流相关联的任何系统资源
	-public int read():从输入流读取一个字符
	-public int read(char[] cbuf):从输入流中读取一些字符，并将它们存储到字符数组中cbuf中
	字符输入流的使用步骤：
	1：创建FileReader对象，构造方法中绑定要读取的数据源
	2:使用FileReader对象中的方法read读取文件
	3:释放资源
	String类的构造方法：
	String （char【】value）:把字符数组转化为字符串
	String(char[] value,int offset ,int count):把字符数组的一部分转换为字符串

*/
public class demo07reader {
    public static void main(String[] args) throws IOException {
        FileReader obj2 = new FileReader("E:\\java-base\\untitled2\\src\\zi05io\\ccc.txt");
        /*int len=0;
        while ((len=obj2.read())!=-1)
        {
            System.out.println((char) len);
        }
        obj2.close();*/

        //使用字符数组
        char[] bytes = new char[1024];
        int len=0;
        while ((len=obj2.read(bytes))!=-1)
        {
            System.out.println(new String(bytes,0,len));
        }
        obj2.close();
    }
}
