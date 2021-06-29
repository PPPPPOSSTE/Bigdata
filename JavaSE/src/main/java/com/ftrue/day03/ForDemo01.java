package com.ftrue.day03;

/**
 * @ClassName: ForDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 11:21
 * @Version: 1.0
 */
/*
	for语句的基本格式:
		for (初始化语句;循环条件语句;迭代语句) {
			循环体语句
		}

		初始化语句:需要声明并初始化循环变量,循环变量负责记录循环次数
		循环条件语句:循环的条件语句,进行判断是否执行循环体语句
		迭代语句:在循环过程中的收尾工作
		循环体语句:重复执行多次的代码

	执行流程:
		1.先执行初始化语句;
		2.看循环条件语句的结果是true还是false;
		3.如果是true,执行循环体语句,继续执行第4步;
		  如果是false,for循环语句结束;
		4.执行迭代语句
		5.跳回第2步,继续执行

	需求:打印10遍HelloWorld
*/
public class ForDemo01 {
    public static void main(String[] args) {
        //用原始方案:
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");

        System.out.println("=======================================");

        //用for循环语句简化上述过程
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("HelloWorld");
        }
    }
}
