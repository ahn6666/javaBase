package demo01Map.demo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

//疫情的获取
public class day02sick {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://zaixianke.com/yq/all");
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String s = bufferedReader.readLine();
        System.out.println(s);
        bufferedReader.close();
    }
}
