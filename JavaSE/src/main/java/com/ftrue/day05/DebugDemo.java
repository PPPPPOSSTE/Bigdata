package com.ftrue.day05;

/**
 * @ClassName DebugDemo
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月02日 10时48分
 * @Version 1.0
 *
 * 常见的错误:
 *      1.语法格式错误
 *          学习idea,可以自动提醒(红色波浪线)
 *      2.代码逻辑错误
 *          可以通过idea中的debug
 *
 *
 * debug断点调试:
 *      就是将可能出现错误的代码片段将执行动作慢下来,通过手动的方式一步一步执行,从而找到错误
 *
 * 断点调试的步骤:
 *      1.先确定代码的逻辑错误到底发生在哪里,从可能出现错误的代码片段的第一行的行号后面,添加断点
 *      2.通过鼠标右键,选择debug运行
 *      3.开始通过手动执行的方式,开始点击"下一步",开始调试
 *          蓝色折弯的向下箭头:不进入方法的下一步  f8
 *          蓝色笔直的向下箭头:进入自定义方法,不进入源码的方法的下一步  f7
 *          红色笔直的向下箭头:进入自定义方法和源码方法的下一步  alt+shift+f7
 *          蓝色笔直的向上箭头:跳出方法的下一步  shift+f8
 *          右斜向下的箭头：执行到光标所在处  alt+f9
 *      4.结束断点调试
 *          红色小方块:结束断点调试功能  ctrl+f2
 *
 */
public class DebugDemo {
	public static void main(String[] args) {

		System.out.println("开始");

		method();


		System.out.println("结束");
	}

	public static void method() {
		for (int i = 1; i <= 10; i++) {
			if (i == 3) {
				continue;
			}

			System.out.println(i);
		}
	}
}
