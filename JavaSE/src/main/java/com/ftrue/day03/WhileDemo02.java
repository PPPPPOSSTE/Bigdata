package com.ftrue.day03;

/**
 * @ClassName: WhileTest01
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 9:31
 * @Version: 1.0
 */
/*
 	练习：趣味折纸

 	题目：
 		世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米。请问，折叠多少次，不低于珠穆朗玛峰的高度?

	分析:
		1.声明初始化相关遍历,并统一单位
			珠峰	88488600
			纸厚	1
			计数器	0

		2.不知道循环多少次,纸的厚度不低于珠穆朗玛峰的高度
			建议使用while循环

		3.while循环所需的循环条件语句
			纸厚 < 珠峰
		  循环体语句:
			计数器++;
			纸折叠一次,纸厚 *= 2

		4.打印输出计数器变量
*/
public class WhileDemo02 {
    public static void main(String[] args) {
        //1.声明初始化相关遍历,并统一单位
        int zhi = 1;
        int zf = 88488600;
        int count = 0;

        //2.不知道循环多少次,纸的厚度不低于珠穆朗玛峰的高度,建议使用while循环
        //3.while循环所需的循环条件语句
        while (zhi < zf) {
			/*
			循环体语句:
			计数器++;
			纸折叠一次,纸厚 *= 2
			*/
            //计数器++;
            count++;
            //纸折叠一次,纸厚 *= 2
            zhi *= 2;
        }


        //4.打印输出计数器变量
        System.out.println("count = " + count);
    }
}
