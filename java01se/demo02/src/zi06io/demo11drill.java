package zi06io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 对集合进行序列化和反序列化
* 分析：
* 1：定义一个存储person对象的ArrayList集合
* 2:往ArrayList集合中存储Person对象
* 3:创建一个序列化流ObjectOutputStream对象
* 4:使用ObjectOutputStream对象中的方法writeObject,对集合进行序列化
* 5:创建一个反序列化ObjectInputStream对象
* 6:使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
* 7：把Object类型的集合转化为ArrayList类型
* 8: 遍历ArrayList集合
* 9：释放资源
* */
public class demo11drill {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<person> obj=new ArrayList<person>();
        obj.add(new person("迪丽热巴",18));
        obj.add(new person("古力娜扎",18));
        obj.add(new person("马儿扎哈",18));
        obj.add(new person("蒙娜丽莎",18));

        /*3:创建一个序列化流ObjectOutputStream对象
         * 4:使用ObjectOutputStream对象中的方法writeObject,对集合进行序列化*/
        ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(new File("E:\\javaStudy\\java-se\\demo002\\src\\zi06io\\b.txt")));
        ob.writeObject(obj);

        ObjectInputStream ob1 = new ObjectInputStream(new FileInputStream("E:\\javaStudy\\java-se\\demo002\\src\\zi06io\\b.txt"));
        ob1.readObject();
        /* 7：把Object类型的集合转化为ArrayList类型
         * 8: 遍历ArrayList集合
         * 9：释放资源*/
        ArrayList<person> obj1=(ArrayList<person>) obj;
        for (zi06io.person person : obj1) {
            System.out.println(person);
        }
        ob1.close();
        ob.close();

    }
}
