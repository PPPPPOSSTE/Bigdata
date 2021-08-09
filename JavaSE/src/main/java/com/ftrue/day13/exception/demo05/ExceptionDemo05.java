package com.ftrue.day13.exception.demo05;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName ExceptionDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 10时13分
 * @Version 1.0
 *
 * 异常和继承有内在联系
 *      程序中出现的异常存在子父类继承关系
 *          1.在进行异常声明的时候,多个异常类的前后顺序可以随意颠倒
 *          2.在进行异常声明的时候,可以将多个异常类进行省略,直接声明父类异常即可
 *              备注:今后方法声明的时候,可能声明10个异常,且10个异常类没有互相继承关系,当声明的异常类超过5个以上时候,建议直接声明Exception
 *      异常所在的类存在子父类继承关系
 *          异常存在于父类被重写的方法中
 *              当子类重写父类含有异常的方法时,无需理会该异常信息
 *          异常存在于子类重写后的方法中
 *              异常处理方案只有唯一的一种,就是异常的捕获
 */
public class ExceptionDemo05 {
	public static void main(String[] args) throws IOException {
		method(1,2);
	}

	public static void method (int a,int b) throws IOException {
		if (a == 1) {
			throw new FileNotFoundException("自定义文件找不到异常");
		}

		if (b == 2) {
			throw new IOException("自定义IO异常");
		}
	}
}
