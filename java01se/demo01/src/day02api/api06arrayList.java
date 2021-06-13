package day02api;

import java.util.ArrayList;

public class api06arrayList {
    public static void main(String[] args) {
        ArrayList<String> person=new ArrayList<>();
        person.add("迪丽热巴");
        person.add("古力娜扎");
        person.add("易烊千玺");
        person.add("腾格尔");
        System.out.println(person);//[迪丽热巴, 古力娜扎, 易烊千玺, 腾格尔]
        String meinv= person.get(2);
        System.out.println(meinv);//易烊千玺
        person.remove(3);
        System.out.println(person);//[迪丽热巴, 古力娜扎, 易烊千玺]
        System.out.println(person.size());//3




        ArrayList<Integer> num=new ArrayList<>();
        num.add(100);
        num.add(200);
        num.add(300);
        System.out.println(num);//[100, 200, 300]

    }
}
