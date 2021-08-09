package com.ftrue.day18io.system;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @ClassName: Demo02System
 * @Description:
 * @Author: zhiqi zhang on 2021/7/20 16:23
 * @Version: 1.0
 */
/**
 *
 * 标准流:
 *      标准输入流:System.in
 *      标准输出流:System.out
 *
 * 标准输入流:System.in
 *      第二种键盘录入方式
 *
 * ========================================
 * Demo02
 *
 * 标准输出流System.out
 *
 * PrintStream类
 *      类的特点
 *          PrintStream 为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式
 *      类的位置
 *          java.io
 *      类的构造器
 *          public PrintStream(String fileName)
 *              创建具有指定文件名称且不带自动行刷新的新打印流。
 *      类的方法
 *
 */
//了解即可
public class Demo02System {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(System.out);  //java.io.PrintStream
        System.out.println("hello");

        //需求：有些内容如果想快速打印到文本文件中，可以选择打印流
        //创建打印流对象
        PrintStream ps = new PrintStream("print.txt");

        //需要将System中的打印流替换成自定义的打印流对象
        System.setOut(ps);

        System.out.println("world");

        //关闭资源
        ps.close();
    }
}
