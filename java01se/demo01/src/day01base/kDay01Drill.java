package day01base;

public class kDay01Drill {
    public static void main(String[] args) {
        //1. 定义一个整型变量并赋任意五位正整数作为初始值，判断它是不是五位回文数
        int num=14341;
        int a=num%10;   //获取个位
        int b=num%100/10;//获取十位
        int c=num/1000%10;//获取百位
        int d=num/10000;//获取万位
        if (a==d&&b==c){
            System.out.println("是回文数");// 是回文数
        }else {
            System.out.println("不是回文数");
        }
        //2. 定义一个整型变量并赋任意五位正整数作为初始值，输出各位数字之和
        int e=num/100%10;//获取千位
        System.out.println(a+b+c+d+e);//13
        //3. 定义整型变量 a、b，写出将 a、b 两个变量值进行互换的程序
        //（要求不能使用第三个变量）
        int one=1;
        int two=2;
        two=one+two;//3
        one=two-one;//2
        two=two-one;//1
        System.out.println("one="+one);
        System.out.println("two="+two);
        //4. 请写出一段遵守编码规范的 Hello World 代码
        System.out.println("以上就是吧..");

    }
}
