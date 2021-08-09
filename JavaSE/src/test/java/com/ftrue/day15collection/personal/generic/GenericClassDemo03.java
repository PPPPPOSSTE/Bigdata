package com.ftrue.day15collection.personal.generic;

/**
 * @ClassName: GenericClassDemo03
 * @Description:
 * @Author: zhiqi zhang on 2021/7/15 21:20
 * @Version: 1.0
 */
public class GenericClassDemo03 {
    public static void main(String[] args) {
        //创建一个泛型为String的类
        MyGenericClass<String> my = new MyGenericClass<>();
        //调用setT
        my.setT("大胡子登登");
        //调用getT
        String t = my.getT();
        System.out.println("t = " + t);

        System.out.println("======================");

        //创建一个泛型为Integer的类
        MyGenericClass<Integer> my2 = new MyGenericClass<>();
        my2.setT(123);
        Integer t1 = my2.getT();
        System.out.println("t1 = " + t1);
    }
}
