package com.ftrue.day05test;

/**
 * @ClassName: ArrayDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/6/30 21:18
 * @Version: 1.0
 */
//按照固定格式进行数组的打印
public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("========================");

        //数组：[11, 22, 33, 44]
        System.out.print("数组：[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
