package com.ftrue.day06test;

/**
 * @ClassName: ArrayDemo05
 * @Description:
 * @Author: zhangzhiqi on 2021/7/1 10:09
 * @Version: 1.0
 */
//数组的二分查找法
public class ArrayDemo09 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 10, 15, 18, 20, 22, 25, 28};//数组是有序的
        int value = 18;
        int index = -1;
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (value > arr[mid]) {
                //移动左边界，使得mid往右移动
                start = mid + 1;
            } else if (value < arr[mid]) {//往左边继续查找
                end = mid - 1;
            } else {
                index = mid;
                break;
            }
            mid = (start + end) / 2;
        }
        if (index == -1) {
            System.out.println(value + "不存在");
        } else {
            System.out.println(value + "的下标是" + index);
        }
    }
}
