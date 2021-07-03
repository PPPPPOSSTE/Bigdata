package com.ftrue.day06test;

/**
 * @ClassName: ArrayDemo05
 * @Description:
 * @Author: zhangzhiqi on 2021/7/1 10:09
 * @Version: 1.0
 */
//数组反转
public class ArrayDemo05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int start = 0, end = arr.length - 1; start <= end ; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
}
