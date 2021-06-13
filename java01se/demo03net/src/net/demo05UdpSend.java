package net;

import java.io.IOException;
import java.net.*;

//发送方 udp
public class demo05UdpSend {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            String str="hello world";
             DatagramPacket ds = new DatagramPacket(str.getBytes(), 0, str.length(),
                     InetAddress.getByName("127.0.0.1"), 1170);
            datagramSocket.send(ds);
            datagramSocket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
