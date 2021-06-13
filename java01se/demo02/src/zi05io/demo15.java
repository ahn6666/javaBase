package zi05io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*	Load:
	可以使用propertise集合中的方法load 把硬盘中保存的文件（键值对）读取到集合中使用
	Void load(InputStream inStream)
	Void load(Reader reader)
	参数：
	InputStream inStream:字节输入流 不能读取含有中文的键值对
	Reader reader:字符输入流，能读取含有中文的键值对
	使用步骤：
	1:创建propertise集合对象
	2:使用propertise集合对象中的方法load读取保存键值对的文件
	3：遍历propertise集合
	注意：
	1：存储键值对的文件中 键与值默认的连接符号可以使用=，空格（其他符号）
	2：存储键值对的文件中，可以使用#进行注释，被注释的键值对不会再被读取
	3:  存储键值对的文件中，键与值默认都是字符串，不用在加引号。
*/
public class demo15 {
    public static void main(String[] args) throws IOException {
        methon();
    }
    public static  void methon() throws IOException {

        Properties obj = new Properties();
      obj.load(new FileReader("E:\\java-base\\untitled2\\src\\zi05io\\obj6.txt"));
        Set<String> ob = obj.stringPropertyNames();
        for (String s : ob) {
            System.out.println(s+"="+obj.getProperty(s));
        }
    }
}
