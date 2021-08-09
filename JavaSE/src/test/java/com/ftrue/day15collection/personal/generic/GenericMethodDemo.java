package com.ftrue.day15collection.personal.generic;

/**
 * @ClassName: GenericMethodDemo
 * @Description:
 * @Author: zhiqi zhang on 2021/7/15 23:18
 * @Version: 1.0
 */
public class GenericMethodDemo {
    public static void main(String[] args) {
        MyGenericMethod mm = new MyGenericMethod();

        mm.show2("aaa");
        mm.show2(123);
        mm.show2(12.45);
    }
}
