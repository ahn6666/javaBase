package zi06io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*	使用步骤：
	1:创建FileOutputStream对象，构造方法中绑定要输出的目的地
	2:创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FileOutputStream的写入效率
	3：使用BufferedOutputStream对象中的方法write，把数据写入到内部缓冲区中
	4: 使用BufferedOutputStream对象中的方法flush,把内部缓冲区中的数据 刷新到文件中
5：释放资源（会先调用flush方法刷新数据 ，第4步可以省略）*/
public class demo01output {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream obj = new BufferedOutputStream(new FileOutputStream("E:\\java-base\\untitled2\\src\\zi06io\\a.txt"));
        obj.write("a".getBytes());
        obj.close();

    }
}
