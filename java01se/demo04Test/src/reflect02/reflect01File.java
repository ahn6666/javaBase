package reflect02;



import reflect01.person;

import java.lang.reflect.Field;

/*			*Field[] getFields():获取所有的public修饰的成员变量
         *Filed getField(String name)：获取指定名称的Public 修饰的成员变量

         *Field[] getDeclaredFields()：获取所有的成员变量，不考虑修饰符
         *Field getDeclaredField(String name)*/
public class reflect01File {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //获取person的class对象
        Class pe = person.class;


        Field[] fields = pe.getFields();
        for (Field field : fields) {
            System.out.println(field);//获取所有的public修饰的成员变量
            //public java.lang.String Reflect03.person.pu1
            //public java.lang.String Reflect03.person.pu2
        }
        System.out.println("-----------");
        Field field = pe.getField("pu1");
//        System.out.println(field);
        person p=new person();
        Object o = field.get(p);
        System.out.println(o);
        //null
        field.set(p,"张三");
        System.out.println(field.get(p));//张三

        System.out.println("---------------------");
        /*Field[] getDeclaredFields()：获取所有的成员变量，不考虑修饰符
         *Field getDeclaredField(String name)*/

        Field[] de = pe.getDeclaredFields();//获取所有的成员变量，不考虑修饰符
        for (Field field1 : de) {
            System.out.println(field1);
        }

        System.out.println("-------------------");
        Field p3 = pe.getDeclaredField("p3");
        System.out.println(p3);//protected java.lang.String Reflect03.person.p3
        //忽略访问权限修饰符
        p3.setAccessible(true);//暴力检查

        Object valus = p3.get(p);
        System.out.println(valus);//null
    }
}
