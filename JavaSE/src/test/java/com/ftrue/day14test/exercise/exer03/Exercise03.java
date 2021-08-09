package com.ftrue.day14test.exercise.exer03;

import java.util.Scanner;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第3题
 * 替换某字符串中的某字符串。
        键盘录入一个srcStr字符串，再录入一个delStr字符串。
        删除该字srcStr符串中的所有delStr字符串。
 *
 * note；String的replaceAll方法
 *
 * */
public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入原字符串：");
        String srcStr = input.nextLine();
        //System.out.println("srcStr = " + srcStr);
        System.out.print("请输入要删除的字符串：");
        String delStr = input.nextLine();
        //System.out.println("delStr = " + delStr);

        String result = srcStr.replaceAll(delStr, "");

        //String[] strings = srcStr.split(delStr);
        //int count = strings.length - 1;
        int count = (srcStr.length() - result.length()) / delStr.length();

        System.out.println("源字符串中总共包含：" + count + " 个 " + delStr);
        System.out.println("删除" + delStr + "后字符串：" + result);

        input.close();
    }
}

//测试案例
//java woaijava, i like jajavava i enjoy java
//ja
//结果：5
//结果：va woaiva, i like vava i enjoy va