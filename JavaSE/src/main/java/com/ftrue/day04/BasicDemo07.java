package com.ftrue.day04;

/*
	打印九九乘法口诀表

	外层循环控制:行
	内层循环控制:列
*/

public class BasicDemo07 {
	public static void main (String[] args) {
		for (int hang = 1; hang <= 9 ; hang++ ) {
			for (int lie = 1; lie <= hang ; lie++ ) {
				System.out.print(lie + "*" + hang + "=" + lie * hang + "\t");
			}
			System.out.println();
		}
	}
}