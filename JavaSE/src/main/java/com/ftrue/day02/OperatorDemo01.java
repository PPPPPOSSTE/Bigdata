package com.ftrue.day02;

/*
	运算符:
		在程序中进行连接常量或者变量的符号

	表达式:
		在程序中用运算符连接起来的式子

	例如:a + b

	分类:
		算术运算符
		赋值运算符
		关系运算符
		逻辑运算符
		三元运算符
		位运算符

	算术运算符:
		+ - * / % ++ --

	被除数 / 除数 = 商 ...... 余数

	/ 和 % 区别:
		/ : 两个数相除的商
		% : 两个数相除的余数

	取余
		3 / 4 = 0 ...... 3
	取模
		3 / 4 = 1 ...... -1
		......

	+号的多种用法:
		加法运算
		字符串连接符
			当+的两边有任意一边存在字符串的时候,+号不在是加法运算符了,变成字符串连接符

	++和--(自增和自减)
		++:在自身变量的基础上进行+1运算,将结果重新赋值给自己
		--:在自身变量的基础上进行-1运算,将结果重新赋值给自己

	格式:
		++变量名, 变量名++;

	使用分类:
		单独使用(实际)
			无论++在前还是++在后,运算的结果都是一样的
		复合使用(笔试)
			如果++在前,先自增,后运算
			如果++在后,先运算,后自增
*/

public class OperatorDemo01 {
	public static void main (String[] args) {
		int a = 3;
		int b = 4;

		System.out.println(a + b);//7
		System.out.println(a - b);//-1
		System.out.println(a * b);//12
		System.out.println(a / b);//0
		System.out.println(a % b);//3

		System.out.println("==================================");

		String s1 = "Hello";
		String s2 = "World";
		System.out.println(s1 + s2);

		System.out.println("Hello" + 5 + 20);//Hello520
		System.out.println(5 + 20 + "Hello");//25Hello

		System.out.println('a' + 1);//98
		System.out.println("a" + 1);//a1
		System.out.println("" + 'a' + 1);//a1

		System.out.println("==================================");

		//a = 3;

		//单独使用
		//System.out.println("a = " + a);
		//++a;
		//a++;
		//System.out.println("a = " + a);

		//复合使用
		a = 3;
		System.out.println("a = " + a);

		//b = ++a;
		b = a++;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("==================================");

		int x = 3;
		//int y = x++ + ++x;
		//	    = 3(x=4) + 5(x=5)
		int y = ++x + x++;
		//	  = 4(x=4) + 4(x=5)

		System.out.println("x = " + x);
		System.out.println("y = " + y);

		System.out.println("==================================");

		//思考题,下午告诉你们答案
		int i = 3;
		i = i++;
		System.out.println("i = " + i);
	}
}