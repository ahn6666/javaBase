package day02api;

import java.util.Random;
import java.util.Scanner;

public class api04RandomGram {
    public static void main(String[] args) {
        Random fix1=new Random();
        int num1=fix1.nextInt(100);
        while(true)
        {
            Scanner num=new Scanner(System.in);
            int fix=num.nextInt();
            if(fix>num1)
            {
                System.out.println("数字太大了");
            }else if(fix<num1)
            {
                System.out.println("数字太小了");
            }else {
                System.out.println("答案正确");
                break;
            }
        }
        System.out.println("游戏结束");

    }
}
