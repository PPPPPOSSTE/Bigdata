package com.ftrue.day02;

/*
	三元运算符
		含有三个未知量的运算符

	格式:
		关系表达式 ? 结果值1 : 结果值2

	执行流程:
		1.先确认关系表达式的结果是true还是false
		2.如果是true,执行结果值1;
		  如果是false,执行结果值2

	需求:求两个数中较大值

	注意事项
		当三元运算符根据布尔值选择结果值后,另外一个结果值不做任何执行
*/

public class OperatorDemo07 {
	public static void main (String[] args) {
		int a = 3;
		int b = 4;

		int max = a > b ? ++a : ++b;
		System.out.println("max = " + max);

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}


