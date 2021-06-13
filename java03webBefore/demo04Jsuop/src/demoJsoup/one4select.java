package demoJsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class one4select {
    public static void main(String[] args) throws IOException {
        //获取路径
        String path = Jsoup.class.getClassLoader().getResource("one.xml").getPath();
        //解析文档
        Document document = Jsoup.parse(new File(path), "UTF-8");
        //通过select 获取文档
        //通过标签
        Elements user = document.select("name");
        System.out.println(user);
        System.out.println("------------");
        //通过id
        Elements select = document.select("#itcast");
        System.out.println(select);
        System.out.println("---------");
        //查询子标签 通过属性值
      /*  Elements select1 = document.select("user[number=\"user_0001\"]");
        System.out.println(select1);*/
        //查询子标签 通过属性值 下的子标签
        Elements select1 = document.select("user[number=\"user_0001\"] age");
        System.out.println(select1);

    }
}
