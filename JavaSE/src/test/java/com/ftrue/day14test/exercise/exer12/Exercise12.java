package com.ftrue.day14test.exercise.exer12;


/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第12题
 * 案例：已知字符串String str = "1.hello2.world3.java4.string";要求拆分出每一个单词，并遍历显示
 *
 * note: 正则表达式的使用。注意^的使用。注意.的使用。
 *
 *
 * */
public class Exercise12 {
    public static void main(String[] args) {
        String str = "1.hello2.world3.java4.string";

        //把开头的1.去掉
        str = str.replaceAll("^\\d\\.", "");
        System.out.println(str);
        //按照数字.的格式进行拆分
        String[] split = str.split("\\d\\.");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
