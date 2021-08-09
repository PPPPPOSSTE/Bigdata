package com.ftrue.day20test.socket.demo01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ClassName: SocketDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/23 10:21
 * @Version: 1.0
 */
/**
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
 *          public String getHostAddress()
 *              获取此 IP 地址的主机IP。
 *
 */
public class SocketDemo01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1);
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());
        //DESKTOP-FTRUE/192.168.25.97
        //DESKTOP-FTRUE
        //192.168.25.97
        //[B@677327b6
        System.out.println("===========================");

        InetAddress ip2 = InetAddress.getByName("DESKTOP-FTRUE");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());
        System.out.println("===========================");

        InetAddress ip3 = InetAddress.getByName("192.168.25.97");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());
        System.out.println("===========================");

        InetAddress ip4 = InetAddress.getByName("127.0.0.1");
        System.out.println(ip4.getHostName());
        System.out.println(ip4.getHostAddress());
        System.out.println("===========================");

        InetAddress ip5 = InetAddress.getByName("localhost");
        System.out.println(ip5.getHostName());
        System.out.println(ip5.getHostAddress());
        System.out.println("===========================");

        InetAddress ip6 = InetAddress.getByName("www.jd.com");
        System.out.println(ip6.getHostName());
        System.out.println(ip6.getHostAddress());
        System.out.println("===========================");
    }
}
