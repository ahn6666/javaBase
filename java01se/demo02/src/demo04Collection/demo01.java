package demo04Collection;

import java.util.ArrayList;
import java.util.Collection;

public class demo01 {
    public static void main(String[] args) {
        Collection<String> obj=new ArrayList<>();//多态写法
        obj.add("a");
        obj.add("b");
        obj.add("c");
        obj.add("d");
        obj.add("e");
        System.out.println(obj);

        boolean one = obj.contains("e");
        System.out.println(one);

        boolean empty = obj.isEmpty();
        System.out.println(empty);

        obj.remove("e");
        System.out.println(obj);

        Object[] objects = obj.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
