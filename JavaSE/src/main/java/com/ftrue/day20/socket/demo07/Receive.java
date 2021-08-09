package com.ftrue.day20.socket.demo07;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @ClassName Receive
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月23日 15时32分
 * @Version 1.0
 */
public class Receive implements Runnable{
	private DatagramSocket ds;

	public Receive(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		try {
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
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ds != null) {
				//关闭资源
				ds.close();
			}
		}
	}
}
