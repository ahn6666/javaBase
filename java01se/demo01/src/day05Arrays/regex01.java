package day05Arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex01 {
    public static void main(String[] args) {
      /*  Pattern pattern = Pattern.compile("正则");
        Matcher matcher = pattern.matcher("正则 HelloWorld,正则表达式HelloWorld");
        System.out.println("配"+matcher);//配java.util.regex.Matcher[pattern=正则 region=0,29 lastmatch=]
        System.out.println("文"+pattern);//文正则
        System.out.println("替换"+matcher.replaceAll("java"));//替换java HelloWorld,java表达式HelloWorld*/
        Pattern pattern = Pattern.compile("正则");//要编译的表达
        Matcher matcher = pattern.matcher("正则 HelloWorld,正则表达式HelloWorld");//编译给定的正则表达式，并试图匹配给定的输入反对它。
        StringBuffer sbr = new StringBuffer();//获得缓冲区
        while(matcher.find())
        {
            matcher.appendReplacement(sbr,"java");
            System.out.println(matcher);
        }
        System.out.println("--------");
        matcher.appendTail(sbr);
        System.out.println(matcher);
        System.out.println("-------");
        System.out.println(sbr);
        System.out.println("文字置换"+sbr.toString());//文字置换java HelloWorld,java表达式HelloWorld
    }
}
