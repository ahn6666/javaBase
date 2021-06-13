package cn.ling;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

//验证码
@WebServlet( "/demo05ServletYzm")
public class demo05ServletYzm extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             //创建一对象，在内存中土拍你（验证码图片对象）
            int width=200;
            int height=50;
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
            //美化图片
        Graphics g = image.getGraphics();//添加画笔
        g.setColor(Color.pink);//设置颜色
        g.fillRect(0,0,width,height);//设置位置
        //设置边框
        g.setColor(Color.BLUE);
        g.drawRect(0,0,width-1,height-1);
        //设置随机英文
        String yingwen="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int j = 0; j < 4; j++) {
            int i = new Random().nextInt(yingwen.length());//设置随机数
            char c = yingwen.charAt(i);//设置随机字符

            g.drawString(c+"",width/5*j+10,height/2);
        }
        //设置干扰线
        g.setColor(Color.green);
        for (int i = 0; i < 6; i++) {
            int x1= new Random().nextInt(width);//设置随机数
            int x2= new Random().nextInt(width);//设置随机数
            int y1= new Random().nextInt(height);//设置随机数
            int y2= new Random().nextInt(height);//设置随机数
            g.drawLine(x1,y1,x2,y2);
        }
        //将图片输出到页面
        ImageIO.write(image,"jpg",response.getOutputStream());

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
