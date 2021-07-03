package com.ftrue.day08test;

/**
 * @ClassName: Student
 * @Description:
 * @Author: zhangzhiqi on 2021/7/3 21:44
 * @Version: 1.0
 */
public class Student {
    private String name;
    private int age;
    //学生的ID
    private int sid;
    //类变量，记录学生数量，分配学号
    public static int numberOfStudent = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        //通过numberOfStudent给学生分配学号
        this.sid = ++numberOfStudent;
    }

    //打印属性值
    public void show() {
        System.out.println("Student : name=" + name + ", age=" + age + ", sid=" + sid);
    }

    public static void showNum() {
        System.out.println("num:" + numberOfStudent);
    }
}