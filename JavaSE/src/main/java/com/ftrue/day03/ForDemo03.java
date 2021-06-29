package com.ftrue.day03;

/**
 * @ClassName: ForTest3
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 9:28
 * @Version: 1.0
 */
/*
	练习：求出1-5之间数据之和
*/
public class ForDemo03 {
    public static void main(String[] args) {
        //声明初始化求和变量
        int sum = 0;

        //进行数据的累加
		/*
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		*/
        for (int i = 1; i <= 5 ; i++ ) {
            sum += i;
        }

        //打印求和变量
        System.out.println("sum = " + sum);
    }
}
