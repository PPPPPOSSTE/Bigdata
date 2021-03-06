package com.ftrue.day05;

/**
 * @ClassName ArrayDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月02日 11时33分
 * @Version 1.0
 *
 * 数组:
 *      存储同一种数据类型多个元素的固定容器
 *
 * 数组的特点:
 *      1.数组的大小(长度)是固定不变的
 *      2.存储的元素必须在内存中是同一种数据类型
 *      3.数组的元素需要是多个(在程序可以声明初始化长度为0或者1的数组,但是这样的数字没有任何意义)
 *
 * 数组的声明
 *      数据类型[] 数组名;(推荐)
 *          例如:int[] arr
 *          描述:声明存储int类型元素的数组,数组名为arr
 *      数据类型 数组名[];
 *          例如: int arr[]
 *          描述:声明存储int类型元素的变量,数组名为arr[]
 *
 *      数据类型:数组中存储元素的数据类型
 *      []:数组
 *      数据类型[]:数组的数据类型
 *      数组名:数组的名字
 *
 * 数组的初始化:
 *      动态初始化:只初始化数组的长度,不初始化具体的元素数据,JVM直接通过初始化长度获取数组的长度
 *      静态初始化:不初始化数组的长度,初始化具体的元素数据,JVM可以通过元素的个数间接获取数组的长度
 *
 *      格式:
 *          动态初始化:
 *              数据类型[] 数组名 = new 数据类型[数组长度];
 *          静态初始化(标准版)
 *              数据类型[] 数组名 = new 数据类型[]{元素1,元素2,......,元素n};
 *          静态初始化(简化版)
 *              数据类型[] 数组名 = {元素1,元素2,......,元素n};
 *
 *          new:向内存申请开辟数组的空间
 *
 * 数组初始化的注意事项:
 *      1.数组的初始化不可以通过动静结合的方式进行初始化
 *          例如:int[] arr = new int[3]{11,22,33};
 *      2.静态初始化(简化版)不可以先定义后初始化
 *          变量的初始化时取决于前面的数据类型,如果数组先定义后初始化,需要根据数据类型进行内存空间的开辟,
 *          动态初始化和静态初始化(标准版)的先定义后初始化new后面直接跟着数据类型,静态初始化(简化版)没有
 *          具体的数据类型,编译报错
 */
public class ArrayDemo01 {
	public static void main(String[] args) {
		//动态初始化
		int[] arr01 = new int[3];
		arr01 = new int[5];

		//静态初始化(标准版)
		int[] arr02 = new int[]{11,22,33};
		arr02 = new int[]{11,22,33,44,55};

		//静态初始化(简化版)
		int[] arr03 = {11,22,33};
		//arr03 = {11,22,33,44,55};
	}
}
