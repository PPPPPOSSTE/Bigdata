package com.ftrue.day18io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName: Demo09Buffered
 * @Description:
 * @Author: zhiqi zhang on 2021/7/20 11:43
 * @Version: 1.0
 */
/**
 *
 * 缓冲流(高效流)
 *      缓冲流本身是不具备读写操作功能,针对另外一个流进行包装,让其具有更高的性能
 *
 * 缓冲字节流(了解)
 *      缓冲字节输入流BufferedInputStream
 *          类的特点
 *              BufferedInputStream 为另一个输入流添加一些功能,从而让这个流更加高效
 *          类的位置
 *              java.io
 *          类的构造器
 *              public BufferedInputStream(InputStream in)
 *                  创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
 *          类的方法
 *
 *      缓冲字节输出流BufferedOutputStream
 *          类的特点
 *              BufferedOutputStream 为另一个输出流添加一些功能,从而让这个流更加高效
 *          类的位置
 *              java.io
 *          类的构造器
 *              public BufferedOutputStream(OutputStream out)
 *                  创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
 *          类的方法
 *
 *
 * 需求:复制JDK文件
 *      方式1:以单个字节方式使用文件字节流进行读写文件
 *      方式2:以单个字节方式使用缓冲字节流进行读写文件
 *
 *      方式3:以长度为1024字节数组方式使用文件字节流进行读写文件
 *      方式4:以长度为1024字节数组方式使用缓冲字节流进行读写文件
 *
 *      方式5:以长度为8192字节数组方式使用文件字节流进行读写文件
 *      方式6:以长度为8192字节数组方式使用缓冲字节流进行读写文件
 *
 *
 * 注意事项:
 *      当文件字节流的数组长度达到8192的时候,缓冲流的效率和文件流的效率基本持平,在实际开发中推荐使用文件字节流以8192长度数组的方式
 *
 * =========================================================================================================
 * Demo02
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
 *      缓冲字符输出流BufferedWriter
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
 *
 */
public class Demo02Buffered {
    public static void main(String[] args) throws IOException {
        //method01();
        method02();

    }

    private static void method02() throws IOException {
        //创建缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("file\\b.txt"));

        //写出数据
        bw.write("尚");
        //这样写不好，尽量不要使用。不同的操作系统的回车换行字符不一样。
        //bw.write("\r\n");
        //JVM会根据所在的系统进行回车换行输出
        bw.newLine();
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
