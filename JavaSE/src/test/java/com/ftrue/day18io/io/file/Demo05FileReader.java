package com.ftrue.day18io.io.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: FileReaderDemo03
 * @Description:
 * @Author: zhiqi zhang on 2021/7/20 8:37
 * @Version: 1.0
 */
/**

  如果通过文件字节流的方式进行读写含有中文的文本文件时,读写的过程如下:
       文本文件(中文)->字节->文本文件->打开文件"解码"->中文

  如果是用文件字节流进行读写含有中文的文本文件的时候,可能发生乱码的情况

  文件字节流:读写视频,音频,图片等文件
  文件字符流:读写文本文件
       读写的时候不转换成字节,直接以字符为单位进行读写操作

 */
public class Demo05FileReader {
    public static void main(String[] args) throws IOException {
        //以字节流的方式进行读取文件
        method();

    }

    private static void method() throws IOException {
        FileInputStream fis = new FileInputStream("file\\a.txt");
        FileOutputStream fos = new FileOutputStream("file\\b.txt");

        int b;
        //循环读取
        while ((b = fis.read()) != -1) {
            //循环写出
            fos.write(b);
        }

        //关闭资源
        fos.close();
        fis.close();
    }
}
