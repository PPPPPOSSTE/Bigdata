package com.ftrue.day04;

/*
	需求：求1到指定数之前的累加和
*/

public class MethodDemo10 {
	public static void main (String[] args) {

	}

	public static int getSum (int num) {
		//给递归添加限定条件
		if (num == 1) {
			return 1;
		}

		return num + getSum(num - 1);
	}

	public static int add (int num) {
		int sum = 0;

		for (int i = 1; i <= num ;i++ ) {
			sum += i;
		}

		return sum;
	}
}