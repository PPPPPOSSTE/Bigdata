package com.ftrue.day04;

/*
	方法的递归:
		方法自身调用自身的一种现象

	方法递归的注意事项
		1.方法的递归是循环的一种,需要给递归添加上限定条件来保证方法可以停止下来,否则发生栈内存溢出
		2.方法的递归即使有限定条件,也不能递归的层数太多,否则发生栈内存溢出

	方法递归的好处:
		帮助解决一些循环语句无法解决的问题或者简化过程
*/

public class MethodDemo09 {
	static int num = 1;

	public static void main (String[] args) {
		System.out.println(num++);

		if (num == 10000) {
			return;
		}

		main(args);
	}
}