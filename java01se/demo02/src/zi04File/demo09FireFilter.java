package zi04File;

import java.io.File;

public class demo09FireFilter {
    public static void main(String[] args) {
        File file = new File("E:\\java-base\\untitled2\\src");
        methon(file);
    }

    public static void methon(File file) {


        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile())
            {
                //文件的搜索功能

                if (file1.toString().toLowerCase().endsWith("imp.java"))
                {

                    System.out.println(file1);
                }
            }else{
                methon(file1);
            }

        }
    }
}
