package day03String;

public class String02equals {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        char[] arrays={'h','e','l','l','o'};
        String str3=new String(arrays);
        boolean result1 = str1.equals(str2);//true
        boolean result2 = str2.equals(str3);//true
        boolean result3 = str3.equals("hello");//true
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        String str4="HEllo";
        boolean result4 = str1.equals(str4);//false
        boolean result5 = str1.equalsIgnoreCase(str4);//true
        System.out.println(result4);
        System.out.println(result5);

    }
}
