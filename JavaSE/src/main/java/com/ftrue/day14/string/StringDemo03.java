package com.ftrue.day14.string;

/**
 * @ClassName StringDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月14日 11时28分
 * @Version 1.0
 *
 * String类的常用方法:获取
 *      public int length ()
 *          返回此字符串的长度。
 *      public String concat (String str)
 *          将指定的字符串连接到该字符串的末尾。
 *      public char charAt (int index)
 *          返回指定索引处的 char值。
 *      public int indexOf (String str)
 *          返回指定子字符串第一次出现在该字符串内的索引。
 *      public int lastIndexOf(String str)
 *          返回指定子字符串在此字符串中最右边出现处的索引。
 *      public String substring (int beginIndex)
 *          返回一个子字符串，从beginIndex开始截取字符串到字符串结尾。
 *      public String substring (int beginIndex, int endIndex)
 *          返回一个子字符串，从beginIndex到endIndex截取字符串。
 *          含beginIndex，不含endIndex。
 */
public class StringDemo03 {
	public static void main(String[] args) {
		//先声明字符串对象
		String str = "abcdefg";

		//获取字符串的长度
		System.out.println(str.length());
		System.out.println("==========================");

		//在字符串的结尾拼接指定的字符串
		String atguigu = str.concat("atguigu");
		System.out.println(atguigu);
		System.out.println("==========================");

		//获取字符串指定索引位置上的字符
		char charAt = str.charAt(0);
		System.out.println("charAt = " + charAt);
		System.out.println("==========================");

		//获取字符串中指定字符串的索引
		int index = str.indexOf("atguigu");
		System.out.println("index = " + index);
		index = str.indexOf("def");
		System.out.println("index = " + index);
		System.out.println("==========================");

		//获取字符串中指定字符串出现的最后一次索引
		int lastIndex = "abccbaabccbaabccbaabccbaabccba".lastIndexOf("a");
		System.out.println("lastIndex = " + lastIndex);
		System.out.println("==========================");

		//获取按照指定规则截取子字符串
		System.out.println(str.substring(3));
		System.out.println("==========================");

		//获取按照指定规范截取子字符串
		System.out.println(str.substring(3,6));
	}
}
