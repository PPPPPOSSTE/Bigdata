package com.ftrue.day03;

/**
 * @ClassName: WhileDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 14:58
 * @Version: 1.0
 */
/*
	while循环的基本格式:
		while (循环条件语句) {
			循环体语句;
		}

	执行流程:
		1.先看循环条件语句的结果是true还是false
		2.如果是true,执行循环体语句,继续执行第3步;
		  如果是false,while循环语句结束;
		3.跳回第1步,继续执行

	暂时并没有while循环的应用场景
		特点:遍历没有明显循环次数的场景

	为了和for循环之间做转换,衍生出while循环的扩展格式
		初始化语句;
		while (循环条件语句) {
			循环体语句;
			迭代语句;
		}

*/
public class WhileDemo01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ;i++ ) {
            System.out.println("HelloWorld");
        }

        System.out.println("================================");

        int i = 1;
        while (i <= 10) {
            System.out.println("HelloWorld");
            i++;
        }
    }
}
