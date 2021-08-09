package com.ftrue.day13test.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @ClassName: DateDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 23:22
 * @Version: 1.0
 */
/*
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
 *
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
 *

 * */
public class DateDemo03 {
    public static void main(String[] args) throws ParseException {
        //获取第三代本地日期时间类对象
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt);

        //按照固定的格式进行字符串拼接
        System.out.println(ldt.getYear() + ":" + ldt.getMonthValue() + ":" + ldt.getDayOfMonth());
    }
}























