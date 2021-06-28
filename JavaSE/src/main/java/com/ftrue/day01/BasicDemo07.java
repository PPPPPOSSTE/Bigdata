package com.ftrue.day01;

/**
 * @ClassName: BasicDemo07
 * @Description:
 * @Author: zhangzhiqi on 2021/6/26 16:13
 * @Version: 1.0
 */
/*
	浮点类型声明初始化的注意事项
		1.在进行初始化float类型的时候,初始化值的后面需要添加字母F或者f
		2.浮点类型可以理解为小数，但并不是真正意义上的小数，底层数据结构不是以十进制为标准，而是一套`IEEE二进制浮点数算术标准（IEEE 754）
			浮点类型在参与数学运算的时候可能损失数据,做精确数学运算问题上不能使用浮点数

	布尔类型声明初始化的注意事项
*/
public class BasicDemo07 {
    public static void main(String[] args) {
        System.out.println(2.0 - 1.1);
    }
}
