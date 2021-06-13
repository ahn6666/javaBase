package zi04File;

import java.io.File;

/*	Public String[] list():返回一个String 数组，表示该File目标中的所有子文件或目录
Public File[] listFiles()：返回一个File数组，表示该File目录中的所有的子文件或目录。*/
public class demo06 {
    public static void main(String[] args) {
        File file = new File("E:\\java-base\\untitled2\\src\\zi04File");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
