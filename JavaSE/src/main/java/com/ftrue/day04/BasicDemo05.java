package com.ftrue.day04;

/*
	花100文钱买100只鸡
	公鸡5文1只
	母鸡3文1只
	小鸡1文3只
	花100文钱正好买100只鸡

	解题思路:
		一种一种可能性尝试

	0只公鸡0只母鸡0只小鸡
	0只公鸡0只母鸡1只小鸡
	0只公鸡0只母鸡2只小鸡
	0只公鸡0只母鸡3只小鸡
	...........
*/

public class BasicDemo05 {
	public static void main (String[] args) {
		int count = 0;

		//循环次数:714
		for (int gong = 0; gong <= 20 ; gong++) {
			for (int mu = 0; mu <= 33; mu++ ) {
				int xiao = 100 - gong - mu;
				count++;
				//进行条件判断
				if ((gong*5 + mu*3 + xiao/3 == 100) && (xiao % 3==0)) {
					System.out.println("公鸡有"+gong+"只，母鸡有"+mu+"只，小鸡有"+xiao+"只");
				}
			}
		}

		/*
		循环次数:72114
		for (int gong = 0; gong <= 20 ; gong++) {
			for (int mu = 0; mu <= 33; mu++ ) {
				for (int xiao = 0; xiao <= 100; xiao++ ) {
					count++;
					//进行条件判断
					if ((gong + mu + xiao == 100) && (gong*5 + mu*3 + xiao/3 == 100) && (xiao % 3==0)) {
						System.out.println("公鸡有"+gong+"只，母鸡有"+mu+"只，小鸡有"+xiao+"只");
					}
				}
			}
		}
		*/
		/*
		循环次数:1030301
		for (int gong = 0; gong <= 100 ; gong++) {
			for (int mu = 0; mu <= 100; mu++ ) {
				for (int xiao = 0; xiao <= 100; xiao++ ) {
					count++;
					//进行条件判断
					if ((gong + mu + xiao == 100) && (gong*5 + mu*3 + xiao/3 == 100) && (xiao % 3==0)) {
						System.out.println("公鸡有"+gong+"只，母鸡有"+mu+"只，小鸡有"+xiao+"只");
					}
				}
			}
		}
		*/
		System.out.println(count);
	}
}