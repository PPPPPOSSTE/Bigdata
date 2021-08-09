package com.ftrue.day20.socket.demo02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @ClassName Client
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月23日 10时36分
 * @Version 1.0
 *
 * 用于表示TCP协议客户端
 */
public class Client {
	public static void main(String[] args) throws IOException {
		//创建TCP协议客户端对象
		Socket s = new Socket("192.168.25.77", 12345);

		//客户端需要给服务端发送数据
		//获取客户端的输出流对象
		OutputStream os = s.getOutputStream();

		//写出数据
		os.write("你好,TCP".getBytes());

		//关闭资源
		os.close();
		s.close();
	}
}
