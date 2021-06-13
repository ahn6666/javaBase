package day01base;

import java.util.Scanner;

public class kDay02Order {
    public static void main(String[] args) {
       //1、某市出租车，起步价（2 公里以内）为 8 元，超过 2 公里的按照每公里 4.5 元计算。要求根据路程计
        //算费用。
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入您的公里数");
        int text1 = scanner.nextInt();
        if (text1 <= 2){
            System.out.println("您的价格为8元");
        }else {
            double a;
            a=(text1-2)*4.5+8;
            System.out.println("您的价格为"+a+"元");
        }

        //2、输入年份，判断输入的年份是否是闰年。（闰年的条件是能被 4 整除，但不能被 100 整除；或能被
        //400 整除。）
        System.out.println("请输入年份");
        int text2 = scanner.nextInt();
        if (text2%4==0&&text2%100!=0||text2%400==0)
        {
            System.out.println("该年是闰年");
        }else{
            System.out.println("该年不是闰年");
        }
        //3、要求输入月份，判断该月所处的季节并输出季节（假设：12、1、2 月为冬季，依次类推）
        System.out.println("请输出所处的月份");
        int text3 = scanner.nextInt();
        switch (text3){
            case 12:
            case 1:
            case 2:
                System.out.println("该季节为冬季");break;
            case 3:
            case 4:
            case 5:
                System.out.println("该季节为春季");break;
            case 6:
            case 7:
            case 8:
                System.out.println("该季节为夏季");break;
            case 9:
            case 10:
            case 11:
                System.out.println("该季节为秋季");break;
            default:
                System.out.println("输入错误");
        }
        //4、根据《国家电网销售电价表》，居民生活用电按 3 个梯度收费：月用电量 150 千瓦时及以下部分，
        //每千瓦时 0.43 元，151—400 千瓦时部分为 0.45 元，401 千瓦时以上部分为 0.52 元，请编写程序，当输入
        //用户的用电量时，计算出所需付的费用。
        System.out.println("请输入您的电费");
        double text4 = scanner.nextDouble();
        double a;
        if (text4<=150)
        {
            a=text4*0.43;
            System.out.println("您所需付的费用"+a);
        }else if (text4<=400){
            a=150*0.43+(text4-150)*0.45;
            System.out.println("您所需付的费用"+a);
        }else {
            a=150*0.43+400*0.45+(text4-400)*0.52;
            System.out.println("您所需付的费用"+a);
        }
    }
}
