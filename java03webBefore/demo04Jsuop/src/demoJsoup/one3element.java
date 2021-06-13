package demoJsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class one3element {
    //jsoup快递入门
    public static void main(String[] args) throws IOException {
        //获取document 对象 根据xml文档获得
        //获取path
        String path = Jsoup.class.getClassLoader().getResource("one.xml").getPath();
        //解析xml文档，加载文档进内存，获取dom树 --->document
        Document document = Jsoup.parse(new File(path), "UTF-8");
        //获取通过docment元素对象element
//        Elements name= document.getElementsByTag("name");
        //element对象获取子元素'
        Element fu = document.getElementsByTag("student").get(0);
        Elements user = fu.getElementsByTag("user");
        System.out.println(user.size());//2
        System.out.println("-----------------");
        //获取属性值
        String number = user.attr("number");
        System.out.println(number);//user_0001
        //获取文本内容
        System.out.println("-----------------");
        String text = user.text();
        String html = user.html();
        System.out.println(text);
        System.out.println("-----------------");
        System.out.println(html);

    }
}