package com.ftrue.day20.socket.demo04;

/**
 * @ClassName SocketDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月23日 13时59分
 * @Version 1.0
 *
 * DatagramSocket类
 *      类的特点
 *          实现UDP协议完成发送和接收"数据报包"工具类
 *          数据报包:发送数据的字节集合(理解:快递包裹)
 *      类的位置
 *          java.net
 *      类的构造器
 *          发送端:
 *              public DatagramSocket()
 *                  构造数据报套接字并将其绑定到本地主机上任何可用的端口。
 *          接收端:
 *              public DatagramSocket(int port)
 *                  创建数据报套接字并将其绑定到本地主机上的指定端口。
 *      类的方法
 *          public void close()
 *              关闭此数据报套接字。
 *          public void send(DatagramPacket p)
 *              从此套接字发送数据报包
 *          public void receive(DatagramPacket p)
 *              从此套接字接收数据报包。
 *
 *
 * DatagramPacket类
 *      类的特点
 *          此类表示数据报包。
 *      类的位置
 *          java.net
 *      类的构造器
 *          发送端:
 *              public DatagramPacket(byte[] buf,int length,InetAddress address,int port)
 *                  构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。
 *          接收端:
 *              public DatagramPacket(byte[] buf,int length)
 *                  构造 DatagramPacket，用来接收长度为 length 的数据包。
 *      类的方法
 *          public InetAddress getAddress()
 *              返回某台机器的 IP 地址，此数据报将要发往该机器或者是从该机器接收到的。
 *          public byte[] getData()
 *              返回数据缓冲区。
 *          public int getLength()
 *              返回将要发送或接收到的数据的长度。
 *          public int getOffset()
 *              返回将要发送或接收到的数据的偏移量。
 *
 *
 * 需求:完成一个简单UDP程序
 */
public class SocketDemo04 {
}
