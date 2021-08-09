package com.ftrue.day18.io.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @ClassName IOUtils
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月20日 16时44分
 * @Version 1.0
 *
 * 关闭功能方法
 *      关闭字节流
 *          关闭字节输入流
 *          关闭字节输出流
 *          关闭字节输入流,字节输出流
 *          关闭字节输出流,字节输入流
 *      关闭字符流
 *          关闭字符输入流
 *          关闭字符输出流
 *          关闭字符输入流,字符输出流
 *          关闭字符输出流,字符输入流
 *
 */
public class IOUtils {
	//关闭字节输入流
	public static void close (InputStream is) throws IOException {
		if (is != null) {
			is.close();
		}
	}

	//关闭字节输出流
	public static void close (OutputStream os) throws IOException {
		if (os != null) {
			os.close();
		}
	}

	//关闭字节输入流,字节输出流
	public static void close (InputStream is , OutputStream os) throws IOException{
		try {
			close(is);
		} catch (IOException e) {

		} finally {
			close(os);
		}

	}

	//关闭字符输出流,字符输入流
	public static void close (OutputStream os , InputStream is ) throws IOException {
		try {
			close(os);
		} catch (IOException e) {

		} finally {
			close(is);
		}
	}

	//1.私有化构造器
	private IOUtils () {}
}
