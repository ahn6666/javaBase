package demo08Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class demo04linkedHashmap {
    public static void main(String[] args) {
        HashMap<String,String> obj=new HashMap<>();
        obj.put("a","a");
        obj.put("c","c");
        obj.put("b","b");
        obj.put("a","b");
        System.out.println(obj);//无序{a=b, b=b, c=c}
        LinkedHashMap<String,String> obj1=new LinkedHashMap<>();
        obj1.put("a","a");
        obj1.put("c","c");
        obj1.put("b","b");
        obj1.put("a","b");
        System.out.println(obj1);//{a=b, c=c, b=b}
    }
}
