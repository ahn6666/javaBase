package zi07stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Stream;

import static java.lang.System.*;

public class demo01base {
    public static void main(String[] args) {
        Stream<String> obj= Stream.of("你好", "hi");
        obj.forEach((String name)->{
            out.println(name);
        });


        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        Stream<Integer> arr1=arr.stream();
        arr1.forEach((Integer one)->{
            System.out.println(one);
        });

        HashMap<Object, Object> map = new HashMap<>();
        map.put("迪丽热巴",18);
        map.put("古力娜扎",18);
        map.put("马尔扎哈",18);
        Set<Object> objects = map.keySet();
        Stream<Object> stream = objects.stream();
        stream.forEach(two-> out.println(two));
        Collection<Object> values = map.values();
        Stream<Object> stream1 = values.stream();
        stream1.forEach(two1-> out.println(two1));


    }
}
