package com.ftrue.day16collection.exercise.exer03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName: Exercise03
 * @Description:
 * @Author: zhiqi zhang on 2021/7/18 23:20
 * @Version: 1.0
 */
/*
 * 案例：
        1、用一个String[]数组存点数
        2、用一个String[]数组存花色
        3、用一个String[]数组存大王、小王
        4、用上面的数组，生成一副扑克牌
        5、遍历显示全副扑克牌
        6、模拟给4个人随机发牌，每个人11张牌
        7、显示每个人的牌和剩余的牌
 *
 *
 * */
public class Exercise03 {
    public static void main(String[] args) {
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] color = {"黑桃", "红桃", "方片", "梅花"};
        String[] king = {"大王", "小王"};

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            for (int i1 = 0; i1 < 4; i1++) {
                list.add(color[i1] + num[i]);
            }
        }

        list.add(king[0]);
        list.add(king[1]);

        int count = 0;
        for (String s : list) {
            System.out.print(s + "\t");
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
        System.out.println();

        System.out.println("发牌：");

        Collections.shuffle(list);

        List<String> list1 = list.subList(0, 11);
        System.out.println("第1个人：" + list1);
        List<String> list2 = list.subList(11, 22);
        System.out.println("第2个人：" + list2);
        List<String> list3 = list.subList(22, 33);
        System.out.println("第3个人：" + list3);
        List<String> list4 = list.subList(33, 44);
        System.out.println("第4个人：" + list4);
        List<String> list5 = list.subList(44, 54);
        System.out.println("剩余：" + list5);

    }
}
