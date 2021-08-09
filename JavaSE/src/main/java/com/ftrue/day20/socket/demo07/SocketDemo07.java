package com.ftrue.day20.socket.demo07;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @ClassName SocketDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月23日 15时26分
 * @Version 1.0
 */
public class SocketDemo07 {
	public static void main(String[] args) throws SocketException {
		//创建发送端和接收端线程对象
		Thread send = new Thread(new Send(new DatagramSocket()));
		Thread receive = new Thread(new Receive(new DatagramSocket(12345)));

		//开启线程
		send.start();
		receive.start();
	}
}
