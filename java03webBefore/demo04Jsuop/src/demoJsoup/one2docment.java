package demoJsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class one2docment {
    //jsoup快递入门
    public static void main(String[] args) throws IOException {
        //获取document 对象 根据xml文档获得
        //获取path
        String path = Jsoup.class.getClassLoader().getResource("one.xml").getPath();
        //解析xml文档，加载文档进内存，获取dom树 --->document
        Document document = Jsoup.parse(new File(path),"UTF-8");
        //通过标签名称获取元素对象集合
        Elements elements= document.getElementsByTag("name");
        System.out.println(elements);
        System.out.println("---------------");
        //根据id属性值获取唯一的element对象
        Element itcast = document.getElementById("itcast");
        System.out.println(itcast);
        //根据属性名称获取元素对象集合
        System.out.println("---------------");
        Elements one = document.getElementsByAttribute("number");
        System.out.println(one);
        System.out.println("---------------");
        Elements ele = document.getElementsByAttributeValue("number", "user_0001");
        System.out.println(ele);
    }
}
