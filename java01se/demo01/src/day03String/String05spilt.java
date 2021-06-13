package day03String;

public class String05spilt {
    public static void main(String[] args) {
        String str1="aa,bb,c";
        String[] str2 = str1.split(",");
        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);
        }

    }
}
