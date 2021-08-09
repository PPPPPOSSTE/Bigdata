package com.ftrue.day13.date;

import java.util.Date;

/**
 * @ClassName DateDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月13日 14时41分
 * @Version 1.0
 *
 * 日期时间类:
 *      第一代:Date,DateFormat,SimpleDateFormat(JDK1.0)
 *      第二代:Calendar(JDK1.1)
 *      第三代:LocalDate、LocalTime、LocalDateTime,DateTimeFormatter(JDK8.0)
 *
 *
 * Date类:
 *      类的特点
 *          类 Date 表示特定的瞬间，精确到毫秒
 *      类的位置
 *          java.util
 *      类的构造器
 *          public Date()
 *              分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
 *          public Date(long date)
 *              分配 Date 对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数。
 *      类的方法
 *          public long getTime()
 *              返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
 */
public class DateDemo01 {
	public static void main(String[] args) {
		//创建Date对象
		Date date1 = new Date();
		System.out.println(date1);

		Date date2 = new Date(0L);
		System.out.println(date2);

		System.out.println(date1.getTime());
	}
}
