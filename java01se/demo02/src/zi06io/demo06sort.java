package zi06io;
/*对文本内容进行排序
* 按照（1，2，3）顺序排序
* 分析：
* 1:创建一个HashMap集合对象，可以：存储每行文本的序号（1，2，3...）;value:存储每行的文本
* 2:创建字符缓冲输入流对象，构造方法中绑定字符输入流
* 3:创建字符缓冲输出流对象，构造方法中绑定字符输出流
* 4:使用字符缓冲输入流中的方法readline,逐行读取文本
* 5:对读取到的文本进行切割，获取行中的序号和文本内容
* 6：把切割好的序号和文本的内容存储到HashMap集合中（key序号是有序的，会自动排序1，2，3，。。。）
* 7:遍历HashMap集合，获取每一个键值对
* 8:把每一个键值对，拼接为一个文本行
* 9：把拼接好的文本，使用字符缓冲输出流中的方法write，写入到文件中
* 10：释放资源
* */
import java.io.*;
import java.util.HashMap;

public class demo06sort {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> obj=new HashMap<>();
        BufferedReader o1 = new BufferedReader(new FileReader("E:\\javaStudy\\java-se\\demo002\\src\\zi06io\\d.txt"));
        BufferedWriter o2 = new BufferedWriter(new FileWriter("E:\\javaStudy\\java-se\\demo002\\src\\zi06io\\e.txt"));
        String len;
        while ((len=o1.readLine())!=null)
        {
            //切割文本
            String[] arr=len.split("\\.");
            //把切割好的序号和文本内容存储到Ha'shmap集合中（key序号是有序的会自动排序）
            obj.put(arr[0],arr[1]);
        }
        //遍历HashMap集合 获取每一个键值对
        for (String s : obj.keySet()) {
            String value=obj.get(s);
            //把每一个键值对 拼接为一个文本行
            len=s+ "" +value;
            //把拼接好的文本 写道文件中
            o2.write(len);
            o2.newLine();
        }
        o2.close();
        o1.close();
    }
}
