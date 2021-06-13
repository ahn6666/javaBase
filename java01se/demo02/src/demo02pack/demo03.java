package demo02pack;
//基本数据类型和字符串的转换
public class demo03 {
    public static void main(String[] args) {
        String a="100"+200;
        System.out.println(a);

        String s = Integer.toString(1);
        System.out.println(s+200);

        String s1 = String.valueOf(1);
        System.out.println(s1+200);


        int i = Integer.parseInt(a);
        System.out.println(i);
    }
}
