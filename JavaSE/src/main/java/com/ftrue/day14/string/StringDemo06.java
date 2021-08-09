package com.ftrue.day14.string;

import java.util.Scanner;

/**
 * @ClassName StringDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月14日 14时39分
 * @Version 1.0
 *
 * 键盘录入一个字符串，统计字符串中大小写字母及数字字符个数
 */
public class StringDemo06 {
	public static void main(String[] args) {
		//键盘录入一个字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str = sc.next();

		//声明各个字符串计数器变量
		int big = 0;
		int small = 0;
		int num = 0;
		int other = 0;

		//获取字符串中的所有字符方案1:将字符串转换为字符数组
		//获取字符串中的所有字符方案2:遍历字符串,通过索引获取指定字符
		for (int i = 0; i < str.length() ; i++) {
			char c = str.charAt(i);

			if (c >= 'A' && c <= 'Z') {
				big++;
			} else if (c >= 'a' && c <= 'z') {
				small++;
			} else if (c >= '0' && c <= '9') {
				num++;
			} else {
				other++;
			}
		}

		//打印计数器变量
		System.out.println("字符串中含有大写字母共" + big + "个");
		System.out.println("字符串中含有小写字母共" + small + "个");
		System.out.println("字符串中含有数字字符共" + num + "个");
		System.out.println("字符串中含有其它字符共" + other + "个");








		//关闭资源
		sc.close();
	}
}
