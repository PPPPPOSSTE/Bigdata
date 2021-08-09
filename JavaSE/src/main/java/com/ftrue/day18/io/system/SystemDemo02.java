package com.ftrue.day18.io.system;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @ClassName SystemDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月20日 16时23分
 * @Version 1.0
 *
 * 标准输出流System.out
 *
 * PrintStream类
 *      类的特点
 *          PrintStream 为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式
 *      类的位置
 *          java.io
 *      类的构造器
 *          public PrintStream(String fileName)
 *              创建具有指定文件名称且不带自动行刷新的新打印流。
 *      类的方法
 */
public class SystemDemo02 {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Hello");

		//需求:有些内容如果想快速打印到文本文件中,可以选择打印流
		//创建打印流对象
		PrintStream ps = new PrintStream("print.txt");

		//需要将System中的打印流替换成自定义的打印流对象
		System.setOut(ps);

		System.out.print("World");



		//关闭资源
		ps.close();
	}
}
