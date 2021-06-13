package reflect02;



import reflect01.person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*2：获取构造方法们
*Constructor <?>[] getConstrctors()
*Constructor<T> getConstructor(类<?>…parameterTypes)
*Constructor<T> getDeclaredConstructor(类<?> …parameterTypes)
*Constructor<?>[] getDeclaredConstructors()*/
public class reflect02Cons {
public static void main(String[] args) throws Exception{
//获取person的class对象
Class pe= person.class;
Constructor constructor = pe.getConstructor(String.class, int.class);
System.out.println(constructor);
//创建对象
Object zhang = constructor.newInstance("张三", 18);
System.out.println(zhang);

//利用空参也可以
Constructor constructor1 = pe.getConstructor();

//创建对象1
Object zhang1 = constructor1.newInstance();
System.out.println(zhang1);


//直接访问 也就是空参
Object o = pe.newInstance();
System.out.println(o);
System.out.println("----------------------");
//*Constructor<T> getDeclaredConstructor(类<?> …parameterTypes)
//       *Constructor<?>[] getDeclaredConstructors()*/
Constructor[] declaredConstructors = pe.getDeclaredConstructors();
for (Constructor dec : declaredConstructors) {
System.out.println(dec);
}
}
}
