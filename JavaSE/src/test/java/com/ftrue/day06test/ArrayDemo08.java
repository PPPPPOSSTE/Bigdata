package com.ftrue.day06test;

/**
 * @ClassName: ArrayDemo05
 * @Description:
 * @Author: zhangzhiqi on 2021/7/1 10:09
 * @Version: 1.0
 */
//查找指定元素在数组中出现的第一次索引
public class ArrayDemo08 {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {11, 22, 33, 44, 55, 22, 45, 22, 54, 22};
        //2.定义一个指定元素
        int num = 22;
        //3.遍历数组，获取每个元素
        // 定义一个计数器
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
        //指定元素和数组中每个元素进行比较
            if (num == arr[i]) {
                count++;
                System.out.println("指定元素" + num + "在数组中出现的第一次索引是"+i);
                break;
            }
        }
        if (count == 0) {
            System.out.println("指定元素" + num + "在数组中找不到");
        }
    }
}
