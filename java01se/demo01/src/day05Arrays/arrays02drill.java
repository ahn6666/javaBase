package day05Arrays;

import java.util.Arrays;

//使用arrays将一个随机的字符串 升序排列 并打印
public class arrays02drill {
    public static void main(String[] args) {
        String str1="afdfawnmsdfjkl";
        char[] str2=str1.toCharArray();
        Arrays.sort(str2);
        for (int i = str2.length - 1; i >= 0; i--) {
            System.out.println(str2[i]);
        }
    }
}
