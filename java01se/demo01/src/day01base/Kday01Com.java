package day01base;

import java.io.IOException;

public class Kday01Com {
    public static void main(String[] args) throws IOException {
        //自动关机 3600秒后执行
        Runtime.getRuntime().exec("shutdown -s -t 3600");
        //取消关机
        Runtime.getRuntime().exec("shutdown -a");
    }
}
