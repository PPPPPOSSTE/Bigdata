package com.ftrue.day12test.inner.demo01;

/**
 * @ClassName: TestInner
 * @Description:
 * @Author: zhiqi zhang on 2021/7/10 22:14
 * @Version: 1.0
 */
public class TestInner {
    public static void main(String[] args) {
        Outer out = new Outer();
        //报错：Cannot resolve method 'inMethod' in 'Outer'
        //out.inMethod();

        Outer.Inner in = out.new Inner();
        in.inMethod();
        System.out.println(in);  //com.ftrue.day12test.demo01.Outer$Inner@1b6d3586

        //后面新建的内部类中的外部类的实例变量的值也会改变
        //之前创建的内部类的外部类的实例变量的值也会改变
        //所有创建的内部类会共享外部类对象的实例成员
        out.setB(999);
        in.inMethod();

        Outer.Inner in2 = out.new Inner();
        in2.inMethod();
        System.out.println(in2);  //com.ftrue.day12test.demo01.Outer$Inner@4554617c
        //Cannot resolve method 'outMethod' in 'Inner'
        //in2.outMethod();
        //Cannot resolve method 'outerInsMethod' in 'Inner'
        //in2.outerInsMethod();

        Outer.Inner inner = out.getInner();
        inner.inMethod();
        System.out.println(inner);  //com.ftrue.day12test.demo01.Outer$Inner@4554617c

        Outer.Inner inner2 = out.getInner();
        inner.inMethod();
        System.out.println(inner2);  //com.ftrue.day12test.demo01.Outer$Inner@1540e19d


        //测试非静态的内部类的创建方式
        //报错：'com.ftrue.day12test.demo01.Outer' is not an enclosing class
        //Outer.Inner inner1 = new Outer.Inner();


    }
}
