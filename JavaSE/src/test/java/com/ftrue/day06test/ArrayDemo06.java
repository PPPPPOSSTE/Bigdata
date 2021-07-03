package com.ftrue.day06test;

/**
 * @ClassName: ArrayDemo05
 * @Description:
 * @Author: zhangzhiqi on 2021/7/1 10:09
 * @Version: 1.0
 */
//数组的冒泡排序
public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 2, 9, 1};

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int max = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = max;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
