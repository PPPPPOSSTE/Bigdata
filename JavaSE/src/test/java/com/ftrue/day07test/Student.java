package com.ftrue.day07test;

/**
 * @ClassName: Student
 * @Description:
 * @Author: zhangzhiqi on 2021/7/3 16:48
 * @Version: 1.0
 */
public class Student {
    /*//实例变量
    String name;
    int age;
    //实例方法
    public void study () {
        System.out.println(name + "good good study , day day up !!!");
    }*/

    //实例变量
    private String name;
    private int age;

    //构造器
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //实例方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat () {
        System.out.println("吃饭");
        drink("可乐");
    }
    public void study () {
        System.out.println("学习");
        drink("咖啡");
    }
    public void play () {
        System.out.println("玩耍");
        drink("红牛");
    }
    private void drink (String something) {
        System.out.println("喝" + something);
    }


    /*public void study() {
        System.out.println(age + "岁的" + name + "正在学习");
    }*/
}
