package demo08Map;
/*	Public V put(k key,v value):把指定的键与指定的值添加到Map集合中
	Public V remove（Object key）:把指定的键所对应的键值对元素在Map集合中删除 返回被删除的元素
	Public v get(Object key):根据指定的键，在Map集合中 获取对应的值
	Public set<K>keySet();获取Map集合中所以的键 存储set集合中
Public set<Map.Entry<K,v> entrySet()>:获取到Map集合中所有的键值对对象的集合（Set集合）。*/
import java.util.HashMap;
import java.util.Map;

public class demo01 {
    public static void main(String[] args) {
        methon01();
    }

    private static void methon01() {
        //多态
        Map<String,String> obj=new HashMap<>();
        obj.put("迪丽热巴","古力娜扎");
        obj.put("王子文","王文也");
        obj.put("小吕","小王");
        obj.put("孟玲","超凡");
        System.out.println(obj);
        String s = obj.remove("孟玲");
        System.out.println(s);
        System.out.println(obj);


        String ss = obj.get("迪丽热巴");
        System.out.println(ss);
        boolean s1 = obj.containsKey("迪丽热巴");
        boolean s2 = obj.containsKey("迪丽");
        System.out.println(s1);
        System.out.println(s2);

    }
}
