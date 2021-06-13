package zi05io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*	Jdk7的新特性
	在try的后面可以增加一个（），在括号中可以定义流对象
	那么这个流对象的作用域就在try中有效
	try中的代码执行完毕，会自动把流对象释放，不用写finally
	格式：
		Try(定义流对象;定义流对象..){
			可能会产生异常的代码
		}catch(异常类变量 变量名)
		{
			异常的处理逻辑
}*/
public class demo11 {
    public static void main(String[] args) {
     try (FileInputStream o= new FileInputStream("E:\\java-base\\untitled2\\src\\zi05io\\ob.txt");
          FileOutputStream obj= new FileOutputStream("E:\\java-base\\untitled2\\src\\zi05io\\obj1.txt");)
     {
         int len=0;
         while((len=o.read())!=-1)
         {
//            System.out.println(len);
             obj.write(len);
         }
     }catch (IOException e){
         System.out.println(e);
     }



    }
}
