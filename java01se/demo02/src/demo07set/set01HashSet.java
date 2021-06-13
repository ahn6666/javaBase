package demo07set;

import java.util.HashSet;
import java.util.Iterator;

public class set01HashSet {
    public static void main(String[] args) {
        HashSet<String> obj=new HashSet<>();
        obj.add("A");
        obj.add("b");
        obj.add("c");
        obj.add("d");
        obj.add("b");
        System.out.println(obj);//[A, b, c, d]

        for (String s : obj) {
            System.out.println(s);//A b c d
        }

        Iterator<String> obj1=obj.iterator();
        while (obj1.hasNext())
        {
            System.out.println(obj1.next());//A b c d
        }
    }
}
