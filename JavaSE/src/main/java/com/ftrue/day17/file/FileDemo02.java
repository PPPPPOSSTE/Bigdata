package com.ftrue.day17.file;

import java.io.File;

/**
 * @ClassName FileDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月19日 15时34分
 * @Version 1.0
 *
 * 需求:
 *      遍历JDK安装路径,将所有的文件及文件夹按照刚才的方式进行打印
 *          1474文件 + 132目录
 */
public class FileDemo02 {
	public static void main(String[] args) {
		//将JDK安装路径封装到File对象中
		File file = new File("D:\\develop\\Java\\jdk1.8.0_202");

		//使用方法将遍历当前文件夹功能实现
		getPath(file);
	}

	private static void getPath(File path) {
		//健壮性判断
		if (path == null) {
			return;
		}

		//获取当前路径下所有的文件夹和文件
		File[] files = path.listFiles();

		//遍历数组
		for (File file : files) {
			if (file.isFile()) {
				System.out.println("文件:" + file);
			} else {
				System.out.println("目录:" + file);
				getPath(file);
			}
		}
	}
}
