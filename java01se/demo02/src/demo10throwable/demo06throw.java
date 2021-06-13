package demo10throwable;

import java.io.IOException;

public class demo06throw{
    public static void main(String[] args) {
        try {
            file("c:\\a.tx");
        }catch ( IOException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);


        }
    }
    public static int file(String file) throws IOException {
      /*  if(!file.equals("c:\\a.txt"))
        {
            throw new FileNotFoundException("找不到该文件");
        }*/
        if(!file.endsWith("txt"))
        {
            throw  new IOException("后缀名不对");
        }
        return 0;
    }
}
