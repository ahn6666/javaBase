package demo08Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//第二种方式		第二种方法：
//		Map.Entry<k,y>在Map接口中有一个内部接口Entry
//		作用：当Map集合一件创建 那么就会在Map集合中创建一个Entry对象，用来创建一个Entry对象 用来记录键与值（键值对对象，键与值的映射关系）--结婚证
public class demo02ergodic1 {
    public static void main(String[] args) {
        Map<String, Integer> obj = new HashMap<>();
        obj.put("迪丽热巴", 18);
        obj.put("古力娜扎", 19);
        obj.put("马儿扎哈", 20);
        obj.put("易烊千玺", 16);
        Set<Map.Entry<String, Integer>> entry = obj.entrySet();

        Iterator<Map.Entry<String, Integer>> one = entry.iterator();
        while (one.hasNext()) {
            Map.Entry<String, Integer> next = one.next();
            System.out.println(next);
            System.out.println("==========");
            String name = next.getKey();
            Integer num = next.getValue();
            System.out.println(name + "年龄" + num);
        }
        System.out.println("==========");
        for (Map.Entry<String, Integer> one1 : entry) {
            String name = one1.getKey();
            Integer num = one1.getValue();
            System.out.println(name + "年龄" + num);


        }
    }
}