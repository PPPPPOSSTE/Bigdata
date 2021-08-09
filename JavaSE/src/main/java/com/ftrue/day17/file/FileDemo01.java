package com.ftrue.day17.file;

import java.io.File;

/**
 * @ClassName FileDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月19日 14时36分
 * @Version 1.0
 *
 * File类:
 *      类的特点
 *          系统中文件和文件夹抽象形式的工具类
 *      类的位置
 *          java.io
 *      类的构造器
 *          public File(String pathname)
 *              通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
 *      类的方法
 *          public File getAbsoluteFile()
 *              返回此抽象路径名的绝对路径名形式。
 *          public String getPath()
 *              将此抽象路径名转换为一个路径名字符串。
 *          public boolean exists()
 *              测试此抽象路径名表示的文件或目录是否存在。
 *          public String getName()
 *              返回由此抽象路径名表示的文件或目录的名称。
 *          public long length()
 *              返回由此抽象路径名表示的文件的长度。
 *          public boolean isFile()
 *              测试此抽象路径名表示的文件是否是一个标准文件。
 *          public File[] listFiles()
 *              返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
 *
 *
 * 相对路径和绝对路径:
 *      绝对路径:从盘符开始,是一个完整的路径
 *      相对路径:是一个变化的路径,相对于项目径路而言,这是实际开发使用的路径
 *
 *
 * 需求:
 *      遍历JDK安装路径,将所有的文件及文件夹按照刚才的方式进行打印
 *          1474文件 + 132目录
 */
public class FileDemo01 {
	public static void main(String[] args) {
		//创建File类对象
		File f1 = new File("G:\\abc\\a");//真实存在的文件夹
		File f2 = new File("G:\\abc\\a.txt");//真实存在的文件
		File f3 = new File("G:\\abc\\b");//不存在的文件夹
		File f4 = new File("abc");

		//获取路径
		System.out.println(f1.getPath());
		System.out.println(f1.getAbsolutePath());

		System.out.println("==================================");

		//获取路径
		System.out.println(f4.getPath());
		System.out.println(f4.getAbsolutePath());

		System.out.println("==================================");

		//判断路径在硬盘中是否真实存在
		System.out.println(f1.exists());
		System.out.println(f3.exists());

		System.out.println("==================================");

		//获取路径的名字
		System.out.println(f1.getName());
		System.out.println(f2.getName());

		System.out.println("==================================");

		//获取文件的真实大小
		System.out.println(f2.length());

		System.out.println("==================================");

		//判断File对象是否为文件
		System.out.println(f1.isFile());
		System.out.println(f2.isFile());

		System.out.println("==================================");

		//获取指定File路径中当前文件夹的所有文件及文件夹
		File file = new File("D:\\develop\\Java\\jdk1.8.0_202");

		File[] files = file.listFiles();

		for (File f : files) {
			if (f.isFile()) {
				System.out.println("文件:" + f);
			} else {
				System.out.println("目录:" + f);
			}
		}
	}
}
