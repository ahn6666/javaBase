package day02api;

import java.util.ArrayList;
import java.util.Random;

//题目：生成6个1-33之间的随机整数 ，添加到集合，并遍历集合
public class api07drill1 {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 6; i++) {
            int num1=r.nextInt(33)+1;
            num.add(num1);
        }
        System.out.println(num);
    }
}
