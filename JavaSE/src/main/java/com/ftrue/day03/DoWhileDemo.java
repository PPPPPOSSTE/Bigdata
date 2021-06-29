package com.ftrue.day03;

/**
 * @ClassName: DoWhileDemo
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 18:15
 * @Version: 1.0
 */
/*
	do...while循环语句的基本格式:
		do {
			循环体语句;
		} while (循环条件语句);

	执行流程:
		1.执行循环体语句
		2.再循环条件的结果是true还是false
		3.如果是true,继续执行第4步;
		  如果是false,do...while循环语句结束;
		4.跳回第1步,继续执行


	为了和for循环进行转换,衍生出do...while循环的扩展格式:

		初始化语句;
		do {
			循环体语句;
			迭代语句;
		} while (循环条件语句);


*/
public class DoWhileDemo {
    public static void main (String[] args) {
        for (int i = 1; i <= 10 ;i++ ) {
            System.out.println("HelloWorld");
        }

        System.out.println("========================================");

        int i = 1;
        do {
            System.out.println("HelloWorld");
            i++;
        } while (i <= 10);
    }
}
