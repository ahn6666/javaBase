package day03String;

public class String04change {
    public static void main(String[] args) {
        String str1="aaa,bbb,ccc";
        char[] str2 = str1.toCharArray();
        System.out.println(str2[0]);
        byte[] str3 = str1.getBytes();
        for (int i = 0; i < str3.length; i++) {
            System.out.println(str3[i]);
        }
        String str4 = str1.replace(',', 'v');
        System.out.println(str4);
    }
}
