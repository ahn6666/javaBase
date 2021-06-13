package zi05io;

import java.io.FileWriter;
import java.io.IOException;

public class demo10 {
    public static void main(String[] args) {
        FileWriter obj=null;
        try{

            obj = new FileWriter("W:\\java-base\\untitled2\\src\\zi05io\\obj4.txt",true);
            for (int i = 0; i <20 ; i++) {
                obj.write("heloo"+i+"\r\n");
            }
        }catch (IOException e)
        {
            //异常的处理逻辑
            System.out.println(e);
        }finally {
            //创建对象失败了 OBJ的默认值就是null null是不能调用方法的 会抛出NullPointerException，需要加一个判断
            if (obj!=null)
            {
                try {

                    obj.close();
                }catch (IOException e)
                {
                    e.printStackTrace();//java.lang.NullPointerException 如果不是在电脑的磁盘中会爆操
                }
            }

        }

    }
}
