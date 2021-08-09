package com.ftrue.day18io.io.file;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName: FileDemo03
 * @Description:
 * @Author: zhiqi zhang on 2021/7/20 0:13
 * @Version: 1.0
 */
/**

  文件字节输入流FileInputStream
       类的特点:
           以字节为单位针对文件进行读取的工具类
       类的位置
           java.io
       类的构造器
           public FileInputStream(String name)
               通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
       类的方法
           public void close()
               关闭此文件输入流并释放与此流有关的所有系统资源。
           public int read()
               从此输入流中读取一个数据字节
           public int read(byte[] b)
               从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。

  注意事项:
       如果针对文件想进行第二次读取,需要重新获取输入流对象

 */
public class Demo03FileInputStream {
    public static void main(String[] args) throws IOException {
        //使用File对象创建流对象
        //File file = new File("file\\a.txt");
        //FileInputStream fis = new FileInputStream(file);

        //使用文件名创建流对象
        FileInputStream fis = new FileInputStream("file\\a.txt");

        //方式1：每一次读取一个字节的数据
        //int read()   //int为读取的单字节数据
        /*int read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        //读取到末尾，返回-1
        read = fis.read();
        System.out.println(read);*/

        /*int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }
        System.out.println("========================");

        //再读取的话，无内容可读。和集合中的迭代器类似。
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }*/


        //方式2：以字节数组的方式进行读取文件
        //int read(byte[] b) 每次读取字节数组长度大小的字节数据，并存放到字节数组中，返回值int代表实际读到的字节数据的个数
        int len;
        byte[] bytes = new byte[2];
        while ((len = fis.read(bytes)) != -1) {
            //注意最后文件剩余字节数据个数小于字节数组长度的情形
            System.out.println(new String(bytes, 0, len));
        }

        //关闭资源
        fis.close();
    }
}
