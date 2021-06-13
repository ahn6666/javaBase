package demo07set;

import java.util.HashSet;

public class hashSet01 {
    public static void main(String[] args) {
        HashSet<String> obj=new HashSet<>();
        String p1=new String("abc");
        String p2=new String("abc");
        obj.add(p1);
        obj.add(p2);
        obj.add("重地");
        obj.add("通话");
        System.out.println(obj);//[重地, 通话, abc]
    }
}
