package zi04File;

import java.io.File;

public class demo10FireFilter {
    public static void main(String[] args) {
        File file = new File("E:\\java-base\\untitled2\\src");
        methon(file);
    }

    public static void methon(File file) {
        File[] files1 = file.listFiles(new demo11fileFilterimp());//创建过滤器对象
        for (File file1 : files1) {
            if(file1.isFile())
            {
                    System.out.println(file1);

            }else{
                methon(file1);
            }

        }
    }
}
