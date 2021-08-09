package com.ftrue.day20.socket.demo01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ClassName SocketDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月23日 10时15分
 * @Version 1.0
 *
 * InetAddress类
 *      类的特点
 *          此类表示互联网协议 (IP) 地址
 *      类的位置
 *          java.net
 *      类的构造器
 *          构造器私有化,通过静态方法进行对象的获取
 *      类的方法
 *          public static InetAddress getLocalHost()
 *              返回本地主机。
 *          public static InetAddress getByName(String host)
 *              在给定主机名的情况下确定主机的 IP 地址。
 *          public String getHostName()
 *              获取此 IP 地址的主机名。
 *          public String getHostName()
 *              获取此 IP 地址的主机名。
 *
 */
public class SocketDemo01 {
	public static void main(String[] args) throws UnknownHostException {
		//获取本地IP对象
		InetAddress ip1 = InetAddress.getLocalHost();
		System.out.println(ip1.getHostName());
		System.out.println(ip1.getHostAddress());
		System.out.println("======================================");
		//通过主机名获取其他主机的IP对象
		InetAddress ip2 = InetAddress.getByName("Shark-PC");
		System.out.println(ip2.getHostName());
		System.out.println(ip2.getHostAddress());
		System.out.println("======================================");
		//通过ip地址获取其他主机的IP对象
		InetAddress ip3 = InetAddress.getByName("192.168.25.77");
		System.out.println(ip3.getHostName());
		System.out.println(ip3.getHostAddress());
		System.out.println("======================================");
		//通过本机ip地址获取其他主机的IP对象(特殊写法)
		InetAddress ip4 = InetAddress.getByName("127.0.0.1");
		System.out.println(ip4.getHostName());
		System.out.println(ip4.getHostAddress());
		System.out.println("======================================");
		//通过本机ip地址获取其他主机的IP对象(特殊写法)
		InetAddress ip5 = InetAddress.getByName("localhost");
		System.out.println(ip5.getHostName());
		System.out.println(ip5.getHostAddress());
		System.out.println("======================================");
		//通过域名获取其他主机的IP对象
		InetAddress ip6 = InetAddress.getByName("www.jd.com");
		System.out.println(ip6.getHostName());
		System.out.println(ip6.getHostAddress());
	}
}
