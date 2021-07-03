package com.ftrue.day02;

/*
	常量使用时的注意事项
		1.在程序中,如果给byte,short,char进行声明初始化赋值的时候,右面初始化值需要满足字面值常量,另外这个字面值常量的取值范围还需要在该数据类型的取值范围内,JVM中的常量区自动将其优化给对应的数据类型(常量优化机制一)
		2.在针对字面值常量运算操作的时候,如果符号两边都是字面值常量,在编译时期JVM中的常量区自动将其运算完毕(常量优化机制二)

		注意：编译时期、运行时期的对比理解
*/

public class BasicDemo05 {
	public static void main (String[] args) {
		byte num01 = 123;
		short num02 = 123;
		char num03 = 97;
		int num04 = 123;


		//byte b1 = 3;
		//byte b2 = 4;
		byte sum = 3 + 4; //在运行的时候,byte sum = 7;
		System.out.println(sum);
	}
}