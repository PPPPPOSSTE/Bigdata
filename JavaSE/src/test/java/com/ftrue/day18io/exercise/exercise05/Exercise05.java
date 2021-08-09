package com.ftrue.day18io.exercise.exercise05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/22 9:48
 * @Version: 1.0
 */
/*
 *
 * 第五题
        1、声明一个Message类，包含：发送者、接收者、消息内容、发送时间
        2、创建一个Message对象，并写到message.dat文件中，并再次读取显示
 *
 *
 * */
public class Exercise05 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建Message对象
        Message message = new Message("lsy", "xly", "hello", new Date());

        //writeObject(message);

        readObject();
    }

    private static void readObject() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file\\message.dat"));
        Object obj = ois.readObject();
        System.out.println(obj);
        ois.close();
    }

    private static void writeObject(Message message) throws IOException {
        //对象序列化流、对象反序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file\\message.dat"));
        oos.writeObject(message);
        oos.close();
    }
}
