package com.ftrue.day21test.personal;

/**
 * @ClassName: TestClinit1
 * @Description:
 * @Author: zhiqi zhang on 2021/7/23 21:14
 * @Version: 1.0
 */
class Father {
    static {
        System.out.println("main方法所在的类的父类(1)");//初始化子类时，会初始化父类

    }
}

public class TestClinit1 extends Father {
    static {
        System.out.println("main方法所在的类(2)");//主方法所在的类会初始化
    }

    public static void main(String[] args) throws ClassNotFoundException {
        new A();//第一次使用A就是创建它的对象，会初始化A类
        System.out.println("=========");
        B.test();//直接使用B类的静态成员会初始化B类
        Class clazz = Class.forName("com.ftrue.day21test.personal.C");//通过反射操作C类，会初始化C类
    }
}

//main方法所在的类的父类(1)
//main方法所在的类(2)
//A类初始化
//B类初始化
//B类的静态方法
//C类初始化

class A {
    static {
        System.out.println("A类初始化");
    }
}

class B {
    static {
        System.out.println("B类初始化");
    }

    public static void test() {
        System.out.println("B类的静态方法");
    }
}

class C {
    static {
        System.out.println("C类初始化");
    }
}