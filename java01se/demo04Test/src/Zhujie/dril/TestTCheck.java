package Zhujie.dril;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class TestTCheck {
    public static void main(String[] args) throws IOException {
        //创建计算机对象
        Calculator calculator = new Calculator();
        //获取计算机对象的字节码文件对象
        Class aClass = calculator.getClass();
        //获取所有Public方法
        Method[] methods = aClass.getMethods();

        //出现异常的次数
        int num=0;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bug.txt"));
        //遍历方法注解
        for (Method method : methods) {
            //判断方法上是否定义了check注解
            if (method.isAnnotationPresent(chek.class)){
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    num++;

                    bufferedWriter.write(method.getName()+"方法出现了异常");
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常名称"+e.getCause().getClass().getSimpleName());
                    bufferedWriter.newLine();
                    bufferedWriter.write("--------------");
                    bufferedWriter.newLine();
                }
            }
        }

        bufferedWriter.write("本次测试一共出现"+num+"此异常");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
