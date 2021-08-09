package com.ftrue.day20test.socket.demo06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @ClassName: Send
 * @Description:
 * @Author: zhiqi zhang on 2021/7/23 14:17
 * @Version: 1.0
 */
public class Send {
    public static void main(String[] args) throws IOException {
        //创建UDP协议发送端对象
        DatagramSocket ds = new DatagramSocket();

        //通过键盘录入完成发送
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String len;
        while ((len = br.readLine()) != null) {
            //声明数据报包所需的数据
            byte[] bytes = len.getBytes();
            int length = bytes.length;
            InetAddress ip = InetAddress.getByName("localhost");
            int port = 12345;

            //创建数据报包对象
            DatagramPacket dp = new DatagramPacket(bytes, length, ip, port);

            //发送数据报包
            ds.send(dp);
        }

        //关闭资源
        ds.close();
    }
}
