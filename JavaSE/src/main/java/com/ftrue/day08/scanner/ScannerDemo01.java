package com.ftrue.day08.scanner;

import java.util.Scanner;

/**
 * @ClassName ScannerDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月06日 16时10分
 * @Version 1.0
 *
 * Scanner类
 *      类的特点
 *          针对基本数据类型和字符串类型扫描器工具类
 *      类的位置
 *          java.util
 *      类的构造器
 *          public Scanner(InputStream source)
 *              构造一个新的 Scanner，它生成的值是从指定的输入流扫描的
 *
 *              new Scanner(System.in);
 *
 *      类的方法
 *          public void close()
 *              关闭此扫描器。
 *          public byte nextByte()
 *              将输入信息的下一个标记扫描为一个 byte。
 *          public short nextShort()
 *              将输入信息的下一个标记扫描为一个 short。
 *          public int nextInt()
 *              将输入信息的下一个标记扫描为一个 int。
 *          public long nextLong()
 *              将输入信息的下一个标记扫描为一个 long。
 *          public float nextFloat()
 *              将输入信息的下一个标记扫描为一个 float。
 *          public double nextDouble()
 *              将输入信息的下一个标记扫描为一个 double。
 *          public boolean nextBoolean()
 *              扫描解释为一个布尔值的输入标记并返回该值
 *          public String next()
 *              查找并返回来自此扫描器的下一个完整标记。
 *          public String nextLine()
 *              此扫描器执行当前行，并返回跳过的输入信息。
 *
 *  键盘录入基本数据类型的注意事项
 *      1.必须是该数据类型的数据
 *      2.不能超过其取值范围
 *
 */
public class ScannerDemo01 {
	public static void main(String[] args) {
		//创建Scanner对象
		Scanner sc = new Scanner(System.in);

		//键盘录入基本数据类型
		System.out.println("请键盘录入一个整数");
		int num = sc.nextInt();
		System.out.println("num = " + num);

		//关闭资源
		sc.close();
	}
}
