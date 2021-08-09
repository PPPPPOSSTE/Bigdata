package com.ftrue.day20test.socket.demo04;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

/**
 * @ClassName: Receive
 * @Description:
 * @Author: zhiqi zhang on 2021/7/23 14:17
 * @Version: 1.0
 */
/*
 * 此类用于表示UDP协议的接收端
 * */
public class Receive {
    public static void main(String[] args) throws IOException {
        //创建UDP协议的接收端对象
        DatagramSocket ds = new DatagramSocket(12345);

        //声明数据报包所需的参数
        byte[] bytes = new byte[8192];
        int length = bytes.length;

        //创建数据报包对象
        DatagramPacket dp = new DatagramPacket(bytes, length);

        //接收数据
        ds.receive(dp);

        //解析数据报包
        //获取发送端IP地址
        String ip = dp.getAddress().getHostAddress();
        //获取接收到的缓冲区
        byte[] data = dp.getData();
        //获取接收到缓冲区的真实长度
        int len = dp.getLength();

        String s = new String(data, 0, len);

        System.out.println(ip + " : " + s);

        //关闭资源
        ds.close();
    }
}
