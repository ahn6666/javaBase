package demo07set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashSet04link {
    public static void main(String[] args) {
        HashSet<String> obj=new HashSet<>();
        obj.add("www");
        obj.add("abc");
        obj.add("eee");
        System.out.println(obj);//无序 每次不一样[abc, eee, www]
        LinkedHashSet<String> obj1=new LinkedHashSet<>();
        obj1.add("www");
        obj1.add("abc");
        obj1.add("eee");
        System.out.println(obj1);//有序[www, abc, eee]
    }
}
