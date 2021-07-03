package com.ftrue.day04;

/*
	练习：比较两个整数是否相同
*/

public class MethodDemo03 {
	public static void main (String[] args) {
		boolean result = compare(4,4);
		System.out.println("result = " + result);
	}

	/*
		两个明确:
			返回值类型:boolean
			形参列表:int a, int b
	*/
	public static boolean compare (int a , int b) {
		/*
		if (a == b) {
			return true;
		} else {
			return false;
		}
		*/

		//return a == b ? true : false;
		return a == b;
	}
}