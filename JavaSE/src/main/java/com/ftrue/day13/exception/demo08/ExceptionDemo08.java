package com.ftrue.day13.exception.demo08;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * @ClassName ExceptionDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 11时34分
 * @Version 1.0
 *
 * finally关键字
 *      格式:
 *          try {
 *              可能出现异常的代码
 *          } catch (异常类名 对象名) {
 *              解决方案
 *          } finally {
 *              必须执行的代码
 *          }
 *
 *      无论是否发生异常,finally里面的代码都会执行
 *
 */
public class ExceptionDemo08 {
	public static void main(String[] args) {
		//创建Scanner对象
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			//友情提示
			System.out.println("请键盘录入一个整数");
			//调用键盘录入整数的方法
			int num = sc.nextInt();

			System.out.println("num = " + num);

		} catch (Exception e) {
			System.out.println("解决方案");

		} finally {
			//关闭资源
			if (sc != null) {
				System.out.println("关闭资源");
				sc.close();
			}
		}
	}
}
