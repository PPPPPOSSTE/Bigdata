package com.ftrue.day12test.init.demo01;

/**
 * @ClassName: Subclass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 14:01
 * @Version: 1.0
 */
public class SubClass {
    //实例变量
    //int num = 10;
    int num = method();

    public int method() {
        System.out.println("实例变量的显示初始化");
        return 10;
    }

    //构造器
    public SubClass() {
        //隐式代码（实例初始化）
        //显示代码（赋值）
        System.out.println("构造器中的显示代码");
    }

    {
        System.out.println("构造器代码块");
    }
}
