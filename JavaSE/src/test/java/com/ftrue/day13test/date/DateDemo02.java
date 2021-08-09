package com.ftrue.day13test.date;

import jdk.nashorn.internal.ir.CallNode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: DateDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 23:22
 * @Version: 1.0
 */
/*
 *
 * 日期时间类：
 *     第一代：Date  DateFormat  SimpleDateFormat (JDK1.0)
 *     第二代：Calendar (JDK1.1)
 *     第三代：LocalDate  LocalTime  LocalDateTime  DateTimeFormatter
 *
 * Date类：
 *    类的特点
 *        类 Date 表示特定的瞬间，精确到毫秒
 *    类的位置
 *        java.util
 *    类的构造器
 *        public Date();
 *        public Date(long date);
 *    类的方法
 *        public long getTime();
 *
 * Date类的格式化和解析
 *     Date对象 ==》文本（格式化）
 *     文本 ==》Date对象（解析）
 *
 * DateFormat类
 *    类的特点
 *        DateFormat类 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化和解析日期/时间
 *    类的位置
 *        java.text
 *    类的构造器
 *        该类为抽象类，无法实例化对象
 *    类的方法
 *
 * SimpleDateFormat类
 *     类的特点
 *        SimpleDateFormat类 是一个与语言环境有关的方式来格式化和解析日期/时间的具体类
 *     类的位置
 *        java.text
 *     类的构造器
 *     类的方法
 *         继承父类的方法
 *
 *
 * */
public class DateDemo02 {
    public static void main(String[] args) throws ParseException {
        //格式化
        format();
        //解析
        parse();
    }

    public static void parse() throws ParseException {
        //创建日期时间的文本
        String str = "2021年07月13日 15时40分49秒553毫秒";

        //2.创建日期格式化解析的工具类对象SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");

        //3.针对给定的文本进行解析
        Date parse = sdf.parse(str);


        //不会出错，自动给时分秒等赋0值；和LocalDateTime等第三代时间日期类解析时略有区别
        /*//创建日期时间的文本
        String str = "2021年07月13日";

        //2.创建日期格式化解析的工具类对象SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        //3.针对给定的文本进行解析
        Date parse = sdf.parse(str);*/

        System.out.println(parse);
    }

    public static void format() {
        //1.创建Date对象
        Date date = new Date();

        //2.创建日期格式化解析的工具类对象SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");

        //3.针对给定的Date对象进行格式化
        String format = sdf.format(date);

        System.out.println(format);
    }
}























