package com.ftrue.day13.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 15时16分
 * @Version 1.0
 *
 * Date类的格式化和解析
 *      Date对象 ==> 文本 (格式化)
 *      文本 ==> Date对象 (解析)
 *
 * DateFormat类
 *      类的特点
 *          DateFormat 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。
 *      类的位置
 *          java.text
 *      类的构造器
 *          该类为抽象类,无法实例化对象
 *      类的方法
 *          public final String format(Date date)
 *              将一个 Date 格式化为日期/时间字符串。
 *          public Date parse(String source)
 *              从给定字符串的开始解析文本，以生成一个日期。
 *
 * SimpleDateFormat类
 *      类的特点
 *          SimpleDateFormat 是一个以与语言环境有关的方式来格式化和解析日期的具体类。
 *      类的位置
 *          java.text
 *      类的构造器
 *          public SimpleDateFormat(String pattern)
 *              用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
 *      类的方法
 *          继承父类的方法
 *
 * Date对象进行格式化(Date对象==>文本)
 *      1.创建Date对象
 *      2.创建日期格式化解析的工具类对象SimpleDateFormat
 *      3.针对给定的Date对象进行格式化
 *
 * Date对象进行解析(文本==>Date对象)
 *      1.创建日期时间的文本
 *      2.创建日期格式化解析的工具类对象SimpleDateFormat
 *      3.针对给定的文本进行解析
 */
public class DateDemo02 {
	public static void main(String[] args) throws ParseException {
		//格式化
		format();
		//解析
		parse();
	}

	public static void parse() throws ParseException {
		//1.创建日期时间的文本
		String str = "2021年07月13日 15时32分35秒639毫秒";

		//2.创建日期格式化解析的工具类对象SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");

		//3.针对给定的文本进行解析
		Date parse = sdf.parse(str);

		System.out.println(parse);
	}

	public static void format() {
		//1.创建Date对象
		Date date = new Date();

		//2.创建日期格式化解析的工具类对象SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");

		//3.针对给定的Date对象进行格式化
		String format = sdf.format(date);


		System.out.println("format = " + format);
	}
}
