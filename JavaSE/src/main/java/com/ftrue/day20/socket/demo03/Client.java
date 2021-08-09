package com.ftrue.day20.socket.demo03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @ClassName Client
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月23日 11时37分
 * @Version 1.0
 */
public class Client {
	public static void main(String[] args) throws IOException {
		//创建TCP协议客户端对象
		Socket s = new Socket("192.168.25.77", 12345);

		//获取客户端的输出流对象
		OutputStream os = s.getOutputStream();

		//发送消息
		os.write("你好,TCP".getBytes());
		s.shutdownOutput();

		//接收服务端发送过来的回显消息
		//获取客户端的输入流对象
		InputStream is = s.getInputStream();

		//读取回显消息
		int len;
		byte[] bytes = new byte[8192];
		while ((len = is.read(bytes)) != -1) {
			System.out.println(new String(bytes,0,len));
		}

		//关闭资源
		is.close();
		os.close();
		s.close();

	}
}
