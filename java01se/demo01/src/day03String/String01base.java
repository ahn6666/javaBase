package day03String;

public class String01base {
    public static void main(String[] args) {
        //使用空参
        String str=new String();
        System.out.println(str);
        //使用字符
        char[] array={'a','b','c'};
        String str1=new String( array);
        System.out.println(str1);
        //使用byte
        byte[] array1=new byte[]{97,98,99};
        String str2=new String(array1);
        System.out.println(str2);

        //字符串的常量值
        String abc="abc";
        String abb="abc";
        char[] array3={'a','b','c'};
        String acc=new String(array3);
        System.out.println(abc==abb);
        System.out.println(abc==acc);
        System.out.println(acc==abb);

    }

}
