package com.ftrue.day03;

/**
 * @ClassName: IfDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 8:51
 * @Version: 1.0
 */
/*
	if语句的第三种格式
		if (条件判断表达式1) {
			语句体1;
		} else if (条件判断表达式2) {
			语句体2;
		}
		......
		else if (条件判断表达式n) {
			语句体n;
		} else {
			语句体n + 1;
		}

	执行流程:
		1.先看条件判断表达式1的结果是true还是false;
		2.如果是true,执行语句体1,if语句结束;
		  如果是false,看条件判断表达式2的结果是true还是false;
		......
		3.当所有的条件判断表达式的结果都是false时,执行else里面语句体n+1,if语句结束


	需求:判断两个整数之间的关系
		大于
		小于
		等于
*/
public class IfDemo03 {
    public static void main(String[] args) {
        //声明初始化两个整数
        int a = 5;
        int b = 4;

        //针对两个数的关系进行判断
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }
}
