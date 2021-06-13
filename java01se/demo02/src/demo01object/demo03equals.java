package demo01object;

import java.util.Objects;

public class demo03equals {
    public static void main(String[] args) {
        demo02person p1=new demo02person("迪丽热巴",18);
        demo02person p2=new demo02person("古力娜扎",19);
        System.out.println(p1);//demo02person{name='迪丽热巴', num=18}
        System.out.println(p2);//demo02person{name='古力娜扎', num=19}
        boolean equals = p1.equals(p2);
        System.out.println(equals);
        p1=p2;
        System.out.println(p1);//demo02person{name='古力娜扎', num=19}
        System.out.println(p2);//demo02person{name='古力娜扎', num=19}
        boolean equals1 = p1.equals(p2);
        System.out.println(equals1);


        //objects 类
        String s1=null;
        String S2="abs";
        boolean aaaa = Objects.equals(s1,S2);
        System.out.println(aaaa);

    }
}
