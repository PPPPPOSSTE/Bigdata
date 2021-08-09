package com.ftrue.day20test.socket.demo05;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @ClassName: Send
 * @Description:
 * @Author: zhiqi zhang on 2021/7/23 14:17
 * @Version: 1.0
 */
/*
 *
 * 此类用于表示UDP协议程序发送端
 *
 * */
public class Send {
    public static void main(String[] args) throws IOException {
        //创建UDP协议的发送端对象
        DatagramSocket ds = new DatagramSocket();

        //声明数据报包所需的数据
        byte[] bytes = "你好,UDP".getBytes();
        int length = bytes.length;
        InetAddress ip = InetAddress.getByName("localhost");
        int port = 12345;

        //创建数据报包对象
        DatagramPacket dp = new DatagramPacket(bytes, length, ip, port);

        //发送数据报包
        ds.send(dp);

        //关闭资源
        ds.close();
    }
}
