package demo08Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo03 {
    public static void main(String[] args) {
        Map<String, person> obj=new HashMap<>();
        person one=new person("迪丽热巴",18);
        person two=new person("古力娜扎",18);
        person there=new person("马儿扎哈",18);
        person four=new person("易烊千玺",18);
        obj.put("你好",one);
        obj.put("啊",two);
        obj.put("小吕",there);
        obj.put("啊",four);
        /*Set<String> obj1=obj.keySet();
        for (String s : obj1) {
            person value=obj.get(s);
            System.out.println(s +"--->"+value);
        }*/

        //使用键值
        Set<Map.Entry<String, person>> obj1=obj.entrySet();
        for (Map.Entry<String, person> Entry : obj1) {
            person value=Entry.getValue();
            String str=Entry.getKey();
            System.out.println(str+"-->"+value);

        }

    }
}
