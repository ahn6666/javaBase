package demo08Map;
//第一种遍历方式 通过键找值的方式
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo02ergodic {
    public static void main(String[] args) {
        Map<String,Integer> obj=new HashMap<>();
        obj.put("迪丽热巴",18);
        obj.put("古力娜扎",19);
        obj.put("马儿扎哈",20);
        obj.put("易烊千玺",16);
        System.out.println(obj);
        Set<String> keySet=obj.keySet();
        //使用Iteartor
        Iterator<String> one=keySet.iterator();
        while (one.hasNext())
        {
            String next = one.next();
            Integer integer = obj.get(next);
            System.out.println(next+integer);
        }
        //使用for增强
        for (String s : keySet) {
            Integer integer = obj.get(s);
            System.out.println(s+integer);
        }

    }
}
