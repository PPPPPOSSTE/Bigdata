package com.ftrue.day12test.exer.test06;

/**
 * @ClassName: Test06
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 19:32
 * @Version: 1.0
 */
//考核知识点：属性与多态无关
public class Test06 {
    public static void main(String[] args) {
        Base b = new Sub();
        System.out.println(b.x);
    }
}

//输出结果
//1