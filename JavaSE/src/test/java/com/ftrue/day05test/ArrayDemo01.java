package com.ftrue.day05test;

/**
 * @ClassName: ArrayDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/6/30 21:18
 * @Version: 1.0
 */
/*
    数组：
        存储同一种数据类型多个元素的固定容器
    数组的特点:
        1.数组的大小（长度）是固定不变的
        2.存储的元素必须在内存中是同一种数据类型
        3.数组的元素需要是多个（）
    数组的声明：
        数据类型[] 数组名;
            例如：int[] arr;
        数据类型 数组名[];
            例如：int arr[];

        数据类型：数组中存储元素的数据类型
        []：数组
        数据类型[]：数组的数据类型
        数组名：数组的名字；

    数组的初始化：
        动态初始化：
        静态初始化：
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] arr01;

        int arr02[];

        int[] arr03 = new int[3];

        int[] arr04 = new int[]{11, 22, 33};

        int[] arr05 = {11, 22, 33};

        //int[] arr06 = new int[3]{11, 22, 33};  //语法错误，java语言中不允许动静结合的方式创建数组

        int[] arr06;
        arr06 = new int[]{11, 22, 33};

        int[] arr07;
        //arr07 = {11, 22, 33};  //语法错误，Array initializer is not allowed here  注意和arr05进行对比

    }
}
