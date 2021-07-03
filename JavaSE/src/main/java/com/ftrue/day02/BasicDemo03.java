package com.ftrue.day02;

/*
	基本数据类型转换的注意事项:
		1.在进行转换的时候,最后的结果数据取决于前面的数据类型
		2.基本数据类型之间转换是7种数值类型之间的转换，所以boolean类型不可以转换
		3.强制类型转换一般不推荐使用，因为有可能发生精度损失、数据溢出
		4.byte,short,char这三种数据类型在参与数学运算的时候直接发生越级提升,先转换为int类型,再参与运算
*/

public class BasicDemo03 {
	public static void main (String[] args) {
		int num01 = 'a';
		System.out.println(num01);

		char num02 = 97;
		System.out.println(num02);

		//数据溢出
		byte num03 = (byte)130;
		System.out.println(num03);

		byte b1 = 3;
		byte b2 = 4;
		//byte sum = b1 + b2;

	}
}