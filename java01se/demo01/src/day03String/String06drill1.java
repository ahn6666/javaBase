package day03String;
//题目：定义一个方法，把数组{1，2，3}按照指定格式拼接成一个字符串，【world1#world2#world3】
public class String06drill1 {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        System.out.println(methon(num));
    }
    public static String methon(int[] ayyay)
    {
        String str1="[";
        for (int i = 0; i < ayyay.length; i++) {
            if (i==ayyay.length-1)
            {
                str1 +="world"+ayyay[i]+"]";
            }else {

                str1 +="world"+ayyay[i]+"#";
            }
        }
        return str1;
    }
}

