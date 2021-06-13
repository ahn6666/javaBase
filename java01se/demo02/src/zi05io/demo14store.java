package zi05io;

import java.io.*;
import java.util.Properties;

/*	Store:
	可以使用propertise集合中的方法store，把集合中的临时数据，持久化写入到硬盘存储
	Void store（outputStream out,String comments）
	Void srore  (Writer writer,String comments)
	参数：
			OutputStream out:字节输出流 不能写入中文
			Write write:字符输出流 可以写中文
			String comments:注释 用来解释说明保存的文件是做什么用的
			不能使用中文，会产生乱码，默认是Unicode编码
			一般使用“空字符串”
		使用步骤：
		1:创建propertise集合对象 添加数据
		2:创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
		3:使用propertise集合中的store，把集合中的临时数据 持久化写入到硬盘中存储
		4:释放资源
*/
public class demo14store {
    public static void main(String[] args) throws IOException {
        methon();
    }

    private static void methon() throws IOException {
        Properties obj = new Properties();
        obj.setProperty("迪丽热巴","18");
        obj.setProperty("古力娜扎","18");
        obj.setProperty("马儿扎哈","18");
        obj.setProperty("蒙娜丽莎","18");

        FileWriter ob= new FileWriter("E:\\java-base\\untitled2\\src\\zi05io\\obj6.txt");
//        使用propertise集合中的store，把集合中的临时数据 持久化写入到硬盘中存储
            obj.store(ob,"save");
            ob.close();
    }
}
