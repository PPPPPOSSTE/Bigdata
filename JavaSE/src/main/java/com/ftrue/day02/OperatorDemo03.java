package com.ftrue.day02;

/*
	赋值运算符:
		基础的赋值运算符:=
		扩展的赋值运算符:+= -= *= /= %=
			将符号左边的内容和右边的内容进行运算操作,将结果赋值给符号左边的变量

	注意事项:
		使用扩展的赋值运算符将运算后的结果赋值给左边的变量之前,隐含做了一步强制类型转换
*/

public class OperatorDemo03 {
	public static void main (String[] args) {
		int num = 3;//将整数3赋值给int类型变量的num

		int a = 3;
		int b = 4;
		System.out.println(a += b);//7,相当于 a = a + b;
		System.out.println(a -= b);//3
		System.out.println(a *= b);//12
		System.out.println(a /= b);//3
		System.out.println(a %= b);//3

		System.out.println("=========================================");

		a = 3;
		b = 4;

		a += b * 5;//23
		System.out.println("a = " + a);//23

		System.out.println("=========================================");

		byte b1 = 3;
		byte b2 = 4;
		//b2 = b2 + b1;
		b2 += b1;

	}
}