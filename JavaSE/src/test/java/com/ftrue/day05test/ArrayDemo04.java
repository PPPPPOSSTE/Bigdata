package com.ftrue.day05test;

/**
 * @ClassName: ArrayDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/6/30 21:18
 * @Version: 1.0
 */
public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arr01 = new int[3];
        System.out.println(arr01);
        System.out.println(arr01[0]);
        System.out.println(arr01[1]);
        System.out.println(arr01[2]);

        int[] arr02 = arr01;
        System.out.println(arr02);
        System.out.println(arr02[0]);
        System.out.println(arr02[1]);
        System.out.println(arr02[2]);

        arr02[0] = 100;
        arr02[2] = 300;

        System.out.println(arr02);
        System.out.println(arr02[0]);
        System.out.println(arr02[1]);
        System.out.println(arr02[2]);
        System.out.println(arr01);
        System.out.println(arr01[0]);
        System.out.println(arr01[1]);
        System.out.println(arr01[2]);
    }
}
