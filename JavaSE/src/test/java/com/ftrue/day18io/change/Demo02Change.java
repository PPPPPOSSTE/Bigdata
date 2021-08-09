package com.ftrue.day18io.change;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @ClassName: Demo02Change
 * @Description:
 * @Author: zhiqi zhang on 2021/7/20 14:29
 * @Version: 1.0
 */

/**
 *
 * 转换流:
 *      转换输入流
 *      转换输出流
 *
 * 编码和解码
 *      编码:看懂的(中文) ==> 看不懂的(字节)
 *      解码:看不懂的(字节) ==> 看懂的(中文)
 *
 * 乱码现象:
 *      指的就是编码的规则和解码的规则不一致的情况下
 *
 * 编码和解码规则:字符集(比喻为某一本书籍)
 *      ASCII字符集
 *          ASCII字符编码1(0-127):支持大小写英文字母,数字,符号等
 *              所有的内容都以单个字节方式进行存储
 *          ASCII字符编码2(0-255):除了支持上述128个,还支持一些北约国家符号
 *      Unicode字符集
 *          UTF-8:全球程序员默认开发环境
 *          UTF-16:
 *          UTF-32:
 *
 *          ASCII中的内容占1个字节
 *          拉丁字符:每个字符占2个字节
 *          中文字符:每个字符占3个字节
 *          其它字符:每个字符占4个字节
 *
 *      GB字符集
 *          GB2312:7000多汉字
 *          GBK:21003个汉字,除了汉字,数字,字母,日文,韩文,繁体中文
 *          GB18030:70244个汉字,除了汉字,数字,字母,日文,韩文,繁体中文,少数民族文字
 *
 *          每个字符在内存中占2个字节,包括英文,标点符号等
 *      ISO-8859字符集
 *          欧洲的码表
 *          ISO-8859-1
 *          ISO-8859-2
 *          ISO-8859-3
 *          ......
 *          ISO-8859-15
 *
 * =====================================================================================
 * Demo02
 *
 * 转换流:
 *      就是为了解决读写中文时出现乱码的情况,在读写时可以指定编码表
 *
 *
 * 需求:
 *      保证文字正确,不出现乱码情况,读取GBK文件,将中文输出到UTF8文件中
 *      保证文字正确,不出现乱码情况,读取GBK文件,将中文输出到GBK文件中
 *      保证文字正确,不出现乱码情况,读取UTF8文件,将中文输出到GBK文件中
 *
 * 转换输入流InputStreamReader
 *      类的特点
 *          InputStreamReader 是字节流通向字符流的桥梁：
 *          它使用指定的 charset 读取字节并将其解码为字符。
 *      类的位置
 *          java.io
 *      类的构造器
 *          public InputStreamReader(InputStream in)
 *              创建一个使用默认字符集的 InputStreamReader。
 *          public InputStreamReader(InputStream in,String charsetName)
 *              创建使用指定字符集的 InputStreamReader。
 *      类的方法
 *
 *
 * 转换输出流OutputStreamWriter:
 *      类的特点
 *          OutputStreamWriter 是字符流通向字节流的桥梁：
 *          可使用指定的 charset 将要写入流中的字符编码成字节
 *      类的位置
 *          java.io
 *      类的构造器
 *          public OutputStreamWriter(OutputStream out)
 *              创建使用默认字符编码的 OutputStreamWriter。
 *          public OutputStreamWriter(OutputStream out,String charsetName)
 *              创建使用指定字符集的 OutputStreamWriter。
 *      类的方法
 *
 */
public class Demo02Change {
    public static void main(String[] args) throws IOException {
        //需求1:保证文字正确,不出现乱码情况,读取GBK文件,将中文输出到UTF8文件中
        //method01();
        //需求2:保证文字正确,不出现乱码情况,读取GBK文件,将中文输出到GBK文件中
        //method02();
        //需求3:保证文字正确,不出现乱码情况,读取UTF8文件,将中文输出到GBK文件中
        method03();
    }

    private static void method03() throws IOException {
        //创建转换输入流对象 原文件:编码UTF8 解码UTF8(自己)
        InputStreamReader isr = new InputStreamReader(new FileInputStream("file\\utf8.txt"));
        //创建转换输出流对象  输出文件:编码GBK(自己)  解码:GBK
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("file\\utf8_gbk.txt"), "gbk");

        //进行文件的读写操作
        int c;
        while ((c = isr.read()) != -1) {
            osw.write(c);
        }

        //关闭资源
        osw.close();
        isr.close();
    }

    private static void method02() throws IOException {
        //创建转换输入流对象 原文件:编码GBK 解码GBK(自己)
        InputStreamReader isr = new InputStreamReader(new FileInputStream("file\\gbk.txt"), "gbk");
        //创建转换输出流对象  输出文件:编码GBK(自己)  解码:GBK
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("file\\gbk_gbk.txt"), "gbk");

        //进行文件的读写操作
        int c;
        while ((c = isr.read()) != -1) {
            osw.write(c);
        }

        //关闭资源
        osw.close();
        isr.close();
    }

    private static void method01() throws IOException {
        //创建转换输入流对象 原文件:编码GBK 解码GBK(自己)
        InputStreamReader isr = new InputStreamReader(new FileInputStream("file\\gbk.txt"), "gbk");
        //创建转换输出流对象  输出文件:编码UTF8(自己)  解码:UTF8
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("file\\gbk_utf8.txt"));

        //进行文件的读写操作
        int c;
        while ((c = isr.read()) != -1) {
            osw.write(c);
        }

        //关闭资源
        osw.close();
        isr.close();
    }


}
