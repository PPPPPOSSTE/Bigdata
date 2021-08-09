package com.ftrue.day10test.demo04;

/**
 * @ClassName: ExtendsDemo03
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 9:48
 * @Version: 1.0
 */
/*
 * 继承的特点3:实例变量
 *      子类可以继承父类的实例变量
 * */
public class ExtendsDemo04 {
    public static void main(String[] args) {
        //创建子类对象
        SubClass sc = new SubClass();
        System.out.println(sc.num);
    }
}
