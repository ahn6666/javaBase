package demoJsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class one{
    //jsoup快递入门
    public static void main(String[] args) throws IOException {
        //获取document 对象 根据xml文档获得
        //获取path
//        String path =one.class.getClassLoader().getResource("one.xml").getPath();
        String path = Jsoup.class.getClassLoader().getResource("one.xml").getPath();
        //解析xml文档，加载文档进内存，获取dom树 --->document
        Document document = Jsoup.parse(new File(path),"UTF-8");
        //获取元素对象element
        Elements elements= document.getElementsByTag("name");

        System.out.println(elements.size());
        //获取第一个name的element
        Element element = elements.get(0);
        //获取数据
        String text = element.text();
        System.out.println(text);
    }
}
