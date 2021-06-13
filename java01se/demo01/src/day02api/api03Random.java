package day02api;

import java.util.Random;

public class api03Random {
    public static void main(String[] args) {
        Random num=new Random();
        int r=num.nextInt();
        System.out.println(r);
        for (int i = 0; i < 10; i++) {
            int r1=num.nextInt(5)+1;
            System.out.println("随机数" + r1);
        }
    }
}
