package com.ftrue.day08test;

import java.util.Arrays;

/**
 * @ClassName: ArraysDemo
 * @Description:
 * @Author: zhangzhiqi on 2021/7/3 23:24
 * @Version: 1.0
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {2, 34, 35, 4, 657, 8, 69, 9};

        System.out.println(arr);

        String s = Arrays.toString(arr);

        System.out.println(s);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
