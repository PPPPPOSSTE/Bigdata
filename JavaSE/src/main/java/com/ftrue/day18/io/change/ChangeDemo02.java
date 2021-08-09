package com.ftrue.day18.io.change;

import java.io.*;

/**
 * @ClassName ChangeDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月20日 14时29分
 * @Version 1.0
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
public class ChangeDemo02 {
	public static void main(String[] args) throws IOException {
		//需求1:保证文字正确,不出现乱码情况,读取GBK文件,将中文输出到UTF8文件中
		//method01();
		//需求2:保证文字正确,不出现乱码情况,读取GBK文件,将中文输出到GBK文件中
		//method02();
		//需求3:保证文字正确,不出现乱码情况,读取UTF8文件,将中文输出到GBK文件中
		//method03();
	}

	private static void method03() throws IOException {
		//创建转换输入流对象 原文件:编码UTF8 解码UTF8(自己)
		InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\20210625\\day18\\resources\\utf8.txt"));
		//创建转换输出流对象  输出文件:编码GBK(自己)  解码:GBK
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\20210625\\day18\\resources\\utf8_gbk.txt"),"gbk");

		//进行文件的读写操作
		int len;
		while ((len = isr.read()) != -1) {
			osw.write(len);
		}

		//关闭资源
		osw.close();
		isr.close();
	}

	private static void method02() throws IOException {
		//创建转换输入流对象 原文件:编码GBK 解码GBK(自己)
		InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\20210625\\day18\\resources\\gbk.txt"), "gbk");
		//创建转换输出流对象  输出文件:编码GBK(自己)  解码:GBK
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\20210625\\day18\\resources\\gbk_gbk.txt"),"gbk");

		//进行文件的读写操作
		int len;
		while ((len = isr.read()) != -1) {
			osw.write(len);
		}

		//关闭资源
		osw.close();
		isr.close();
	}

	private static void method01() throws IOException {
		//创建转换输入流对象 原文件:编码GBK 解码GBK(自己)
		InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\20210625\\day18\\resources\\gbk.txt"), "gbk");
		//创建转换输出流对象  输出文件:编码UTF8(自己)  解码:UTF8
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\20210625\\day18\\resources\\gbk_utf8.txt"));

		//进行文件的读写操作
		int len;
		while ((len = isr.read()) != -1) {
			osw.write(len);
		}

		//关闭资源
		osw.close();
		isr.close();

	}
}
