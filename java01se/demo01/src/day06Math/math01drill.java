package day06Math;

//题目：计算-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个
public class math01drill {
    public static void main(String[] args) {
        double min=-10.8;
        double max=5.9;
        int dayu=0;
        int xiaoyu=0;
        for (int i = (int) min; i < max; i++) {
            int  abs=Math.abs(i);
            if (abs>6)
            {
                dayu++;
                System.out.println(i);
            }
            if (abs<2.1)
            {
                System.out.println("小于"+i);
                xiaoyu++;
            }
        }
        System.out.println(dayu);
        System.out.println(xiaoyu);

    }
}
