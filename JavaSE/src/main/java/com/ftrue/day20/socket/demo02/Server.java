package com.ftrue.day20.socket.demo02;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName Server
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月23日 10时37分
 * @Version 1.0
 *
 * 用于表示TCP协议服务端
 */
public class Server {
	public static void main(String[] args) throws IOException {
		//创建TCP协议的服务端对象
		ServerSocket ss = new ServerSocket(12345);

		//让服务器处理监听状态,返回监听到客户端对象
		Socket s = ss.accept();

		//解析监听到的客户端对象
		//获取客户端IP地址值
		String ip = s.getInetAddress().getHostAddress();
		System.out.println("ip = " + ip);

		//针对客户端发送过来数据进行读取
		InputStream is = s.getInputStream();

		//读取数据
		int len;
		byte[] bytes = new byte[8192];
		while ((len = is.read(bytes)) != -1) {
			System.out.println(new String(bytes,0,len));
		}

		System.out.println("HelloWorld");

		//关闭资源
		is.close();
		s.close();
		ss.close();
	}
}
