package day01base;

public class demo03arr {
    public static void main(String[] args) {
        int[] arraya= array1(10,20,30);
        System.out.println(arraya);
        System.out.println(arraya[0]);
        System.out.println(arraya[1]);
        int[] a=new int[10];
        int c[]=new int[8];
        int[] b=new int[]{};
        int[] d={1,2};
        int e[]={1};

    }
    public static int[] array1(int a,int b,int c)
    {
        int sum=a+b+c;
        int ave=sum/3;
        int[] result={sum,ave};
        return result;
    }
}
