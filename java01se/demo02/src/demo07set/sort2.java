package demo07set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sort2 {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>();
        obj.add(1);
        obj.add(3);
        obj.add(2);
        System.out.println(obj);
      Collections.sort(obj, new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
              return o1-o2;
          }
      });
        System.out.println(obj);

        //自定义类
        ArrayList<sort2per> stu=new ArrayList<>();
        stu.add(new sort2per("b迪丽热巴",18));
        stu.add(new sort2per("c古力娜扎",20));
        stu.add(new sort2per("a迪丽热巴",20));
        stu.add(new sort2per("a马儿扎哈",17));
        System.out.println(stu);
        Collections.sort(stu, new Comparator<sort2per>() {
            @Override
            public int compare(sort2per o1, sort2per o2) {
                int result=o1.getAge()-o2.getAge();
                if(result==0)
                {
                    result=o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(stu);


    }
}
