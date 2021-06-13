package day03String;

import java.util.Scanner;

/*
* 题目键盘输入一个字符串 并且统计其中各种字符出现的次数
* 种类有大写字母 小写字母 数字 和其他;
* 
* */
public class String07drill2 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        int numUpper=0;
        int numLow=0;
        int numInt=0;
        int numOther=0;
        String str1 = str.next();
        char[] str2 = str1.toCharArray();
        for (int i = 0; i < str2.length; i++) {
            char cha=str2[i];
            if('A'<=cha&&'Z'>=cha)
            {
                numUpper ++;
            }else if('a'<=cha &&'z'>=cha)
            {
                numLow ++;
            }else if('0'<=cha&&'9'>=cha)
            {
                numInt++;
            }else {
                numOther++;
            }
        }
        System.out.println(numUpper);
        System.out.println(numLow);
        System.out.println(numInt);
        System.out.println(numOther);

    }

}
