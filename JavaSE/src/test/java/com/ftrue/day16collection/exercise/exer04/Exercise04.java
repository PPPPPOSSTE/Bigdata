package com.ftrue.day16collection.exercise.exer04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName: Exercise04
 * @Description:
 * @Author: zhiqi zhang on 2021/7/19 8:29
 * @Version: 1.0
 */
/*
 *
 * 模拟乐透号码。
        随机生成10个号码放到集合中，范围1-50，作为乐透号码。不能重复。
        键盘录入10个整数放到集合中，范围1-50，不能重复。
        录入的整数与乐透号码对比，统计猜中了几个。
 *
 * 开发提示：
        当使用集合时，可以通过contains方法，判断某集合中是否包含某元素
 * */
public class Exercise04 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();

        while (true) {
            int num = random.nextInt(50);
            set.add(num);
            if (set.size() == 10) {
                break;
            }
        }

        for (Integer integer : set) {
            System.out.print(integer + "\t");
        }
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("乐透号码已经生成，游戏开始：");
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第i个数[1-50]：");
            int num = sc.nextInt();
            list.add(num);
        }

        System.out.println("你输入的号码为：" + list);
        System.out.println("乐透号码为：" + set);

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (set.contains(list.get(i))) {
                count++;
            }
        }
        System.out.println("猜中了：" + count + "个数字");


        sc.close();
    }
}
