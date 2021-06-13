package demo10throwable;

import java.io.IOException;

public class demo05try {
    public static void main(String[] args) {
       try {
           file("c:\\a.tx");
       }catch ( IOException e){
           System.out.println("输出异常");

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
