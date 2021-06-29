package com.ftrue.day03;

/**
 * @ClassName: BasicDemo
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 8:48
 * @Version: 1.0
 */
/*
	三种循环的区别:
		for循环和while,do...while扩展格式的区别(了解)
			循环变量的生命周期:
				for循环的循环变量只在for循环中有效
				while循环和do...while循环的循环变量在方法中有效
			循环次数:
				for循环和while循环的循环体语句至少执行0次
				do...while循环的循环体语句至少执行1次
		for循环和while,do...while标准格式的区别(重点)
			在实际应用中不会选择do...while循环
			有明显循环次数(范围),选择for循环
			没有明显循环次数(范围),选择while循环
*/
public class BasicDemo02 {
    public static void main (String[] args) {
        for (int i = 1; i <= 10 ;i++ ) {
            System.out.println("HelloWorld");
        }

        System.out.println("=======================");

        int i = 1;
        while (i <= 10) {
            System.out.println("HelloWorld");
            i++;
        }

        System.out.println("=======================");

        int j = 1;
        do {
            System.out.println("HelloWorld");
            j++;
        } while (j <= 10);
    }
}
