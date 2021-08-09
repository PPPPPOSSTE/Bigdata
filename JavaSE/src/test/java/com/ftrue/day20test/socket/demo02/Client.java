package com.ftrue.day20test.socket.demo02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @ClassName: Client
 * @Description:
 * @Author: zhiqi zhang on 2021/7/23 10:37
 * @Version: 1.0
 */
/*
 *
 * 用于表示TCP协议客户端
 *
 * */
public class Client {
    public static void main(String[] args) throws IOException {
        //创建TCP协议客户端对象
        Socket s = new Socket("localhost", 12345);

        //客户端需要给服务端发送数据
        //获取客户端的输出流对象
        OutputStream os = s.getOutputStream();

        //写出数据
        os.write("hello".getBytes());

        //关闭资源
        os.close();
        s.close();
    }
}
