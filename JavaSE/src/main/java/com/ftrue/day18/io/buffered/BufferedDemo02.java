package com.ftrue.day18.io.buffered;

import java.io.*;

/**
 * @ClassName BufferedDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月20日 11时39分
 * @Version 1.0
 *
 * 缓冲字符流:
 *      缓冲字符输入流BufferedReader
 *          类的特点
 *              从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
 *          类的位置
 *              java.io
 *          类的构造器
 *              public BufferedReader(Reader in)
 *                  创建一个使用默认大小输入缓冲区的缓冲字符输入流。
 *          类的方法
 *              public String readLine()
 *                  读取一个文本行。
 *
 *
 *      缓冲字符输出流
 *          类的特点
 *              将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。
 *          类的位置
 *              java.io
 *          类的构造器
 *              public BufferedWriter(Writer out)
 *                  创建一个使用默认大小输出缓冲区的缓冲字符输出流。
 *          类的方法
 *              public void newLine()
 *                  写入一个行分隔符。
 */
public class BufferedDemo02 {
    public static void main(String[] args) throws IOException {
        //method01();
        method02();
    }

    private static void method02() throws IOException {
        //创建缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

        //写出数据
        bw.write("尚");
        //bw.write("\r\n");
        bw.newLine();//JVM会根据所在的系统进行回车换行输出
        bw.write("硅");
        //bw.write("\r\n");
        bw.newLine();
        bw.write("谷");

        //关闭资源
        bw.close();

    }

    private static void method01() throws IOException {
        //创建缓冲输入字符流对象
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        //通过行的方式进行读取
        String len;
        while ((len = br.readLine()) != null) {
            System.out.println(len);
        }

        //关闭资源
        br.close();
    }
}
