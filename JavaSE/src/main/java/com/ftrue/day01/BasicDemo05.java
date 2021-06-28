package com.ftrue.day01;

/**
 * @ClassName: BasicDemo05
 * @Description:
 * @Author: zhangzhiqi on 2021/6/26 15:37
 * @Version: 1.0
 */
/*
	整数类型变量声明初始化的注意事项:
		1.声明初始化long类型变量的时候,初始化值后面需要添加字母L或者l,推荐使用L
		2.声明初始化byte,short类型变量的时候,初始化的数据值只要在对应数据类型的范围内部,JVM中的一块内存会将数据直接由int优化为对应数据类型(后面会详细讲解)
		3.声明初始化整数类型变量的时候,初始化值有四种表示方式,无论哪种表示方式最终都以默认的形式进行输出
			十进制(默认)
			二进制
				以0b或0B作为开头
			八进制
				以0作为开头
			十六进制
				以0x或0X作为开头,10~15分别用A~F进行表示
*/
public class BasicDemo05 {
    public static void main(String[] args) {

        byte num01 = 123;

        int num02 = 10;
        System.out.println(num02);
        int num03 = 0b10;
        System.out.println(num03);
        int num04 = 010;
        System.out.println(num04);
        int num05 = 0x10;
        System.out.println(num05);

    }
}
