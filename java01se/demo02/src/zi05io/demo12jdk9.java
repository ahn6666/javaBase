package zi05io;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*	JDK9新特性
		try的前面可以定义流对象
		在try后边（）中可以直接引入流对象的名称（变量名）
		在try代码执行完毕之后，流对象也可以释放掉，不用写finally
		格式：
		A a=new A();
		B b=new B();
		Try (a,b){
			可能会产生异常的代码
		}catch(异常类变量 变量名)
		{
			异常的处理逻辑
}*/
public class demo12jdk9 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream o = new FileInputStream("E:\\java-base\\untitled2\\src\\zi05io\\ob.txt");
        FileOutputStream obj = new FileOutputStream("E:\\java-base\\untitled2\\src\\zi05io\\obj5.txt");
        try(o;obj){
            int len=0;
            while((len=o.read())!=-1)
            {
//            System.out.println(len);
                obj.write(len);
            }
        }catch (IOException e)
        {
            System.out.println(e);
        }

    }
}
