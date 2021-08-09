package com.ftrue.day08.math;

import java.util.Scanner;

/**
 * @ClassName MathDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月06日 17时06分
 * @Version 1.0
 *
 * 猜数字小游戏:
 *      1.通过Math工具类随机生成一个1-100之间的整数
 *      2.通过Scanner类键盘录入一个整数
 *      3.将键盘录入整数和随机生成整数进行比较
 *           键盘录入整数 > 随机生成整数
 *              提示:猜大了
 *           键盘录入整数 < 随机生成整数
 *              提示:猜小了
 *           键盘录入整数 = 随机生成整数
 *              提示:猜中了
 *      4.因为无法保证一次就中,需要循环语句while,猜中的时候停止循环
 */
public class MathDemo02 {
	public static void main(String[] args) {
		method03();
	}

	public static void method03() {
		//1.通过Math工具类随机生成一个1-100之间的整数
		int num = (int)(Math.random() * 100 + 1 );

		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		int start = 1;
		int end = 100;


		//4.因为无法保证一次就中,需要循环语句while,猜中的时候停止循环
		while (true) {
			//2.通过Scanner类键盘录入一个整数
			System.out.println("请键盘录入一个" + start + "-" + end + "之间的整数:");
			int guessNum = sc.nextInt();

			if (guessNum < start || guessNum > end) {
				System.out.println("你猜的数字并不在范围内,请重新输入...");
				continue;
			}

			//3.将键盘录入整数和随机生成整数进行比较
			if (guessNum > num) {
				System.out.println("你猜的数字太大了,请重新输入...");
				end = guessNum - 1;
			} else if (guessNum < num) {
				System.out.println("你猜的数字太小了,请重新输入...");
				start = guessNum + 1;
			} else {
				System.out.println("恭喜你,猜中啦,晚上可以买彩票去啦...");
				break;
			}
		}

		//关闭资源
		sc.close();
	}

	public static void method02() {
		//1.通过Math工具类随机生成一个1-100之间的整数
		int num = (int)(Math.random() * 100 + 1 );

		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		int start = 1;
		int end = 100;


		//4.因为无法保证一次就中,需要循环语句while,猜中的时候停止循环
		while (true) {
			//2.通过Scanner类键盘录入一个整数
			System.out.println("请键盘录入一个" + start + "-" + end + "之间的整数:");
			int guessNum = sc.nextInt();

			//3.将键盘录入整数和随机生成整数进行比较
			if (guessNum > num) {
				System.out.println("你猜的数字太大了,请重新输入...");
				end = guessNum - 1;
			} else if (guessNum < num) {
				System.out.println("你猜的数字太小了,请重新输入...");
				start = guessNum + 1;
			} else {
				System.out.println("恭喜你,猜中啦,晚上可以买彩票去啦...");
				break;
			}
		}

		//关闭资源
		sc.close();
	}

	public static void method01() {
		//1.通过Math工具类随机生成一个1-100之间的整数
		int num = (int)(Math.random() * 100 + 1 );

		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		//4.因为无法保证一次就中,需要循环语句while,猜中的时候停止循环
		while (true) {
			//2.通过Scanner类键盘录入一个整数
			System.out.println("请键盘录入一个1-100之间的整数:");
			int guessNum = sc.nextInt();

			//3.将键盘录入整数和随机生成整数进行比较
			if (guessNum > num) {
				System.out.println("你猜的数字太大了,请重新输入...");
			} else if (guessNum < num) {
				System.out.println("你猜的数字太小了,请重新输入...");
			} else {
				System.out.println("恭喜你,猜中啦,晚上可以买彩票去啦...");
				break;
			}
		}

		//关闭资源
		sc.close();
	}
}
