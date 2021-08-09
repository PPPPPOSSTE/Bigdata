package com.ftrue.day18.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName FileDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月20日 08时46分
 * @Version 1.0
 *
 * 文件字节输入流FileInputStream
 *      类的特点:
 *          以字节为单位针对文件进行读取的工具类
 *      类的位置
 *          java.io
 *      类的构造器
 *          public FileInputStream(String name)
 *              通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
 *      类的方法
 *          public void close()
 *              关闭此文件输入流并释放与此流有关的所有系统资源。
 *          public int read()
 *              从此输入流中读取一个数据字节
 *          public int read(byte[] b)
 *              从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
 *
 * 注意事项:
 *      如果针对文件想进行第二次读取,需要重新获取输入流对象
 *
 */
public class FileDemo01 {
	public static void main(String[] args) throws IOException {
		//创建文件字节输入流对象
		FileInputStream fis = new FileInputStream("a.txt");

		//进行文件读取
		//方式1:以单个字节的方式进行读取文件
		/*System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());*/

		/*int len = fis.read();

		while (len != -1) {
			System.out.println(len);
			len = fis.read();
		}*/

		/*int len;
		while ((len = fis.read()) != -1) {
			System.out.println(len);
		}*/

		//方式2:以字节数组的方式进行读取文件
		int len;
		byte[] bytes = new byte[2];
		while ((len = fis.read(bytes)) != -1) {
			System.out.print(new String(bytes,0,len));//三个参数:数组,起始索引,长度
		}

		//关闭资源
		fis.close();
	}
}
