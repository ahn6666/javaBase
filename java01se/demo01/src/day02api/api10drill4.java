package day02api;

import java.util.ArrayList;
import java.util.Random;

//用一个大集合存入20个随机数字 然后筛选其中的偶数元素，输出小集合
public class api10drill4 {
    public static void main(String[] args) {
        ArrayList<Integer> big=new ArrayList<>();
        Random num=new Random();
        for (int i = 0; i < 20; i++) {
            int num1=num.nextInt(100)+1;
            big.add(num1);
        }
        System.out.println(big);
        ArrayList<Integer> result=getSmall(big);
        System.out.println(result);

    }
    public static ArrayList<Integer> getSmall(ArrayList<Integer> big)
    {
        ArrayList<Integer> small=new ArrayList<>();
        for (int i = 0; i < big.size(); i++) {
            int oushu=big.get(i);
            if(oushu%2==0)
            {
                small.add(oushu);
            }
        }
        return small;
    }
}
