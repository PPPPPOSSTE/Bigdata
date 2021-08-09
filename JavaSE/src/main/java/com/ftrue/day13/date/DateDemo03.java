package com.ftrue.day13.date;

import java.time.LocalDateTime;

/**
 * @ClassName DateDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 16时00分
 * @Version 1.0
 *
 * LocalDateTime类
 *      类的特点
 *          针对本地日期时间进行操作的工具类
 *      类的位置
 *          java.time
 *      类的构造器
 *          构造器私有化
 *      类的方法
 *          public static LocalDateTime now()
 *              从默认时区中的系统时钟中获取当前日期时间。
 *          public static LocalDateTime parse(CharSequence text,DateTimeFormatter formatter)
 *              获得 LocalDateTime实例从一个文本字符串
 *          public int getYear()
 *              获取年度字段。
 *          public int getMonthValue()
 *              从1到12得到一个月的时间字段。
 *          public int getDayOfMonth()
 *              获取月字段的一天。 \
 *          public int getHour()
 *              获取天字段的时间。
 *          .......
 */
public class DateDemo03 {
	public static void main(String[] args) {
		//获取第三代本地日期时间类对象
		LocalDateTime ldt = LocalDateTime.now();

		System.out.println(ldt);

		//按照固定的格式进行字符串拼接
		System.out.println(ldt.getYear() + ":" + ldt.getMonthValue() + ":" + ldt.getDayOfMonth());
	}
}
