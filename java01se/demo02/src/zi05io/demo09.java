package zi05io;

import java.io.FileWriter;
import java.io.IOException;
/*
    FileWriter（String fileName,boolean append）
    FileWriter(File file,boolean append)
*/

public class demo09 {
    public static void main(String[] args) throws IOException {
        FileWriter obj = new FileWriter("E:\\java-base\\untitled2\\src\\zi05io\\obj3.txt",true);
        for (int i = 0; i <20 ; i++) {
            obj.write("heloo"+i+"\r\n");
        }
        obj.close();

    }
}
