package com.ftrue.day04;

/*
	练习：计算1+2+3...+100的和
*/

public class MethodDemo04 {
	public static void main (String[] args) {
		int sum = getSum();
		System.out.println("sum = " + sum);
	}

	/*
		两个明确:
			返回值类型:int
			形参列表:无,()中什么都不写
	*/
	public static int getSum () {
		int sum = 0;

		for (int i = 1; i <= 100 ;i++ ) {
			sum += i;
		}

		return sum;
	}
}