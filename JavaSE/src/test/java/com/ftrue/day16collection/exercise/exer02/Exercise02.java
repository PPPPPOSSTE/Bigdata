package com.ftrue.day16collection.exercise.exer02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/18 22:29
 * @Version: 1.0
 */
/*
 *
 * 键盘录入学生信息，保存到集合中。
        循环录入的方式，1：表示继续录入，0：表示结束录入。
        定义学生类，属性为姓名，年龄，使用学生对象保存录入数据。
        使用ArrayList集合，保存学生对象，录入结束后，用foreach遍历集合。
 *
 *
 * */
public class Exercise02 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("选择（1、录入；0、退出）：");
            int i = scanner.nextInt();
            if (i == 1) {
                System.out.print("姓名：");
                String name = scanner.next();
                System.out.print("年龄：");
                int age = scanner.nextInt();
                Student student = new Student(name, age);
                list.add(student);
                continue;
            }
            break;
        }

        list.forEach(System.out::println);
    }
}
