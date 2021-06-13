package zi04File;

import java.io.File;

/*	获取功能的方法：
	Public String getAbsolute():返回此File的绝对路径名字字符串
	Public String getPath();将此File转换为路径名字字符串
	Public String getName():返回此File表示的文件或目录的名称
Public  long length()：返回由此File表示的文件的长度*/
public class demo03 {
    public static void main(String[] args) {
        File obj=new File("E:\\java-base\\untitled2\\src");
        File absoluteFile = obj.getAbsoluteFile();
        System.out.println(absoluteFile);
        String path = obj.getPath();
        System.out.println(path);
        String name = obj.getName();
        System.out.println(name);//src

        long length = obj.length();
        System.out.println(length);

        System.out.println(obj);
        System.out.println(obj.toString());
    }
}
