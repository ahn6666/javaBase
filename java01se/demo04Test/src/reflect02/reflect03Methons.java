package reflect02;



import reflect01.person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*  	    • Methon[] getMethods()
			• Methon getMethod（String name,类<?>…parameterTypes）
			• Methon[] getDeclareMethods()
              Mthon getDeclareMethods(String name ,类<?>…parameterTypes)*/
public class reflect03Methons {
public static void main(String[] args) throws Exception{
//获取person的class对象
            Class pe = person.class;
//            • Methon[] getMethods()
//			• Methon getMethod（String name,类<?>…parameterTypes）

    Method[] methods = pe.getMethods();
    for (Method method : methods) {
        System.out.println(method);
        System.out.println(method.getName());
//        method.setAccessible(true);
    }
    System.out.println("------------");
    Method eat = pe.getMethod("eat");
    person p=new person();
    eat.invoke(p);//eat>..
    Method eat1 = pe.getMethod("eat",String.class);
    eat1.invoke(p,"fan");//eat>..fan

    System.out.println("----------------");

    //获取类名
    String name = pe.getName();
    System.out.println(name);//Reflect03.person
}
}

