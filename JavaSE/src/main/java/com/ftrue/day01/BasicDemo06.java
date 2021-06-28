package com.ftrue.day01;

/**
 * @ClassName: BasicDemo6
 * @Description:
 * @Author: zhangzhiqi on 2021/6/26 15:41
 * @Version: 1.0
 */
/*
	字符类型声明初始化的注意事项
		1.字符类型在声明初始化的时候也有四种方式,无论哪种一种方式都以默认方式进行输出
			(1)用''进行表示,有且仅有一个字符(默认)
			(2)可以用0~65535之间的数字
				数字0	48
				字母A	65
				字母a	97
			(3)可以用'\ uXXXX',XXXX是0~65535内所对应的十六进制,不足四位,前面进行补0
			(4)转义字符

		2.转义字符在JavaSE阶段可以使用,后期到IO流部分,尽量不要使用转义字符
*/
public class BasicDemo06 {
    public static void main(String[] args) {
        char c1 = 'a';
        System.out.println(c1);
        char c2 = 97;
        System.out.println(c2);
        char c3 = '\u0061';
        System.out.println(c3);
        char c4 = '\t';
        System.out.println(c4);

    }
}
