package com.ftrue.day21test.reflect.demo09;

/**
 * @ClassName: Student
 * @Description:
 * @Author: zhiqi zhang on 2021/7/24 8:56
 * @Version: 1.0
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String print() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat(String something) {
        System.out.println("吃" + something);
    }

    /*@Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/
}
