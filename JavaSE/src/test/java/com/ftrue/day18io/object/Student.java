package com.ftrue.day18io.object;

import java.io.Serializable;

/**
 * @ClassName: Student
 * @Description:
 * @Author: zhiqi zhang on 2021/7/20 15:17
 * @Version: 1.0
 */
public class Student implements Serializable {
    private transient String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
