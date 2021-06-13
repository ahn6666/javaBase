package zi04File;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

/*	创建删除功能的方法：
	Public boolean creatNewFile():当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
	Public boolean delete():删除由此File表示的文件或目录
	Public boolean mkdir():创建由此File表示的目录
    Public boolean mkdirs():创建由此File表示的目录，包括任何必需但不存在的父目录*/
public class demo05 {
    public static void main(String[] args) throws IOException {
       /* //创建文件
        File f = new File("E:\\java-base\\untitled2\\src\\aaa.tex");
        System.out.println(f.exists());//false
        System.out.println(f.createNewFile());//true
        System.out.println(f.exists());//true
        File f4 = new File("src\\eee.tex");
        System.out.println(f4.exists());//false
        System.out.println(f4.createNewFile());//true
        System.out.println(f4.exists());//true
        //创建目录
        File f1 = new File("E:\\java-base\\untitled2\\src\\bbb");
        System.out.println(f1.exists());
        System.out.println(f1.mkdir());
        System.out.println(f1.exists());
        //创建多级目录
        File f2 = new File("E:\\java-base\\untitled2\\src\\bbb\\ccc");
        System.out.println(f2.exists());
        System.out.println(f2.mkdirs());
        System.out.println(f2.exists());
        System.out.println("===========");
        //删除
        System.out.println(f.delete());
        System.out.println(f.exists());
        System.out.println(f1.delete());
        System.out.println(f1.exists());
        File file = new File("E:\\java-base\\untitled2\\src\\bbb\\ccc");
        System.out.println(file.delete());
        System.out.println(file.exists());
        System.out.println(f4.delete());
        System.out.println(f4.exists());*/
    }
}
