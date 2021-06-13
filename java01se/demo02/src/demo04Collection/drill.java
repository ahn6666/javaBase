package demo04Collection;

import java.util.ArrayList;

import java.util.Collections;

public class drill {
    public static void main(String[] args) {
        ArrayList<String> poker=new ArrayList<>();
        //定义两个数组 一个组装花色 一个组装数字
        String[] num={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color={"♥","♣","♦","♠"};
        //添加大小王
        poker.add("大王");
        poker.add("小王");
        //循环遍历两个
        for(String nums :num)
        {
                for (String colors:color)
                {
                    poker.add(nums+colors);
                }
        }
//        System.out.println(poker);
        //随机打乱
        Collections.shuffle(poker);
        System.out.println(poker);

        //定义四个集合 三个人和底牌
       ArrayList<String> one=new ArrayList<>();
       ArrayList<String> two=new ArrayList<>();
       ArrayList<String> three=new ArrayList<>();
       ArrayList<String> dipai=new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String p=poker.get(i);
            if(i>=51){dipai.add(p);}
            if(i%3==0){one.add(p);}
            if(i%3==1){two.add(p);}
            if(i%3==2){three.add(p);}
        }
        System.out.println("one"+one);
        System.out.println("two"+two);
        System.out.println("three"+three);
        System.out.println("dipai"+dipai);
    }

}
