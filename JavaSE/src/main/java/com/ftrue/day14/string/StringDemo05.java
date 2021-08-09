package com.ftrue.day14.string;

import java.util.Arrays;

/**
 * @ClassName StringDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月14日 14时08分
 * @Version 1.0
 *
 * String类的常用方法:分割
 *      public String[] split(String regex)
 *          根据给定正则表达式的匹配拆分此字符串。
 *
 *
 * 注意事项:
 *      1.根据"规则"进行分割字符串,最后结果不包含这个"规则"
 *      2.根据"规则"进行分割字符串,如果这个规则在字符串最前面或者中间连续两个规则,会直接分割一个长度为0的字符串
 *      3.根据"规则"进行分割字符串,如果这个规则在字符串的最后面,则不进行分割
 *
 * 正则表达式:
 *      针对已有的字符串按照某种规则进行检测,从而减少服务器的压力(从服务端提前到前端)
 *
 * 常用的正则表达式
 *      . 任何字符（与行结束符可能匹配也可能不匹配）
 *      \d 数字：[0-9]
 *      \D 非数字： [^0-9]
 *      \w 单词字符：[a-zA-Z_0-9]
 *      \W 非单词字符：[^\w]
 */
public class StringDemo05 {
	public static void main(String[] args) {
		String str = "abc@def@gh@i";

		//根据"@"进行分割字符串
		String[] arr01 = str.split("@");
		System.out.println(Arrays.toString(arr01));

		//根据"@"进行分割字符串
		str = "abc@def@@gh@i";
		String[] arr02 = str.split("@");
		System.out.println(Arrays.toString(arr02));

		//根据"@"进行分割字符串
		str = "@abc@def@gh@i@";
		String[] arr03 = str.split("@");
		System.out.println(Arrays.toString(arr03));

		System.out.println("======================================");

		//根据"数字"进行分割字符串
		str = "abc2def9gh5i";

		String[] arr04 = str.split("\\d");
		System.out.println(Arrays.toString(arr04));

		/*
			1.统计字符串中的数字有多少个
			2.创建一个比数字个数+1的长度数字
			3.遍历字符串
				如果没有遇到数字往指定索引位置进行字符串拼接
				如果遇到数字,索引位置+1
			4.打印数组
		*/

	}
}
