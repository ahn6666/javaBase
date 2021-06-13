package zi03Lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

//有参数有返回值的类型
public class demo02 {
    public static void main(String[] args) {
        demo02person[] arr={
                new demo02person("迪丽热巴",18),
                new demo02person("古力娜扎",19),
                new demo02person("马儿扎哈",13),
                new demo02person("易烊千玺",10),
        };
        /*Arrays.sort(arr, new Comparator<demo02person>() {
            @Override
            public int compare(demo02person o1, demo02person o2) {
                return o1.getNum()-o2.getNum();
            }
        });*/
            //使用匿名内部类
        Arrays.sort(arr,((o1, o2) -> o1.getNum()-o2.getNum()));


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
        }
    }
}
