package com.ftrue.day22exam.exercise01;

/**
 * @ClassName: Exercise0127
 * @Description:
 * @Author: zhiqi zhang on 2021/7/23 0:05
 * @Version: 1.0
 */
//27.	以下代码的运行结果：
//base : 100
//sub: 100
//base : 70
public class Exercise0127 {
    public static void main(String[] args) {
        Base b1 = new Base();
        Base b2 = new Sub();
    }

}

class Base {
    Base() {
        method(100);
    }

    public void method(int i) {
        System.out.println("base : " + i);
    }
}

class Sub extends Base {
    Sub() {
        super.method(70);
    }

    public void method(int j) {
        System.out.println("sub : " + j);
    }
}

