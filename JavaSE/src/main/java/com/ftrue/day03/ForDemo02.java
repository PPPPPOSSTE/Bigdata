package com.ftrue.day03;

/**
 * @ClassName: ForTest2
 * @Description:
 * @Author: zhangzhiqi on 2021/6/29 9:29
 * @Version: 1.0
 */
// 练习：求出1-5之间数据之和
/*
    * 练习：求出1-5之间数据之和
    *
    * 分析：
    * 1.定义求和变量，初始化值是0
    * 2.获取1-5之间的数据，用for循环实现
    * 3.把每一次获取到的数据，累加起来就可以了
    * 4.输出求和变量即可
*/
public class ForDemo02 {
    public static void main(String[] args) {
        //使用原始方案打印1-5
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        System.out.println("==============================");

        //使用for循环语句打印1-5
        for (int i = 1; i <= 5 ; i++ ) {
            System.out.println(i);
        }



        System.out.println("==============================");

        //使用for循环语句打印5-1
        for (int i = 5; i >= 1 ; i-- ) {
            System.out.println(i);
        }
    }
}
