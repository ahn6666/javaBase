package day01base;

public class base {
    public static void main(String[] args) {
        int[] arraya={10,20,43,23,21};
        //倒叙 第一种方法
      /*  for (int i = 0; i < arraya.length/2; i++) {
            int b=0;
            b=arraya[i];
            arraya[i]=arraya[arraya.length-i-1];
            arraya[arraya.length-1-i]=b;
        }
        for (int i = 0; i < arraya.length; i++) {
            System.out.println(arraya[i]);
        }*/
        //第二种方法
        for (int min=0,max= arraya.length-1;min<max;min++,max--)
        {
            int temp=arraya[min];
            arraya[min]=arraya[max];
            arraya[max]=temp;
        }
        for (int i = 0; i < arraya.length; i++) {
            System.out.println(arraya[i]);

        }
    }
}
