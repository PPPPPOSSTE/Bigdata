package com.ftrue.day21test.reflect.demo07;

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

    Student(String name) {
        this.name = name;
    }

    private Student(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
