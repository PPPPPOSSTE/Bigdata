package com.ftrue.day08test;

/**
 * @ClassName: StuDemo2
 * @Description:
 * @Author: zhangzhiqi on 2021/7/3 22:11
 * @Version: 1.0
 */
public class StuDemo2 {
    public static void main(String[] args) {
        // 访问类变量
        System.out.println(Student.numberOfStudent);
        // 调用静态方法
        Student.showNum();
    }
}
