package net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*明确：数据源：客户端上传的文件：
         目的地：服务器的硬盘E:\\c.jpg
    实现步骤：
        1：创建一个服务器ServerSocket对象，和系统要指定的端口号
        2:   使用ServerSockert对象中的方法accept,获取到请求的客户端Socket对象
        3:   使用Socket对象中的方法getInputStream,获取到的网络字节输入流InputStream对象
        4： 判断E:\\c.jpg文件夹是否存在 ，不存在则创建
        5：创建一个本地输出流FileOutputStream对象，构造方法中绑定要输出的目的地
        6：使用网络字节输入流InputStream对象中的方法read，读取客户端上传的文件
        7：使用本地字节输出流FileOutputStream对象中的方法write，把读取的文件保存在服务器的硬盘上
        8：使用Socket对象中的方法getOutputStream,获取到网络字节输出流OutputStream对象
        9：使用网络字节输出流OutputStream对象中的方法write,给客户端回写上传成功
         10：释放资源*/
public class demo02server {
    public static void main(String[] args) throws IOException {
//        1：创建一个服务器ServerSocket对象，和系统要指定的端口号
//        2:   使用ServerSockert对象中的方法accept,获取到请求的客户端Socket对象
//        3:   使用Socket对象中的方法getInputStream,获取到的网络字节输入流InputStream对象
//        4： 判断E:\\c.jpg文件夹是否存在 ，不存在则创建
//        5：创建一个本地输出流FileOutputStream对象，构造方法中绑定要输出的目的地
//        6：使用网络字节输入流InputStream对象中的方法read，读取客户端上传的文件
//        7：使用本地字节输出流FileOutputStream对象中的方法write，把读取的文件保存在服务器的硬盘上
//        8：使用Socket对象中的方法getOutputStream,获取到网络字节输出流OutputStream对象
//        9：使用网络字节输出流OutputStream对象中的方法write,给客户端回写上传成功
//         10：释放资源
        ServerSocket ss = new ServerSocket(8888);
        Socket sc = ss.accept();
        InputStream scIp = sc.getInputStream();
        File file = new File("E:\\javaBug\\java01se\\demo03net");
        if(!file.exists())
        {
            file.mkdirs();
        }
//        5：创建一个本地输出流FileOutputStream对象，构造方法中绑定要输出的目的地
        FileOutputStream fo = new FileOutputStream(file+"\\2.jpg");
//        6：使用网络字节输入流InputStream对象中的方法read，读取客户端上传的文件
        int len=0;
        byte[] bytes = new byte[1024];

        while ((len=scIp.read(bytes))!=-1)
        {
//        7：使用本地字节输出流FileOutputStream对象中的方法write，把读取的文件保存在服务器的硬盘上
                fo.write(bytes,0,len);
        }

//        8：使用Socket对象中的方法getOutputStream,获取到网络字节输出流OutputStream对象
        OutputStream op = sc.getOutputStream();
//        9：使用网络字节输出流OutputStream对象中的方法write,给客户端回写上传成功
        sc.getOutputStream().write("收到了谢谢".getBytes());

//         10：释放资源
        sc.close();
        scIp.close();
        op.close();
    }
}
