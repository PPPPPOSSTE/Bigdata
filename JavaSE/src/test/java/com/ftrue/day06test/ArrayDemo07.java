package com.ftrue.day06test;

/**
 * @ClassName: ArrayDemo05
 * @Description:
 * @Author: zhangzhiqi on 2021/7/1 10:09
 * @Version: 1.0
 */
//数组的选择排序
public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 9, 1};

        System.out.println("排序前：[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        for (int i = 0; i < arr.length; i++) {
            //记录当前趟数临时最小值的索引
            int index = i;
            //遍历数组，拿到临时最小值的索引
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }

            //如果临时最小值的索引位置变动，进行位置的交换
            if (index != i) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println("排序后：[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
