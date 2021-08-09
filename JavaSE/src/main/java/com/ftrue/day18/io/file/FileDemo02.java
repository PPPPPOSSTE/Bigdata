package com.ftrue.day18.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName FileDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月20日 09时10分
 * @Version 1.0
 *
 * 文件的复制:
 *      1.创建文件字节输入流对象
 *      2.创建文件字节输出流对象
 *      3.文件的读写操作
 *          方式1:以单个字节的方式进行文件的读写操作
 *          方式2:以字节数组的方式进行文件的读写操作
 *      4.关闭资源
 *          注意:如果关闭多个流对象,先开后关,后开先关
 */
public class FileDemo02 {
	public static void main(String[] args) throws IOException {
		//方式1:以单个字节的方式进行文件的读写操作
		//method01();
		//方式2:以字节数组的方式进行文件的读写操作
		method02();
	}

	private static void method02() throws IOException {
		//1.创建文件字节输入流对象
		FileInputStream fis = new FileInputStream("G:\\20210625\\day18\\resources\\ylxb.wmv");
		//2.创建文件字节输出流对象
		FileOutputStream fos = new FileOutputStream("G:\\20210625\\day18\\resources\\copy.wmv");

		//3.文件的读写操作
		int len;
		byte[] bytes = new byte[8192];//数组:建议1024的倍数  推荐使用8192
		while ((len = fis.read(bytes)) != -1) {
			fos.write(bytes,0,len);
		}

		//4.关闭资源
		fos.close();
		fis.close();
	}

	private static void method01() throws IOException {
		//1.创建文件字节输入流对象
		FileInputStream fis = new FileInputStream("G:\\20210625\\day18\\resources\\ylxb.wmv");
		//2.创建文件字节输出流对象
		FileOutputStream fos = new FileOutputStream("G:\\20210625\\day18\\resources\\copy.wmv");

		//3.文件的读写操作
		int len;
		while ((len = fis.read()) != -1) {
			fos.write(len);
		}

		//4.关闭资源
		fos.close();
		fis.close();
	}
}
