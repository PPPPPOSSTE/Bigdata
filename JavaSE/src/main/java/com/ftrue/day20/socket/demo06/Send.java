package com.ftrue.day20.socket.demo06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @ClassName Send
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月23日 15时18分
 * @Version 1.0
 *
 *
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
			InetAddress ip = InetAddress.getByName("192.168.25.77");
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
