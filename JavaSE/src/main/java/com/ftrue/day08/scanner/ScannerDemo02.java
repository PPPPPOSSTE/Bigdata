package com.ftrue.day08.scanner;

import java.util.Scanner;

/**
 * @ClassName ScannerDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月06日 16时34分
 * @Version 1.0
 *
 * 使用Scanner类键盘录入字符串数据
 *
 * next()和nextLine()的区别
 *      next()的弊端:
 *          在扫描字符串的时候,无法扫描"空白符号"
 *      nextLine()的弊端:
 *          在nextLine()前面存在next()或者键盘录入基本数据类型的方法时,
 *          这些方法只能识别内容,无法识别回车.当程序读取nextLine(),
 *          直接会将缓冲区中的回车当成内容进行读取
 *
 *      目前阶段:
 *          使用next(),在进行键盘录入的时候避免使用空白符号即可;
 *          等IO流部分,讲解第二种键盘录入字符串的方式
 *
 *
 *
 */
public class ScannerDemo02 {
	public static void main(String[] args) {
		//创建Scanner对象
		Scanner sc = new Scanner(System.in);

		//键盘录入字符串
		/*System.out.println("键盘录入一个字符串");
		String str1 = sc.next();
		System.out.println("str1 = " + str1);*/

		/*System.out.println("键盘录入一个字符串");
		String str2 = sc.nextLine();
		System.out.println("str2 = " + str2);*/

		System.out.println("请输入会员编号");
		int id = sc.nextInt();
		System.out.println("id = " + id);

		System.out.println("请录入姓名");
		sc.nextLine();  //清楚前面的回车字符
		String name = sc.nextLine();
		//String name = sc.next();
		System.out.println("name = " + name);

		System.out.println("请输入年龄");
		int age = sc.nextInt();
		System.out.println("age = " + age);

		//关闭资源
		sc.close();

	}
}
