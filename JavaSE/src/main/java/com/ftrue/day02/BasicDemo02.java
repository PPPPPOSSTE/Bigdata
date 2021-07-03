package com.ftrue.day02;

/*
	强制类型转换(显式类型转换)
		将取值范围较大的类型转换为取值范围较小的数据类型

	格式:
		取值范围较小的数据类型 变量名 = (取值范围较小的数据类型)取值范围较大的数据类型的数据值;
*/

public class BasicDemo02 {
	public static void main (String[] args) {
		int num = (int)3.999;
		System.out.println(num);
	}
}