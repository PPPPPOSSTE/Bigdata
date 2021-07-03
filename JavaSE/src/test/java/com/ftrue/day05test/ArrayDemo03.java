package com.ftrue.day05test;

/**
 * @ClassName: ArrayDemo01
 * @Description:
 * @Author: zhangzhiqi on 2021/6/30 21:18
 * @Version: 1.0
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        //定义并初始化数组
        int[] arr = {11, 22, 33};
        //System.out.println(arr[0]);
        //System.out.println(arr[1]);
        //System.out.println(arr[2]);

        System.out.println(arr.getClass());
        System.out.println(arr.getClass().getSuperclass());
        for (Class<?> c : arr.getClass().getInterfaces())
            System.out.println("Superinterface: " + c);
        //class [I
        //class java.lang.Object
        //Superinterface: interface java.lang.Cloneable
        //Superinterface: interface java.io.Serializable

        int[] ia = new int[3];
        int[] ib = new int[6];
        System.out.println(ia == ib);
        System.out.println(ia.getClass() == ib.getClass());

        System.out.println("================");

        /*for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }*/

        System.out.println("================");

        //System.out.println("数组的长度 = " + arr.length);

        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
    }
}
