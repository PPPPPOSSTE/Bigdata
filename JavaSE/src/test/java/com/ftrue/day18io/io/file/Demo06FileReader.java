package com.ftrue.day18io.io.file;

import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName: Demo06FileReader
 * @Description:
 * @Author: zhiqi zhang on 2021/7/20 10:26
 * @Version: 1.0
 */
/**

  文件字符输入流FileReader
       类的特点
           以字符为单位针对文件进行读取的工具类
       类的位置
           java.io
       类的构造器
           public FileReader(String fileName)
               在给定从中读取数据的文件名的情况下创建一个新 FileReader。
       类的方法
           public void close()
               关闭该流并释放与之关联的所有资源。
           public int read()
               读取单个字符。
           public int read(char[] cbuf)
               将字符读入数组。
 */
public class Demo06FileReader {
    public static void main(String[] args) throws IOException {
        //File file = new File("file\\a.txt");
        //FileReader fr = new FileReader(file);

        FileReader fr = new FileReader("file\\a.txt");


        //文件读取
        //方式1：以单个字符的方式进行读取文件
        //int read()
        /*int c;
        while ((c = fr.read()) != -1) {
            System.out.print((char) c);
            System.out.print(" = ");
            System.out.println(c);
        }*/

        //方式2：以字符数组的方式进行读取文件
        //int read(char[] cbuf)
        int len;
        char[] chars = new char[1024];
        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }

        fr.close();

    }
}
