package com.ftrue.day02;

/*
	&和&&区别
		&和&&的结果是一样的;&&具有短路效果,如果&&前面的表达式结果为false时,后面表达式不会被运行;但&的话无论前面的表达式结果是什么,后面的表达式都会执行
	|和||区别
		|和||的结果是一样的;||具有短路效果,如果||前面的表达式结果为true时,后面表达式不会被运行;但|的话无论前面的表达式结果是什么,后面的表达式都会执行
*/

public class OperatorDemo06 {
	public static void main (String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;

		System.out.println((a > b) && (a > c));//false && false
		System.out.println((a > b) && (a < c));//false && true
		System.out.println((a < b) && (a > c));//true && false
		System.out.println((a < b) && (a < c));//true && true
		System.out.println("===========================================");

		System.out.println(false && ++a > 3);

		System.out.println("a = " + a);

	}
}