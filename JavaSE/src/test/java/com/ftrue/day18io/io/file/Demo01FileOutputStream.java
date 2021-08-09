package com.ftrue.day18io.io.file;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: FileDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/19 16:03
 * @Version: 1.0
 */
/**

  IO流分类:
       以数据的流向进行分类
           输入流(其它设备 ==> 内存)
           输出流(内存 ==> 其它设备)
       以数据的单位进行分类
           字节流:数据在进行流动时候,以字节为单位
           字符流:数组在进行流动时候,以字符为单位

  根据上述两种分法将IO进行重新组合
       字节输入流
           InputStream
       字节输出流
           OutputStream
       字符输入流
           Reader
       字符输出流
           Writer

  真正要学习上述四种流的对应的子类:
       文件流(基本流)
           文件字节流
               文件字节输入流
               文件字节输出流
           文件字符流
               文件字符输入流
               文件字符输出流
       缓冲流(高效流)
           缓冲字节流
               缓冲字节输入流
               缓冲字节输出流
           缓冲字符流
               缓冲字符输入流
               缓冲字符输出流
       转换流:
           转换输入流
           转换输出流
       对象流:
           对象输入流
           对象输出流
       标准类:
           标准输入流
           标准输出流


  文件字节输出流
  FileOutputStream类
       类的特点
           针对文件进行以字节方式输出操作的工具类
       类的位置
           java.io
       类的构造器
           public FileOutputStream(String name)
               创建一个向具有指定名称的文件中写入数据的输出文件流。
           public FileOutputStream(String name,boolean append)
               创建一个向具有指定 name 的文件中写入数据的输出文件流。
       类的方法
           public void close()
               关闭此文件输出流并释放与此流有关的所有系统资源。
           public void write(int b)
               将指定字节写入此文件输出流。
           public void write(byte[] b)
               将 b.length 个字节从指定 byte 数组写入此文件输出流中。
           public void write(byte[] b,int off,int len)
               将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。

  注意事项:
       文件输出流FileOutStream类和FileWriter类创建对象时,即使没有文件,JVM会自动在指定路径下进行创建

  回车:将光标移动到当前行行首
  换行:将光标移动到下一行同样位置

  Windows系统 Enter键: 回车 + 换行
       在Windows系统中只写回车或者只写换行可以达到回车换行标准,是Windows系统的优化,自动补齐"\r\n"
 */
public class Demo01FileOutputStream {
    public static void main(String[] args) throws IOException {
        //创建文件字节输出流对象
        FileOutputStream fos = new FileOutputStream("a.txt");

        //以单个字节的方式进行输出
        fos.write(97);
        fos.write(98);
        fos.write(99);

        fos.write("\r\n".getBytes());  //回车键
        //fos.write("\n".getBytes());  //Windows系统自动优化补全为\r\n
        //fos.write("\r".getBytes());  //Windows系统自动优化补全为\r\n

        //以字节数组的方式进行输出
        fos.write("尚".getBytes());
        fos.write("硅".getBytes());
        fos.write("谷".getBytes());

        //以字节数组指定范围方式进行输出
        fos.write("abcdefg".getBytes(), 3, 3);

        fos.close();
    }
}
