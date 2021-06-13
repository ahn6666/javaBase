package zi04File;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class demo12FireFilter {
    public static void main(String[] args) {
        File file = new File("E:\\java-base\\untitled2\\src");
        methon(file);
    }

    public static void methon(File file) {
       /* File[] files1 = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith("imp.java");
            }
        });*/


     /*   File[] files1 = file.listFiles(new FilenameFilter(){

            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith("imp.java");
            }
        });*/
        //lambda表达式简化
    /*    File[] files1 = file.listFiles((File dir,String name)->{


                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith("imp.java");

        });*/
        //继续简化
        File[] files1 = file.listFiles((dir,name)->new File(dir,name).isDirectory()||name.toLowerCase().endsWith("imp.java"));
        //创建过滤器对象
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
