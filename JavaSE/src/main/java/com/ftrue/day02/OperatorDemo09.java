package com.ftrue.day02;

/*
	运算符的优先级
		不要把一个表达式写得过于复杂，如果一个表达式过于复杂，则把它分成几步来完成；
		不要过多的依赖运算的优先级来控制表达式的执行顺序，这样可读性太差，尽量使用()来控制表达式的执行顺序
*/

public class OperatorDemo09 {
	public static void main (String[] args) {
		int num = 3;
		num = num++;
		System.out.println("num = " + num);
	}
}