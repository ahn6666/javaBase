package zi04File;

public class demo07recursion {
    public static void main(String[] args) {
        //计算1-num之间的和
        int num=10;
        int getsum1 = getsum(num);
        System.out.println(getsum1);
    }

    public static int getsum(int num) {
        if (num==1)
        {   return 1;}
        return  (num+getsum(num-1));

    }


}
