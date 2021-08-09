package com.ftrue.day15collection.personal.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ListDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/16 9:52
 * @Version: 1.0
 */
public class ListDemo01 {
    public static void main(String[] args) {
        //创建List集合对象
        List<String> list = new ArrayList<>();

        //往尾部添加指定元素
        list.add("图图");
        list.add("小美");
        list.add("不高兴");

        System.out.println(list);
        System.out.println("==================");

        //add(int index, String s)  往指定位置添加
        list.add(1, "没头脑");
        System.out.println(list);
        System.out.println("======================");

        //String remove(int index)  删除指定位置元素 返回被删除元素
        System.out.println(list.remove(2));
        System.out.println(list);
        System.out.println("====================");

        //String set(int index, String s)  在指定位置进行元素替代（改）
        System.out.println(list.set(0, "三毛"));
        System.out.println(list);
        System.out.println("====================");

        //String get(int index) 获取指定位置元素
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=========================");

        //使用增强for
        for (String s : list) {
            System.out.println(s);
        }


    }
}
