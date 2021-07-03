package com.ftrue.day05test;

/**
 * @ClassName: ArrayDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/6/30 21:18
 * @Version: 1.0
 */
//按照固定格式进行数组的打印
public class ArrayDemo11 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 62, 431, 2};

        int sum = getSum(arr);
        System.out.println(sum);


        int sum1 = getSum(6, 7, 2, 12, 2121);
        System.out.println(sum1);
    }

    /*
    //数组的写法
    private static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    */

    //可变参数写法
    private static int getSum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
