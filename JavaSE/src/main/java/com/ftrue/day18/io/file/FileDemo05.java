package com.ftrue.day18.io.file;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName FileDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月20日 10时34分
 * @Version 1.0
 *
 * 文件字符输出流FileWriter
 *      类的特点
 *          以字符为单位针对文本文件进行输出操作的工具类
 *      类的位置
 *          java.io
 *      类的构造器
 *          public FileWriter(String fileName)
 *              根据给定的文件名构造一个 FileWriter 对象。
 *          public FileWriter(String fileName,boolean append)
 *              根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。
 *      类的方法
 *          public void close()
 *              关闭此流，但要先刷新它。
 *          public void flush()
 *              刷新该流的缓冲。
 *          public void write(int c)
 *              写入单个字符。
 *          public void write(char[] cbuf)
 *              写入字符数组。
 *          public void write(String str)
 *              写入字符串。
 *          public void write(char[] cbuf,int off,int len)
 *              写入字符数组的某一部分。
 *          public void write(String str,int off,int len)
 *              写入字符串的某一部分。
 *
 * FileWriter类的注意事项:
 *      文件字符输出流如果暂时不关闭该流,且需要文件文件中及时出现输出的内容,需要手动进行刷新
 */
public class FileDemo05 {
	public static void main(String[] args) throws IOException {
		//创建文件字符输出流对象
		FileWriter fw = new FileWriter("a.txt");

		//写出数据
		//方式1:以单个字符的方式进行写出
		fw.write(97);
		fw.write(98);
		fw.write(99);
		fw.write("\r\n");

		//方式2:以字符数组的方式进行呢写出
		fw.write("abcdefg".toCharArray());
		fw.write("\r\n");

		//方式3:以指定范围的字符数组进行写出,def(推荐)
		fw.write("abcdefg".toCharArray(),3,3);
		fw.write("\r\n");

		fw.flush();

		//方式4:以字符串的方式进行写出(推荐)
		fw.write("abcdefg");
		fw.write("\r\n");

		//方式5:以指定范围的字符串进行写出,def
		fw.write("abcdefg",3,3);


		System.out.println("========================================");

		//创建文件字节输出流
		FileOutputStream fos = new FileOutputStream("b.txt");

		fos.write("尚硅谷".getBytes());

		//关闭资源
		//fos.close();


		//关闭资源
		//fw.close();
	}
}
