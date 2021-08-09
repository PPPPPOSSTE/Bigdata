package com.ftrue.day14test.exercise.exer11;


import java.util.Arrays;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第11题
 * 案例：
        已知一个字符串String str = "1、 hello 2. world 3. java 4.String 5. haha 6、HELLO";
        要求统计出现次数最多的字母及其出现的次数。不区分大小写。
 *
 * note: String类的replaceAll方法，及正则表达式的使用
 *       字符的整数值 与  数组索引  之间的对应关系
 * */
public class Exercise11 {
    public static void main(String[] args) {
        String str = "1、 hello 2. world 3. java 4.String 5. haha 6、HELLO";
        str = str.toLowerCase();
        //把里面的非字母去掉
        str = str.replaceAll("[^a-z]", "");
        char[] chars = str.toCharArray();

        //统计每个字母出现次数
        // 'a' = 97    97 - 97 = 0
        int[] countArr = new int[26];

        for (int i = 0; i < chars.length; i++) {
            countArr[chars[i] - 97]++;
        }

        //找最大值
        int max = countArr[0];
        for (int i = 1; i < countArr.length; i++) {
            if (max < countArr[i]) {
                max = countArr[i];
            }
        }

        //打印最大值和字母
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] == max) {
                //i=0 'a'字母
                //i=1 'b'字母
                System.out.println(((char) (i + 97)) + "出现了" + max + "次");
            }
        }
    }
}
