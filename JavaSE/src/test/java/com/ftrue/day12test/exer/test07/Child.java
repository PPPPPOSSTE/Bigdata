package com.ftrue.day12test.exer.test07;

/**
 * @ClassName: Child
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 19:35
 * @Version: 1.0
 */
//考核知识点：权限修饰符
public class Child extends Father {
    public String grade;

    public static void main(String[] args) {
        Father f = new Child();
        //报错：'name' has private access in 'com.ftrue.day12test.exer.test07.Father'
        //System.out.println(f.name);
    }
}
