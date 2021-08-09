package com.ftrue.day20test.socket.demo02;

/**
 * @ClassName: SocketDemo02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/23 10:36
 * @Version: 1.0
 */
/**
 *
 * ServerSocket类
 *      类的特点
 *          实现TCP协议服务端的工具类
 *      类的位置
 *          java.net
 *      类的构造器
 *          public ServerSocket(int port)
 *              创建绑定到特定端口的服务器套接字
 *      类的方法
 *          public Socket accept()
 *              侦听并接受到此套接字的连接。
 *          public void close()
 *              关闭此套接字。
 * Socket类
 *      类的特点
 *          实现TCP协议客户端的工具类
 *      类的位置
 *          java.net
 *      类的构造器
 *          public Socket(String host,int port)
 *              创建一个流套接字并将其连接到指定主机上的指定端口号。
 *      类的方法
 *          public void close()
 *              关闭此套接字。
 *          public InetAddress getInetAddress()
 *              返回套接字连接的地址。
 *          public InputStream getInputStream()
 *              返回此套接字的输入流。
 *          public OutputStream getOutputStream()
 *              返回此套接字的输出流。
 *          public void shutdownOutput()
 *              禁用此套接字的输出流。
 *
 */

public class SocketDemo02 {
    public static void main(String[] args) {

    }
}
