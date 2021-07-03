package com.ftrue.day06test;

/**
 * @ClassName: ArrayTwoDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/7/2 21:22
 * @Version: 1.0
 */
/*
    动态初始化：
        数据类型[][] 数组名 = new 数据类型[m][n];
        m:
        表示这个二维数组有多少个一维数组。
        n:
        表示每一个一维数组的元素有多少个。
    注意：
        以下格式也可以表示二维数组(不推荐)
        数据类型 数组名[][] = new 数据类型[m][n];
        数据类型[] 数组名[] = new 数据类型[m][n];
 */
public class ArrayTwoDemo01 {
    public static void main(String[] args) {
        //定义一个二维数组
        int[][] arr = new int[3][2];
        //定义了一个二维数组arr
        //这个二维数组有3个一维数组的元素
        //每一个一维数组有2个元素
        //输出二维数组名称
        System.out.println(arr); //地址值 [[I@175078b
        //输出二维数组的第一个元素一维数组的名称
        System.out.println(arr[0]); //地址值 [I@42552c
        System.out.println(arr[1]); //地址值 [I@e5bbd6
        System.out.println(arr[2]); //地址值 [I@8ee016
        //输出二维数组的元素
        System.out.println(arr[0][0]); //0
        System.out.println(arr[0][1]); //0
    }
}
