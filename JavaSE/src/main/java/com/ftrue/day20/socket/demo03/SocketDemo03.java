package com.ftrue.day20.socket.demo03;

/**
 * @ClassName SocketDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月23日 11时29分
 * @Version 1.0
 *
 * 在TCP协议程序的基础上:服务端收到信息后,给客户端返回一个"收到"
 *
 * 需求:消息回显
 *
 * 注意事项:
 *      在网络编程中进行发送消息或者数据时,在发送完毕后需要进行该流对象,使用客户端对象的shutdownOutput();
 *
 *      原因:
 *      进行网络读取的时候,输入流无法直接读取到-1,会陷入循环停滞状态,
 *      如果读取的while循环后面直接跟着关闭资源的代码,即使中间存在输出语句也会获取到-1,
 *      -1结束循环标记是关闭资源的代码给的.一旦while循环和关闭资源代码之间还有流的操作
 *      关闭资源的代码不会给其while循环提供-1的结束条件
 *
 */
public class SocketDemo03 {
}
