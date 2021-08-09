package com.ftrue.day20.socket.demo05;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @ClassName Receive
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月23日 15时08分
 * @Version 1.0
 */
public class Receive {
	public static void main(String[] args) throws IOException {
		//创建UDP协议接收端对象
		DatagramSocket ds = new DatagramSocket(12345);

		//考虑到一直要接收数据
		boolean flag = true;

		while (flag) {
			//声明数据报包需要的数据
			byte[] bytes = new byte[8192];
			int length = bytes.length;

			//创建数据报包对象
			DatagramPacket dp = new DatagramPacket(bytes, length);

			//接收数据报包
			ds.receive(dp);

			//解析数据报包
			String ip = dp.getAddress().getHostAddress();
			byte[] data = dp.getData();
			int len = dp.getLength();

			String s = new String(data, 0, len);

			System.out.println(ip + ":" + s);
		}

		//关闭资源
		ds.close();
	}
}
