package demo04Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo02Iterator {
    public static void main(String[] args) {
        Collection<String> obj=new ArrayList<>();
        obj.add("abc");
        obj.add(" a ");
        Iterator<String> a=obj.iterator();

       /* while (a.hasNext()){
            System.out.println(a.next());
        }*/

        Iterator<String> iterator =obj.iterator();
        for (;iterator.hasNext(); )
        {
            System.out.println(iterator.next());
        }
        boolean b = a.hasNext();
        String next = a.next();
        System.out.println("判断的结果"+b+"取出来的值为"+next);
        boolean b1 = a.hasNext();
        String next1 = a.next();
        System.out.println("判断的结果"+b1+"取出来的值为"+next1);


    }
}
