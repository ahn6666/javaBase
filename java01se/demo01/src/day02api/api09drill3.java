package day02api;

import java.util.ArrayList;

//题目:按指定格式打印集合{方式@附近@看过了@考虑到}
public class api09drill3 {
    public static void main(String[] args) {
        ArrayList<String> person=new ArrayList<>();
        person.add("你好");
        person.add("我好");
        person.add("大家好");
        person.add("才是真好");
        System.out.println(person);
        System.out.println("{");
        for (int i = 0; i < person.size(); i++) {
            String name=person.get(i);
            if (i<person.size()-1)
            {
                System.out.println(name+"@");
            }else {
                System.out.println(name+"}");
            }

        }

    }
}
