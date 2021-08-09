package com.ftrue.day17.io.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName FileDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月19日 16时49分
 * @Version 1.0
 *
 * 文件的续写:
 */
public class FileDemo02 {
	public static void main(String[] args) throws IOException {
		//创建文件字节输出流对象
		FileOutputStream fos = new FileOutputStream("a.txt",true);

		fos.write("硅".getBytes());


		//关闭资源
		fos.close();

	}
}
