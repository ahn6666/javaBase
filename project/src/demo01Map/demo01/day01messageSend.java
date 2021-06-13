package demo01Map.demo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
//发送短信
public class day01messageSend {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://itdage.com/kkb/kkbsms?key=xzk&number=13333721045&code=888888");
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String s = bufferedReader.readLine();
        System.out.println(s);
        bufferedReader.close();
    }
}
