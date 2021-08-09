package com.ftrue.day16collection.personal.set;

import java.util.HashSet;

/**
 * @ClassName: HashSetDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/16 19:44
 * @Version: 1.0
 */
public class HashSetDemo01 {
    public static void main(String[] args) {
        //创建Set集合
        HashSet<String> set = new HashSet<>();

        //添加元素
        set.add(new String("cba"));
        set.add("abc");
        set.add("bac");
        set.add("cba");

        //遍历
        for (String name : set) {
            System.out.println(name);
        }
    }
}
