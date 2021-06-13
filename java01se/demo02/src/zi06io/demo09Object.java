package zi06io;

import java.io.*;

/*	1:创建ObjectOutputStream对象，构造方法中传递字节输出流
	2:使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
3：释放资源*/
public class demo09Object {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream one = new ObjectOutputStream(new FileOutputStream(new File("E:\\javaStudy\\java-se\\demo002\\src\\zi06io\\a.txt")));
        one.writeObject(new person("迪丽热巴", 18));
        one.close();
    }
}
