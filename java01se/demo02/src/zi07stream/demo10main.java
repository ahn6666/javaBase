package zi07stream;

import java.util.Arrays;

public class demo10main {
    public static int[] methon(int length,demo10arr ob)
    {
        return ob.buil(length);
    }

    public static void main(String[] args) {
        int[] ar=methon(10,(len)->{return new int[len];} );
        System.out.println(ar.length);
        int[] ar1=methon(10,int[]::new);
        System.out.println(Arrays.toString(ar1));
        System.out.println(ar1.length);
    }
}
