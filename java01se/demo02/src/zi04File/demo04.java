package zi04File;

import java.io.File;

/*	判断功能的方法
	Public boolean exists():此File表示的文件或目录是否实际存在
	Public boolean isDirectory()：此File表示的是否是目录
    Public boolean isFile():此File表示的是否为文件*/
public class demo04 {
    public static void main(String[] args) {
        File file = new File("E:\\java-base\\untitled2\\src");
        boolean exists = file.exists();
        System.out.println(exists);/*true*/
        File file1 = new File("a.txt");
        boolean exists1 = file1.exists();
        System.out.println(exists1);//false
        boolean directory = file.isDirectory();
        System.out.println(directory);//true
        boolean file2 = file.isFile();
        System.out.println(file2);//false
    }
}
