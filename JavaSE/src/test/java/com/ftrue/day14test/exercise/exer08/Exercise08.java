package com.ftrue.day14test.exercise.exer08;


import java.util.Scanner;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第8题
 * 模拟用户登录。
        定义用户类，属性为用户名和密码。
        使用数组存储多个用户对象。
        录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败。
        登录失败时，当用户名错误，提示没有该用户。
        登录失败时，当密码错误时，提示密码有误。
 *
 *
 * */
public class Exercise08 {
    public static void main(String[] args) {
        User user01 = new User("jack", "1234");
        User user02 = new User("rose", "5678");
        User user03 = new User("tom", "0000");

        User[] userArr = {user01, user02, user03};

        for (User user : userArr) {
            System.out.println(user);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String userName = sc.next();
        System.out.print("请输入密码：");
        String password = sc.next();

        boolean userTrue = false;
        boolean pdTrue = false;
        for (User user : userArr) {
            if (userName.equals(user.getUserName())) {
                userTrue = true;
                if (password.equals(user.getPassword())) {
                    pdTrue = true;
                }
                break;
            }
        }

        if (userTrue && pdTrue) {
            System.out.println("登录结果: 登录成功");
        } else if (userTrue && (!pdTrue)){
            System.out.println("登录结果：密码错误");
        } else {
            System.out.println("登录结果：没有该用户");
        }
    }
}


