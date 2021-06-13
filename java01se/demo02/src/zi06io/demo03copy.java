package zi06io;

import java.io.*;

public class demo03copy {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        BufferedInputStream obj = new BufferedInputStream(new FileInputStream("E:\\javaStudy\\java-se\\demo002\\src\\zi06io\\a.txt"));
        BufferedOutputStream obj1 = new BufferedOutputStream(new FileOutputStream("E:\\java-base\\untitled2\\src\\zi06io\\b.txt"));
        int len=0;
        while ((len=obj.read())!=-1)
        {
//            System.out.println((char)len);
            obj1.write(len);

        }
        obj1.close();
        obj.close();
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
