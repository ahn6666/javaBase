package demoJsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

public class one1 {
    //jsoup的parse
    // ® parse(String html):解析xml或者html字符串
    //pase(URL url ,int timeoutMillis):通过网络路径获取的html或xml的文文档对象

    public static void main(String[] args) throws IOException {
        //获取document 对象 根据xml文档获得
        //获取path
        String path = Jsoup.class.getClassLoader().getResource("one.xml").getPath();
        /*String str="<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "\n" +
                "<student>\n" +
                "   <user>\n" +
                "       <name>李四</name>\n" +
                "       <sex>男</sex>\n" +
                "       <age>18</age>\n" +
                "       <math>12</math>\n" +
                "   </user>\n" +
                "    <user>\n" +
                "        <name>张三</name>\n" +
                "        <sex>男</sex>\n" +
                "        <age>18</age>\n" +
                "        <math>12</math>\n" +
                "    </user>\n" +
                "</student>";
        Document parse = Jsoup.parse(str);//通过xml 或者html解析
        System.out.println(parse);*/

        URL url=new URL("http://www.manmanbuy.com/p_658901.aspx");//通过网络路径获取文档
        Document parse = Jsoup.parse(url, 10000);
        System.out.println(parse);
    }
}
