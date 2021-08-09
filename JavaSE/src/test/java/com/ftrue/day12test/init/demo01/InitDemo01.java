package com.ftrue.day12test.init.demo01;

/**
 * @ClassName: InitDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 13:59
 * @Version: 1.0
 */
/*
*
* 实例的初始化过程：
*   一个类的实例初始化过程：
*       （1）实例变量的显示初始化或者构造器代码块（二者优先级一样，谁在前谁先执行）
*       （2）构造器中的显示代码
*
* */
public class InitDemo01 {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
    }
}
