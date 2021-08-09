package com.ftrue.day12test.exer.test08;

/**
 * @ClassName: Teacher
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 19:38
 * @Version: 1.0
 */
public class Teacher extends Person {
    private String name = "tom";

    public Teacher() {
        System.out.println("this is a teacher.");
        //报错：Call to 'super()' must be first statement in constructor body
        //super();
    }

    public static void main(String[] args) {
        Teacher tea = new Teacher();
        //报错：'com.ftrue.day12test.exer.test08.Teacher.this' cannot be referenced from a static context
        //System.out.println(this.name);
    }
}
