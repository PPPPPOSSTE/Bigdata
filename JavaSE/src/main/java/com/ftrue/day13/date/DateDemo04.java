package com.ftrue.day13.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName DateDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 16时11分
 * @Version 1.0
 *
 * LocalDateTime类格式化和解析
 *
 * DateTimeFormatter类
 *      类的特点
 *          针对第三代日期时间进行格式化和解析的工具类
 *      类的位置
 *          java.time.format
 *      类的构造器
 *          构造器私有化
 *      类的方法
 *          public static DateTimeFormatter ofPattern(String pattern)
 *              创建一个格式化程序使用指定的模式。
 *          public String format(TemporalAccessor temporal)
 *              使用此格式化程序格式的日期时间对象。
 *
 *
 * LocalDateTime类格式化(LocalDateTime对象==>文本)
 *      1.获取LocalDateTime对象
 *      2.获取DateTimeFormatter格式化解析工具类对象
 *      3.针对LocalDateTime对象进行格式化
 *
 * LocalDateTime类解析(文本==>LocalDateTime对象)
 *      1.创建本地日期时间文本
 *      2.获取DateTimeFormatter格式化解析工具类对象
 *      3.针对文本进行解析操作
 */
public class DateDemo04 {
	public static void main(String[] args) {
		//format();
		parse();
	}

	public static void parse() {
		//1.创建本地日期时间文本
		String str = "2021年07月13日 16时30分45秒173毫秒";

		//2.获取DateTimeFormatter格式化解析工具类对象
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");

		//3.针对文本进行解析操作
		LocalDateTime parse = LocalDateTime.parse(str, dtf);

		System.out.println("parse = " + parse);
	}

	public static void format() {
		//1.获取LocalDateTime对象
		LocalDateTime ldt = LocalDateTime.now();

		//2.获取DateTimeFormatter格式化解析工具类对象
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

		//3.针对LocalDateTime对象进行格式化
		String format = dtf.format(ldt);

		System.out.println("format = " + format);
	}
}
