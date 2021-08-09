package com.ftrue.day20test.socket.demo07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @ClassName: Send
 * @Description:
 * @Author: zhiqi zhang on 2021/7/23 14:17
 * @Version: 1.0
 */
public class Send implements Runnable {
    private DatagramSocket datagramSocket;

    public Send(DatagramSocket datagramSocket) {
        this.datagramSocket = datagramSocket;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str;
            while ((str = br.readLine()) != null) {
                byte[] bytes = str.getBytes();
                int length = bytes.length;
                InetAddress ip = InetAddress.getByName("localhost");
                int port = 12345;

                DatagramPacket dp = new DatagramPacket(bytes, length, ip, port);

                datagramSocket.send(dp);
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
