package com.ftrue.day13test.system;

/**
 * @ClassName: SystemDemo
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 21:19
 * @Version: 1.0
 */
/*
 *
 * System类
 *      类的特点
 *          System 类包含一些通用的类字段和方法
 *      类的位置
 *          java.lang
 *      类的构造器
 *          构造器私有化,无法在外界实例化对象
 *      类的方法
 *          public static void gc()
 *              运行垃圾回收器。
 *          public static long currentTimeMillis()
 *              返回以毫秒为单位的当前时间。
 *          public static long nanoTime()
 *              返回最准确的可用系统计时器的当前值，以毫微秒为单位
 *          public static void setOut(PrintStream out)
 *              重新分配“标准”输出流。
 * */
public class SystemDemo {
    public static void main(String[] args) {
        //获取当前时间毫秒值
        System.out.println(System.currentTimeMillis());

        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
        }
        long end = System.nanoTime();
        System.out.println("共耗时毫秒： " + (end - start));

        /*long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("共耗时毫秒： " + (end - start));*/
    }
}
