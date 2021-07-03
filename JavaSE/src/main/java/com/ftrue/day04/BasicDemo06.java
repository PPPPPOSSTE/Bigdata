package com.ftrue.day04;

/*
	练习：打印1-100之间所有质数

	质数:只能被1或者本身进行整除的整数,1不是质数

	被除数 / 除数 = 商 ......余数

	1 / 1 = 1 ...... 0
	2 / 1 = 2 ...... 0
	2 / 2 = 1 ...... 0
	3 / 1 = 3 ...... 0
	3 / 2 = 1 ...... 1
	3 / 3 = 1 ...... 0
	4 / 1 = 4 ...... 0
	4 / 2 = 2 ...... 0
	4 / 3 = 1 ...... 1
	4 / 4 = 1 ...... 0
	......
*/

public class BasicDemo06 {
	public static void main (String[] args) {
		int count = 0;

		//循环次数:1133次
		for (int i = 2; i <= 100; i++ ) {
			boolean flag = true;

			for (int j = 2; j < i; j++ ) {
				count++;

				if (i % j == 0) {
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.println(i);
			}
		}

		/*
		循环次数:5050
		for (int i = 1; i <= 100; i++) {
			//声明并初始化被除数整除次数的计数器变量
			int counter = 0;

			for (int j = 1; j <= i; j++) {
				count++;


				if (i % j == 0) {
					counter++;
				}
			}

			//判断整数的次数是否为2
			if (counter == 2) {
				System.out.println(i);
			}
		}
		*/

		System.out.println(count);
	}
}