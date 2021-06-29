package com.ftrue.day03;

/**
 * @ClassName: IfDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 8:51
 * @Version: 1.0
 */
/*
	if语句的第一种格式:
		if (条件判断表达式) {
			语句体;
		}

	执行流程:
		1.先看条件判断表达式的结果是true还是false
		2.如果是true,执行语句体,if语句结束;
		  如果是false,if语句结束;

	需求:判断一个整数是否为偶数
*/
public class IfDemo01 {
    public static void main(String[] args) {
        //声明初始化一个整数
        int num = 11;

        //判断该数是否为偶数
        if (num % 2 == 0) {
            System.out.println(num + "是一个偶数");
        }
    }
}
