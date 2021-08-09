package com.ftrue.day12test.inner.demo02;

/**
 * @ClassName: TestStaticInner
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 8:34
 * @Version: 1.0
 */
public class TestStaticInner {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.inMethod();

        //Static member 'com.ftrue.day12test.demo02.Outer.Inner.inTest()' accessed via instance reference
        in.inTest();
        Outer.Inner.inTest();
    }
}
