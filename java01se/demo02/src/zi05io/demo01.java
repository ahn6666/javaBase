package zi05io;

import java.io.FileOutputStream;
import java.io.IOException;

/*字节输出流的使用步骤（重点）：
1：创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
2：调用FileOutputStream对象中的方法write,把数据写入到文件中
3:  释放资源（流使用会占用一定的内存，使用完毕要把内存清空，提供程序的效率）。*/
public class demo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("E:\\java-base\\untitled2\\src\\zi05io\\obj.txt");
        f.write(97);
        f.close();
    }
}
