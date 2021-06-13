package demo06list;
/*		-public void add(int index,E element):将指定的元素 添加到该集合的指定位置上
		-public E get(int index):返回集合中指定位置的元素
		-public E remove(int index):移动列表中指定位置的元素，返回的是被移除的元素
-public E set(int index,E element):用指定元素替换集合中指定位置的元素，返回值的更新前的元素*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list01 {
    public static void main(String[] args) {
        //多态的写法
        List<String> obj=new ArrayList<>();
        obj.add("A");
        obj.add("b");
        obj.add("c");
        obj.add("d");
        obj.add("e");
        System.out.println(obj);
        String s = obj.get(1);
        System.out.println(s);
        obj.remove(2);
        System.out.println(obj);
        obj.set(1,"nihao");
        System.out.println(obj);
        System.out.println("============");

        for (int i = 0; i <obj.size() ; i++) {
            System.out.println(obj.get(i));
        }
        System.out.println("============");

        Iterator<String> obj1=obj.iterator();
        while (obj1.hasNext())
        {
            System.out.println(obj1.next());
        }
        System.out.println("============");
        for (String s1 : obj) {
            System.out.println(s1);
        }
    }
}
