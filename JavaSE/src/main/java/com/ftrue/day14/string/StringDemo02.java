package com.ftrue.day14.string;

/**
 * @ClassName StringDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月14日 11时13分
 * @Version 1.0
 *
 * String字符串的常用方法:判断
 *      public boolean equals (Object anObject)
 *          将此字符串与指定对象进行比较。
 *      public boolean equalsIgnoreCase (String anotherString)
 *          将此字符串与指定对象进行比较，忽略大小写。
 *      public boolean contains(CharSequence s)
 *          当且仅当此字符串包含指定的 char 值序列时，返回 true。
 *      public boolean endsWith(String suffix)
 *          测试此字符串是否以指定的后缀结束。
 *      public boolean isEmpty()
 *          当且仅当 length() 为 0 时返回 true。
 *      public boolean startsWith(String prefix)
 *          测试此字符串是否以指定的前缀开始。
 *      public boolean startsWith(String prefix,int toffset)
 *          测试此字符串从指定索引开始的子字符串是否以指定前缀开始。
 */
public class StringDemo02 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = new String("Abc");
		String str4 = new String("cba");
		String str = "abcdefg";

		//判断两个字符串内容是否相等,且区分大小写
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println("============================");

		//判断两个字符串内容是否相等,且不区分大小写
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str1.equalsIgnoreCase(str4));
		System.out.println("============================");

		//判断字符串是否包含指定的子字符串
		System.out.println(str.contains("abc"));
		System.out.println(str.contains("atguigu"));
		System.out.println("============================");

		//判断字符串是否以指定的子字符串作为结尾
		System.out.println(str.endsWith("defg"));
		System.out.println(str.endsWith(".java"));
		System.out.println("============================");

		//判断字符串的长度是否为0
		System.out.println("".isEmpty());
		System.out.println(str.isEmpty());
		System.out.println("============================");

		//判断字符串是否以子字符串作为开头
		System.out.println(str.startsWith("abc"));
		System.out.println(str.startsWith("atguigu"));
		System.out.println("============================");

		//判断指定范围的字符串是否以子字符串作为开头
		System.out.println(str.startsWith("def",3));
		System.out.println(str.startsWith("atguigu",3));
	}
}
