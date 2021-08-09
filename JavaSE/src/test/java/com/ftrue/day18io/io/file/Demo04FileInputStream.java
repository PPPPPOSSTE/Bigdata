package com.ftrue.day18io.io.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: FileDemo05
 * @Description:
 * @Author: zhiqi zhang on 2021/7/20 0:44
 * @Version: 1.0
 */
/**
 *
 * 文件的复制:
 *      1.创建文件字节输入流对象
 *      2.创建文件字节输出流对象
 *      3.文件的读写操作
 *          方式1:以单个字节的方式进行文件的读写操作
 *          方式2:以字节数组的方式进行文件的读写操作
 *      4.关闭资源
 *          注意:如果关闭多个流对象,先开后关,后开先关
 *
 *
 */
public class Demo04FileInputStream {
    public static void main(String[] args) throws IOException {
        //方式1:以单个字节的方式进行文件的读写操作
        //method1();
        //方式2:以字节数组的方式进行文件的读写操作
        method2();
    }

    //字节数组方式
    private static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("file\\ylxb.wmv");
        FileOutputStream fos = new FileOutputStream("file\\copy.wmv");

        byte[] b = new byte[1024];  //数组：建议1024的倍数，推荐使用8192
        int len;
        //循环读取
        while ((len = fis.read(b)) != -1) {
            //循环写出
            fos.write(b, 0, len);
        }

        //关闭资源
        fos.close();
        fis.close();
    }

    //单字节方式
    private static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("file\\ylxb.wmv");
        FileOutputStream fos = new FileOutputStream("file\\copy.wmv");

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
