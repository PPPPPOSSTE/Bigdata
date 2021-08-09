package com.ftrue.day12test.exer.test01;

/**
 * @ClassName: Test01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 18:30
 * @Version: 1.0
 */
//考核知识点：属性与多态无关
public class Test01 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.num);  //1
        System.out.println(((B) a).num);  //2
        System.out.println(((A) ((B) a)).num);  //1
        System.out.println("-------------------");
        B b = new B();
        System.out.println(b.num);  //2
        System.out.println(((A) b).num);  //1
        System.out.println(((B) ((A) b)).num);  //2
    }
}

//输出结果：
/*
1
2
1
-------------------
2
1
2
*/
