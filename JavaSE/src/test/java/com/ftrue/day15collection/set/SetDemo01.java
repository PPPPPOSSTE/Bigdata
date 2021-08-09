package com.ftrue.day15collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @ClassName: SetDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/17 11:46
 * @Version: 1.0
 */
/**
 *
 * Set接口
 *      接口的特点
 *          1.Set集合不可以存储重复元素
 *          2.Set集合是没有索引的集合
 *          3.Set集合没有特有迭代器
 *          4.Set集合的遍历方式:
 *              迭代器和增强for
 *      接口的位置
 *          java.util
 *      接口的方法
 *          都已经在Collection时候都学习过了
 *
 */
public class SetDemo01 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("abc");
        set.add("cba");
        set.add("abc");
        set.add("abc");
        set.add(new String("abc"));
        set.add(null);

        System.out.println(set);
    }
}
