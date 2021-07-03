package com.ftrue.day04;

/*
	控制语句:
		break
		continue
		return(暂时不讲)

	break关键字
		应用场景:
			switch语句中
			循环语句中
		含义:
			在switch语句中,终止switch语句
			在循环语句中,终止循环语句

	continue关键字
		应用场景:
			循环语句中
		含义:
			终止本次循环,进入下一次循环


	注意事项:
		在同一作用域内,break关键字或者continue关键字的后面不可以直接有语句,否则永远执行不到,导致编译报错
*/

public class BasicDemo02 {
	public static void main (String[] args) {
		for (int i = 1; i <= 10 ;i++ ) {
			if (i == 3) {
				continue;
				// System.out.println("HelloWorld");
			}

			System.out.println(i);
		}
	}
}