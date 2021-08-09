package com.ftrue.day18.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName FileDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月20日 10时02分
 * @Version 1.0
 *
 *
 *
 *
 * 如果通过文件字节流的方式进行读写含有中文的文本文件时,读写的过程如下:
 *      文本文件(中文)->字节->文本文件->打开文件"解码"->中文
 *
 * 如果是用文件字节流进行读写含有中文的文本文件的时候,可能发生乱码的情况
 *
 * 文件字节流:读写视频,音频,图片等文件
 * 文件字符流:读写文本文件
 *      读写的时候不转换成字节,直接以字符为单位进行读写操作
 *
 *
 */
public class FileDemo03 {
	public static void main(String[] args) throws IOException {
		//以字节流的方式进行读取文件
		method01();
	}

	private static void method01() throws IOException {
		//创建文件字节输入流,输出流对象
		FileInputStream fis = new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("b.txt");

		//文件的读写操作
		int len = fis.read();
		while ((len = fis.read()) != -1) {
			fos.write(len);
			//System.out.println(len);
		}

		//关闭资源
		fos.close();
		fis.close();
	}
}
