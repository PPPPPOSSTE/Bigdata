package com.ftrue.day03;

/**
 * @ClassName: ForTest4
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 9:28
 * @Version: 1.0
 */
/*
	练习：求出1-100之间偶数和

	for的练习题:
		for语句中添加条件语句
			1.遍历这个范围所有的数据
			2.针对每个数据根据题意进行数据的筛选
			3.针对筛选后的数据进行操作
		for语句中添加循环语句
			一种一种可能性进行遍历尝试
*/
public class ForDemo04 {
    public static void main(String[] args) {
        //声明并初始化求和变量
        int sum = 0;

        //遍历1-100之间所有的数据
        for (int i = 1; i <= 100 ;i++ ) {
            //判断每个数是否为偶数
            if (i % 2 == 0) {
                //针对每个偶数进行求和运算
                sum += i;
            }
        }

        //打印求和变量
        System.out.println("sum = " + sum);

        System.out.println("================================");

        sum = 0;

        for (int i = 2 ; i <= 100 ; i+=2 ) {
            sum += i;
        }

        //打印求和变量
        System.out.println("sum = " + sum);
    }
}
