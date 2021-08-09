package com.ftrue.day13test.exception.demo05;

import java.io.IOException;

/**
 * @ClassName: SubClass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/13 10:26
 * @Version: 1.0
 */
public class SubClass extends SuperClass {

    //父类方法声明了异常，子类重写方法时不用理会
    @Override
    public void method() /*throws IOException*/ {
    }


    //父类方法没有声明异常时，子类重写方法也不能声明异常，否则报错
    //如果子类重写方法确实有异常要处理时，只能通过try catch来处理
    //'method2()' in 'com.ftrue.day13test.exception.demo05.SubClass' clashes with 'method2()' in 'com.ftrue.day13test.exception.demo05.SuperClass'; overridden method does not throw 'java.io.IOException'
    /*@Override
    public void method2() throws IOException {
        throw new IOException("自定义IO异常");
    }*/
}
