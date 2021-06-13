package day03String;

public class String01base2 {
    public static void main(String[] args) {
        String str1="hellowoltd";
        //获取长度
        System.out.println(str1.length());
        //拼接字符串
        String str2="nihao";
        System.out.println(str1.concat(str2));
        //指定索引位置
        System.out.println(str1.charAt(4));
        //查找字符串首次出现的位置
        String str3="hellohello";
        System.out.println(str3.indexOf("llo"));
    }
}
