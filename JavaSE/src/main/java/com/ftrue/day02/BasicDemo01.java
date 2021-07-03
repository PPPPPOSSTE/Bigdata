package com.ftrue.day02;

/*
	数据类型转换
		基本数据类型之间的转换(基本<==>基本)
		引用数据类型之间的转换(引用<==>引用)
		基本数据类型和包装类型之间的转换(基本<==>包装)
		基本数据类型和字符串类型之间的转换(基本<==>字符串)

	基本数据类型之间的转换:七种数值类型之间的转换
		自动类型转换(隐式类型转换)
		强制类型转换(显式类型转换)

	自动类型转换(隐式类型转换)
		将取值范围较小的数据类型转换取值范围较大的数据类型

		基本数据类型取值范围从小到大的顺序
			byte < short < int < long < float < double
					char < int < long < float < double

	面试题:long类型在内存中占8个字节，float类型在内存中占4个字节，为什么long还要比float小呢？
		基本数据类型之间的转换和占用内存没有关系

		long取值范围最大值 < 2^63
		float取值范围的最大值  > 3.4 * 10^38
							   > 2 * 10^38
							   > 2 * 8^38
							   = 2 * (2^3)^38
							   = 2 * 2^114
							   = 2^115


*/


public class BasicDemo01 {
	public static void main (String[] args) {
		long num01 = 123L;
		float num02 = 12.34F;

		//num01 = num02;错误: 不兼容的类型: 从float转换到long可能会有损失
		num02 = num01;

		char num03 = 'a';
		int num04 = 123;

		//num03 = num04;//错误: 不兼容的类型: 从int转换到char可能会有损失
		num04 = num03;

		short num05 = 123;
		//num03 = num05;错误: 不兼容的类型: 从short转换到char可能会有损失
		//num05 = num03;错误: 不兼容的类型: 从char转换到short可能会有损失
	}
}