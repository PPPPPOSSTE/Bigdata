package com.ftrue.day16collection.exercise.exer01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * @ClassName: Exer01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/18 22:05
 * @Version: 1.0
 */
/*
 *
 * 随机验证码。
        随机生成十组六位字符组成的验证码。
        验证码由大小写字母、数字字符组成。
 *
 *
 * 开发提示：
        使用字符数组保存原始字符，利用Random类生成随机索引。
        将十组验证码放到集合中
        用Iterator迭代器遍历集合
 *
 * */
public class Exercise01 {
    public static void main(String[] args) {
        //System.out.println((int) '0');  //48
        //System.out.println((int) 'a');  //97
        //System.out.println((int) 'A');  //65

        char[] chars = new char[62];

        for (int i = 0; i < 10; i++) {
            chars[i] = (char) (i + '0');
        }
        for (int i = 10; i < 36; i++) {
            chars[i] = (char) (i + 'a' - 10);
        }
        for (int i = 36; i < 62; i++) {
            chars[i] = (char) (i + 'A' - 36);
        }
        //System.out.println(Arrays.toString(chars));

        ArrayList<String> list = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i1 = 0; i1 < 6; i1++) {
                int i2 = random.nextInt(62);
                stringBuilder.append(chars[i2]);
            }
            list.add(stringBuilder.toString());
        }

        //System.out.println(list);
        /*for (String s : list) {
            System.out.println("随机验证码：" + s);
        }*/

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("随机验证码：" + next);
        }
    }
}
