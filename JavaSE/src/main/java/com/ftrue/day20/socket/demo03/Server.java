package com.ftrue.day20.socket.demo03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName Server
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月23日 11时31分
 * @Version 1.0
 */
public class Server {
	public static void main(String[] args) throws IOException {
		//创建TCP协议的服务端对象
		ServerSocket ss = new ServerSocket(12345);

		//将服务端对象处于监听状态
		Socket s = ss.accept();

		//针对监听到的客户端对象进行解析
		//获取该客户端的输入流对象
		InputStream is = s.getInputStream();

		//读取数据
		int len;
		byte[] bytes = new byte[8192];

		while ((len = is.read(bytes)) != -1) {
			System.out.println(new String(bytes,0,len));
		}


		//消息回显:让服务端给客户端发送一个"已收到"
		//获取该客户端的输出流对象
		OutputStream os = s.getOutputStream();

		//发送回显消息
		os.write("消息已收到".getBytes());
		s.shutdownOutput();

		//关闭资源
		os.close();
		is.close();
		s.close();
		ss.close();
	}
}
