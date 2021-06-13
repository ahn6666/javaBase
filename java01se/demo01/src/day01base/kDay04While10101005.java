package day01base;

import java.time.Year;
import java.util.Scanner;

public class kDay04While10101005 {
    public static void main(String[] args) {
        //商场根据会员积分打折：
        //2000 分以内打 9 折，
        //4000 分以内打 8 折，
        //8000 分以内打 7.5 折，
        //8000 分以上打 7 折，使用 if-else-if 结构，实现手动输入购物金额和积分，
        //计算出应缴金额
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入您的金额");
        int text1 = scanner.nextInt();
        double price;
        if (text1<=2000)
        {
            price=text1*0.9;
        }else if (text1<=4000){
            price=text1*0.9;
        }else if (text1<=8000){
            price=text1*0.75;
        }else {
            price=text1*0.7;
        }
        System.out.println("您的金额为"+price+"元");
        System.out.println("-----------");
        //2、计算该年该月天数
        //一年中有 12 个月，而每个月的天数是不一样的。其中大月 31 天，分别为
        //1,3,5,7,8,10,12 月，小月 30 天，分别 为 4,6,9,11 月。还有二月比较特殊，平
        //年的二月只有 28 天，而闰年的二月有 29 天，由用户在控制台输入年份和月份，
        //程序计算该年该月的天数。
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        int day;
        if (month==2){
                if (year%4==0&&year%100!=0|| year%400==0){
                day=29;
                System.out.println("该年该月的天数为"+day);
                }else {
                    day=28;
                    System.out.println("该年该月的天数为"+day);
                }
        }else if (month==4||month==6||month==9||month==11){
            day=30;
            System.out.println("该年该月的天数为"+day);
        }else {
            day=31;
            System.out.println("该年该月的天数为"+day);
        }
        System.out.println("-----------");*/
        //3、图形打印任务
        //在控制台中，编写三个 Demo，分别输出如下图形：
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("---------");
        for (int i = 5; i >0 ; i--) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("---------");
        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k <= 5 - i-1 ;k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //4、打印九九乘法表 ，效果如图：
        System.out.println("-----------打印九九乘法表");
        for (int i = 1; i <=9 ; i++) {
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println(" ");
        }
        //5、打印三位数中的所有水仙花数
        //所谓“水仙花数”即一个整数满足其值等于各个数位的立方和。
        //如: 153 是一个水仙花数，因为 153= 1³+5³+3³
        System.out.println("---------打印三位数中的所有水仙花数");
        for (int i = 100; i <=999 ; i++) {
            int a=i/100;
            int b=i%100/10;
            int c=i%10;
            double sum=Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3);
            if (sum==i){
                System.out.println(sum);
            }
        }


    }

}
