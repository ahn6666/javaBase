package zi05io;

import java.io.FileOutputStream;
import java.io.IOException;

public class demo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream obj = new FileOutputStream("E:\\java-base\\untitled2\\src\\zi05io\\ccc.txt",true);
     /*   for (int i = 0; i < 20; i++) {
            obj.write("你好".getBytes());
            obj.write("\r\n".getBytes());
        }*/
        obj.write("你好".getBytes());
        obj.close();
        //每次都会增加

    }
}
