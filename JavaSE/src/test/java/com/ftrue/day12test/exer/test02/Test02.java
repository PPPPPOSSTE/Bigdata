package com.ftrue.day12test.exer.test02;

/**
 * @ClassName: Test02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 18:36
 * @Version: 1.0
 */
//考核知识点：实例初始化方法，属性与多态无关
public class Test02 {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.x);
    }
}

//输出结果
//Son.x = 0
//Son.x = 30
//20

