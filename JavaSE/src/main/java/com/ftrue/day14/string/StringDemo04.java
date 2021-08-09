package com.ftrue.day14.string;

import java.util.Arrays;

/**
 * @ClassName StringDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月14日 14时01分
 * @Version 1.0
 *
 * String类的常用方法:转换
 *      public char[] toCharArray ()
 *          将此字符串转换为新的字符数组。
 *      public byte[] getBytes ()
 *          使用平台的默认字符集将该 String编码转换为新的字节数组。
 *      public String replace (CharSequence target, CharSequence replacement)
 *          将与target匹配的字符串使用replacement字符串替换。
 */
public class StringDemo04 {
	public static void main(String[] args) {
		String str = "abc";
		//将字符串转换为字符数组
		System.out.println(Arrays.toString(str.toCharArray()));

		//将字符串根据字符编码转换成字节数组
		System.out.println(Arrays.toString("尚硅谷".getBytes()));
		System.out.println(Arrays.toString(str.getBytes()));


		//将指定的字符串替换成新字符串
		String newStr = str.replace("a", "atguigu");
		System.out.println("newStr = " + newStr);

	}
}
