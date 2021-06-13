package zi05io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*字节输出流的使用步骤（重点）：
1：创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
2：调用FileOutputStream对象中的方法write,把数据写入到文件中
3:  释放资源（流使用会占用一定的内存，使用完毕要把内存清空，提供程序的效率）。*/
public class demo02moul {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("E:\\java-base\\untitled2\\src\\zi05io\\ob.txt");
        f.write(49);
        f.write(48);
        f.write(48);
//        f.close();

        //使用len  创建中文
        byte[] bytes={66,67,68,69,65};
//        byte[] bytes={-66,-67,-68,69,65};
        f.write(bytes);
        f.write(bytes,2,1);
        f.close();

        //写入字符的方法 字符串转化为字节数组
        byte[] bytes1 = "你好".getBytes();
        System.out.println(bytes1);
        System.out.println(Arrays.toString(bytes1));
    }
}
