package demo04Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class fanXing {
    public static void main(String[] args) {
        //创建集合对象 不使用泛型
        //优点：集合不使用泛型 可以存储任何类型的数据 弊端：不安全 会引起弊端
        ArrayList obj=new ArrayList();
        obj.add("abc");
        obj.add("b");
        obj.add("c");
        obj.add("d");
//        obj.add(1);//    java.lang.ClassCastException
        //创建迭代器
        Iterator<String> obj1=obj.iterator();
        while (obj1.hasNext())
        {
            String obj3 = obj1.next();
            System.out.println(obj3);
            String obj2=(String)obj3;//向下转型
            System.out.println(obj3.length());
        }

        /*        创建集合对象 使用泛型
            好处：1:避免了类型转换的麻烦，存储的是什么类型取出的就是什么类型
            2:运行期异常 （代码运行之后会抛出的异常） 提升到了编译期
            弊端：泛型是什么类型  只能存储什么类型的数据
         */
        System.out.println("=================");
        ArrayList<String> one=new ArrayList<>();
        one.add("aaa");
        one.add("b");
        one.add("cc");
        one.add("1");
        Iterator<String> two=one.iterator();
        while (two.hasNext())
        {
            String next = two.next();
            System.out.println(next+"->"+next.length());
        }

    }
}
