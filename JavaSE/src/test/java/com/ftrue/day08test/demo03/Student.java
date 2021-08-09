package com.ftrue.day08test.demo03;

/**
 * @ClassName: Stuent
 * @Description:
 * @Author: zhangzhiqi on 2021/7/6 11:33
 * @Version: 1.0
 */
public class Student {
    private String name;
    private int age;
    private int id;
    private static int num = 210625001;

    {
        //构造代码块
        this.id = num++;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        //this.id = num++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String print() {
        return name + "=" + age + "=" + id;
    }
}
