package com.ftrue.day04;

/*
	void关键字:
		表示方法没有返回值


	void关键字的注意事项:
		1.当方法没有返回值的时候,返回值类型的位置不能空着,需要用void关键字进行占位
		2.当方法返回值类型是void时,只能使用单独调用
		  当方法返回值类型不是void时,推荐使用赋值调用
		3.当方法返回值类型是void时,最后的return语句可以省略不写
*/

public class MethodDemo05 {
	public static void main (String[] args) {
		print(10);
	}

	/*
		两个明确:
			返回值类型:void
			形参列表:int num
	*/
	public static void print (int num) {
		for (int i = 1; i <= num ; i++) {
			System.out.println("HelloWorld");
		}

		//return;
	}
}



