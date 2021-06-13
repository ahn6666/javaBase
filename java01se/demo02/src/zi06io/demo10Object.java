package zi06io;

import java.io.*;

/*		Object readObject():从ObjectInputStream 读取对象
	使用步骤：
	1:创建ObjectInputStream对象：构造方法中传递字节输入流
	2:使用ObjectInputStream对象中的方法readObject读取保存对象的文件
	3:释放资源
    4:使用读取出来的对象（打印）*/
public class demo10Object {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("E:\\java-base\\untitled2\\src\\zi06io\\person.txt"));
        Object o = obj.readObject();
        System.out.println(o);
        person o1=(person) o;
        System.out.println(o1.getName()+"-"+o1.getAge());
        obj.close();
    }
}
