package demo01object;
/*		Public StringBuilder():构造一个空的StringBuider
		Public StringBuilder(String str):构造一个StringBuilder容器，并将字符串添加进去
*/
public class demo05SB {
    public static void main(String[] args) {
        StringBuilder one=new StringBuilder();
        System.out.println("one"+one);
        StringBuilder two=new StringBuilder("abc");
        System.out.println("two"+two);
        two.append(1).append('a').append(0.88);
        System.out.println("three"+two);
        two.reverse();
        System.out.println("four"+two);
        two.toString();
        System.out.println("five"+two);

        //字符串与字符串缓冲器的转换
        String s="hello";
        StringBuilder s1 = new StringBuilder(s);
        s1.append("abg");
        System.out.println("s1"+s1);

        String s2 = s1.toString();
        System.out.println("s2"+s2);
    }
}
