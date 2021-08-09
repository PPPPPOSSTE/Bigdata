package com.ftrue.day13.exception.demo03;

import java.io.FileInputStream;

/**
 * @ClassName ExceptionDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 09时16分
 * @Version 1.0
 *
 * 异常的分类
 *      编译时异常
 *          代码没有语法格式错误,异常发生在编译时期,导致编译报错
 *      运行时异常
 *          代码没有语法格式错误,异常发生在运行时期,导致程序终止
 *
 *
 * 异常处理:
 *      编译时异常:
 *          程序员必须手动解决
 *          解决方案:
 *              异常声明
 *              异常捕获
 *      运行时异常:
 *          程序员可以手动解决,也可以交给JVM进行解决
 *          解决方案:
 *              手动解决(异常声明或者异常捕获)
 *              JVM解决(1.调用printStackTrace() 2.结束JVM)
 */
public class ExceptionDemo03 {
	public static void main(String[] args) {
		System.out.println(1/0);
	}
}
