package com.ftrue.day12test.init.demo03;

/**
 * @ClassName: SubClass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 14:36
 * @Version: 1.0
 */
public class SubClass extends SuperClass {
    int num = 20;

    public SubClass() {
    }

    @Override
    public void method() {
        System.out.println("num = " + num);
    }

    //报错：'method()' in 'com.ftrue.day12test.init.demo03.SubClass' clashes with 'method()' in 'com.ftrue.day12test.init.demo03.SuperClass'; attempting to assign weaker access privileges ('package-private'); was 'public'
    /*void method() {
        System.out.println("num = " + num);
    }*/
}
