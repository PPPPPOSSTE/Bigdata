package com.ftrue.day08test.demo01;

/**
 * @ClassName: Student
 * @Description:
 * @Author: zhangzhiqi on 2021/7/6 8:44
 * @Version: 1.0
 */
public class Student {
    private String name;
    private int age;
    public static String classroom;  //实例变量，属于对象本身

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*public Student(String name, int age, String classroom) {
        this.name = name;
        this.age = age;
        this.classroom = classroom;
    }*/

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

    /*public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }*/

    public String print() {
        return name + "=" + age + "=" + classroom;
    }
}
