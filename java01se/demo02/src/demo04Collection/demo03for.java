package demo04Collection;

import java.util.ArrayList;

public class demo03for {
    public static void main(String[] args) {
        ArrayList<String> obj=new ArrayList<>();
        obj.add("AAA");
        obj.add("BBB");
        obj.add("CCC");
        obj.add("DDD");
        for(String i: obj)
        {
            System.out.println(i);
        }
    }
}
