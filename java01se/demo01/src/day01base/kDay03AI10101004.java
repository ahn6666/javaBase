package day01base;

import java.util.Scanner;

public class kDay03AI10101004 {
    public static void main(String[] args) {
        /*输入函数 System.in 是通过系统来找到*/
        Scanner scanner = new Scanner(System.in);
        String que;
        while (true)
        {
            /*获取到输入的字符串*/
            que = scanner.next();
            /*对字符串进行替换*/
            que = que.replace("?", "!");
            que = que.replace("吗", " ");
            que = que.replace("我", "我也");
            System.out.println(que);
        }
    }
}
