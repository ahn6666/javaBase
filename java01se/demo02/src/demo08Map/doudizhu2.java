package demo08Map;

import java.util.*;

public class doudizhu2 {
    public static void main(String[] args) {

//  定义一个集合 包含索引和信息
        HashMap<Integer, String> poker = new HashMap<>();
        //定义一个索引的集合
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] color = {"♥", "♣", "♦", "♠"};
        int index = 0;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "大王");
        pokerIndex.add(index);
        for (String nums : num) {
            for (String colors : color) {
                index++;
                poker.put(index, nums + colors);
                pokerIndex.add(index);
            }
        }

        Collections.shuffle(pokerIndex);
        System.out.println(poker);
        System.out.println(pokerIndex);

        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();

        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in=pokerIndex.get(i);
            if(i>=51){dipai.add(in);}
            if(i%3==0){one.add(in);}
            if(i%3==1){two.add(in);}
            if(i%3==2){three.add(in);}
        }

        methon("刘德华",poker,one);
        methon("黄晓明",poker,two);
        methon("杨颖",poker,three);
        methon("范冰冰",poker,dipai);
    }

    private static void methon(String name,HashMap<Integer, String> poker,ArrayList<Integer> obj) {
        Collections.sort(obj);
        System.out.println(name+": ");
        for (Object o : obj) {
            String s = poker.get(o);
            System.out.println(s+"");
        }
        System.out.println();
    }
}
