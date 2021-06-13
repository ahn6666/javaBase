package day05Arrays;

import java.util.Arrays;

public class arrays01 {
    public static void main(String[] args) {
        int[] num={10,20,5};
        String num1= Arrays.toString(num);
        System.out.println(num1);
        int [] sort1={10,2,3,4,21,23};
        Arrays.sort(sort1);
        System.out.println(Arrays.toString(sort1));
    }
}
