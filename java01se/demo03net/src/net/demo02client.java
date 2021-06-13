package net;/*
文件上传客户端：
	数据源：c://1.jpg
	目的地:服务器
实现步骤：
	1：创建一个本地字节输入流FileInputStream对象，构造方法中绑定要读书的数据源
	2：创建一个客户端Socket对象，构造方法中绑定服务器的IP地址和端口号
	3：使用Socket中方法getOutputStream，获取网络字节输出流OutputStream
	4：使用本地字节输入流FlieInputStream对象中的方法read，把读取到的文件上传的到服务器
	5：使用网络字节输出流OutputStream对象中的write,把读取到的文件上传到服务器
	6：使用Socket中的方法getInputStream,获取网络字节输入流InputStream对象
	7：使用网络字节输入流InputStream对象中的方法read读取服务回写的数据
    8：释放资源（FileInputStream ,Socket）*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class demo02client {
    public static void main(String[] args) throws IOException {
//        1：创建一个本地字节输入流FileInputStream对象，构造方法中绑定要读书的数据源
        FileInputStream f = new FileInputStream("E:\\javaBug\\java01se\\demo03net\\1.png");

//	2：创建一个客户端Socket对象，构造方法中绑定服务器的IP地址和端口号
        Socket sc = new Socket("127.0.0.1", 8888);
//	3：使用Socket中方法getOutputStream，获取网络字节输出流OutputStream
        OutputStream op = sc.getOutputStream();
//	4：使用本地字节输入流FlieInputStream对象中的方法read，把读取到的文件上传的到服务器

        byte[] bytes = new byte[1024];
        int len=0;
        while ((len=f.read(bytes))!=-1)
        {
//	5：使用网络字节输出流OutputStream对象中的write,把读取到的文件上传到服务器
            op.write(bytes,0,len);
        }
         /* /*	文件堵塞问题：
		解决：上传文件，给服务器写一个结束标记
		Void shutDownOutput():禁止套接字的输出流
		对于tcp套接字，任何以前写入的数据都将被发送，并且后跟TCP的正常连接终止序列
        Socket.shutdowmOutput();*/
        sc.shutdownOutput();
//	6：使用Socket中的方法getInputStream,获取网络字节输入流InputStream对象
        InputStream is = sc.getInputStream();
//	7：使用网络字节输入流InputStream对象中的方法read读取服务回写的数据
        System.out.println("33333333");
       while((len=is.read(bytes))!=-1){
           System.out.println(new String(bytes,0,len));
        }

        System.out.println("444444444");
//    8：释放资源（FileInputStream ,Socket）
       sc.close();
        f.close();

    }
}
