package com.ftrue.day20.socket.demo07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @ClassName Send
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月23日 15时27分
 * @Version 1.0
 */
public class Send implements Runnable {
	private DatagramSocket ds;

	public Send(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		try {//通过键盘录入完成发送
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
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			if (ds != null) {
				ds.close();
			}
		}
	}
}
