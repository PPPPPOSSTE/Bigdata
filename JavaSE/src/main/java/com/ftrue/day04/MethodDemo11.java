package com.ftrue.day04;

/*
  需求：
  		有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问指定月份的兔子对数为多少？

  规律：
  		第一个月：1
  		第二个月：1
  		第三个月：2
  		第四个月：3
  		第五个月：5
  		第六个月：8
  		...

  		规律：从第三个月开始，每个月的兔子对数是前两个月的兔子对数之和
           第一个月和第二个月的兔子对数都是1


*/

public class MethodDemo11 {
	static long count = 0;

	public static void main (String[] args) {
		//获取当前时间的纳秒值(1秒=1000毫秒 1毫秒=1000微秒 1微秒=1000纳秒)
		long start = System.nanoTime();
		long num = getNum02(50);
		long end = System.nanoTime();
		System.out.println("兔子的总对数:" + num);
		System.out.println("方法调用次数:" + count);
		System.out.println("程序运行时间:" + (end - start));
	}

	/*
		兔子的总对数:12586269025
		方法调用次数:1
		程序运行时间:3284
	*/

	public static long getNum02(int month) {
		//记录方法调用的次数
		count++;

		//temp表示当前月份兔子的总对数
		long temp = 0;
		//a表示上个月兔子的总对数
		long a = 1;
		//b表示上上个月兔子的总对数
		long b = 1;

		for (int i = 3; i <= month; i++) {
			temp = a + b;
			b = a;
			a = temp;
		}

		if (month == 1 || month == 2) {
			return 1;
		} else {
			return temp;
		}
	}

	/*
		两个明确:
			返回值类型:long
			形参列表:int month
		兔子的总对数:125.8626.9025
		方法调用次数:251.7253.8049
		程序运行时间:54.340.485.688
	*/
	public static long getNum01 (int month) {
		//记录方法调用的次数
		count++;

		//给递归添加限定的条件
		if (month == 1 || month == 2) {
			return 1;
		}

		return getNum01(month-1) + getNum01(month-2);
	}
}