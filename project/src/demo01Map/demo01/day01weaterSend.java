package demo01Map.demo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
//天气的输出
public class day01weaterSend {
    public static void main(String[] args) throws IOException {
        String wen = URLEncoder.encode("明天北京天气", "utf-8");
        URL url = new URL("https://api.jisuapi.com/iqa/query?appkey=62958a3a6ef3c56d&question="+wen);
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String s = bufferedReader.readLine();
        System.out.println(s);
        bufferedReader.close();
    }
}
