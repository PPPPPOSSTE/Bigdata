package com.ftrue.day20test.socket.demo07;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @ClassName: Receive
 * @Description:
 * @Author: zhiqi zhang on 2021/7/23 14:17
 * @Version: 1.0
 */
public class Receive implements Runnable {
    private DatagramSocket datagramSocket;

    public Receive(DatagramSocket datagramSocket) {
        this.datagramSocket = datagramSocket;
    }

    @Override
    public void run() {
        try {
            boolean flag = true;

            while (flag) {
                byte[] bytes = new byte[8192];
                int length = bytes.length;

                DatagramPacket dp = new DatagramPacket(bytes, length);
                datagramSocket.receive(dp);
                String ip = dp.getAddress().getHostAddress();
                byte[] data = dp.getData();
                int len = dp.getLength();
                String str = new String(data, 0, len);
                System.out.println(ip + " : " + str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (datagramSocket != null) {
                datagramSocket.close();
            }
        }
    }
}