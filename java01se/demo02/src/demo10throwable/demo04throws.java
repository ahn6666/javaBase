package demo10throwable;

import java.io.FileNotFoundException;
import java.io.IOException;

public class demo04throws {
    public static void main(String[] args) throws IOException {
            /*file("a:\\a.txt");*/
            file("c:\\a.tx");
    }
    public static int file(String file) throws IOException {
        if(!file.equals("c:\\a.txt"))
        {
            throw new FileNotFoundException("找不到该文件");
        }
        /*if(!file.endsWith("txt"))
        {
            throw  new IOException("后缀名不对");
        }*/
        return 0;
    }

}
