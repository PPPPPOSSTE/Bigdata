package com.ftrue.day10test.demo05;

/**
 * @ClassName: SubClass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 9:49
 * @Version: 1.0
 */
public class SubClass extends SuperClass {
    //创建一个和父类实例变量同名的变量
    public int num = 20;

    public void method() {
        //创建一个和实例变量同名的局部变量
        int num = 30;
        System.out.println("num = " + num);//30
        System.out.println("num = " + this.num);//20
        System.out.println("num = " + super.num);//10
    }
}
