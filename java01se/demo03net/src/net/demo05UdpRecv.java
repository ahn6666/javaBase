package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//接受方 udp 吕孟玲
public class demo05UdpRecv {
    public static void main(String[] args) throws IOException {
         DatagramSocket ds = new DatagramSocket(1170);
         byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 1024);
        ds.receive(datagramPacket);
    String s= new String(datagramPacket.getData(),0,datagramPacket.getLength())+"from "
                    +datagramPacket.getAddress().getHostAddress()+": "+datagramPacket.getPort();
        System.out.println(s);
        ds.close();
    }
}
