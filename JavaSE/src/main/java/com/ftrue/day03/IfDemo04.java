package com.ftrue.day03;

/**
 * @ClassName: IfDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 8:51
 * @Version: 1.0
 */
/*
	x和y的关系满足如下：
		x>=3 y = 2x + 1;
		-1<x<3 y = 2x;
		x<=-1 y = 2x - 1;
	根据给定的x的值，计算出y的值并输出。

	注意事项:
		在if语句的第三种格式中,else语句可以省略不写,不建议不写,因为不写可能存在安全隐患
*/
public class IfDemo04 {
    public static void main(String[] args) {
        //声明初始化x变量
        int x = 10;
        //声明y变量
        int y;

        if (x >= 3) {
            y = 2 * x + 1;
        } else if (x > -1 && x < 3) {
            y = 2 * x;
        } else {
            y = 2 * x - 1;
        }

        System.out.println("y = " + y);
    }
}
