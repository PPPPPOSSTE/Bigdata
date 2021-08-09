package com.ftrue.day12test.exer.test03;

/**
 * @ClassName: Test03
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 18:45
 * @Version: 1.0
 */
//考核知识点：多态，重写，实例初始化过程
public class Test03 {
    public static void main(String[] args) {
        Base b1 = new Base();
        Base b2 = new Sub();
    }
}

//输出结果
//base : 100
//sub : 100
//base : 70
