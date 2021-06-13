package net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class demo04BSserver {
    public static void main(String[] args) throws IOException {
        //创建一个服务器ServerSockt和系统指定的端口
        ServerSocket ss= new ServerSocket(8888);
        Socket ac = ss.accept();


        InputStream is = ac.getInputStream();
      /*  byte[] bytes = new byte[1024];
        int len=0;
        while ((len=is.read(bytes))!=-1)
        {
            System.out.println(new String(bytes,0,len));
        }*/
        //把is网络字节输入流对象，转换为字符缓冲输入流

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        //把客户端请求信息的第一行读取出来  GET /untitled3software/web.html HTTP/1.1
        String line=br.readLine();

        //读取正确的路径
        String[] arr= line.split(" ");
        String htmlPath = arr[1].substring(1);

        //创建一个本地字节输入流 构造方法中绑定要读取的路劲
        FileInputStream fis = new FileInputStream(htmlPath);
        //使用SOcket中的方法getOutputStream获取网络字节输出流OutputStream对象
        OutputStream os = ac.getOutputStream();


        //写入http协议响应头，固定头
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        //必须要写入空行 否则浏览器不解析
        os.write("\r\n".getBytes());

        //一读一写复制文件 把服务读取的html文件回写到客户端
        byte[] bytes = new byte[1024];
        int len=0;
        while ((len=is.read(bytes))!=-1)
        {
           os.write(bytes,0,len);
        }
        fis.close();
        ac.close();
        ss.close();

    }
}
