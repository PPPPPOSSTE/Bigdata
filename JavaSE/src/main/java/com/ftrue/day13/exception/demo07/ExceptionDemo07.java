package com.ftrue.day13.exception.demo07;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName ExceptionDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 11时20分
 * @Version 1.0
 *
 * 异常和继承有内在联系(异常捕获的注意事项)
 *      程序中出现的异常存在子父类继承关系
 *          1.针对多个异常进行分别捕获,分别处理
 *          2.针对多个异常进行一次捕获,分别处理
 *              注意:需要子类异常进行先处理,父类异常进行后处理,否则编译报错
 *          3.针对多个异常进行一次捕获,一次处理
 *      异常所在的类存在子父类继承关系
 *          异常存在于父类被重写的方法中
 *              当子类重写父类含有异常的方法时,无需理会该异常信息
 *          异常存在于子类重写后的方法中
 *              异常处理方案只有唯一的一种,就是异常的捕获
 */
public class ExceptionDemo07 {
	public static void main(String[] args) {

	}

	public static void method03 (int a,int b) {
		try {
			if (a == 1) {
				throw new FileNotFoundException("自定义文件找不到异常");
			}

			if (b == 1) {
				throw new IOException("自定义IO异常");
			}
		} catch (IOException e) {

		}
	}

	public static void method02 (int a,int b) {
		try {
			if (a == 1) {
				throw new FileNotFoundException("自定义文件找不到异常");
			}

			if (b == 1) {
				throw new IOException("自定义IO异常");
			}
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public static void method01 (int a,int b) {
		if (a == 1) {
			try {
				throw new FileNotFoundException("自定义文件找不到异常");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		if (b == 1) {
			try {
				throw new IOException("自定义IO异常");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
