package demoJsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class one5xpath {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        String path = Jsoup.class.getClassLoader().getResource("one.xml").getPath();
        Document docment = Jsoup.parse(new File(path), "utf-8");
        //通过xpath
        //创建对象
        JXDocument jxDocument = new JXDocument(docment);
        //获得所有student标签
        /*List<JXNode> student = jxDocument.selN("//student");
        for (JXNode s:
             student) {
            System.out.println(s);
        }*/
        System.out.println("-----------");
       
    }
}
