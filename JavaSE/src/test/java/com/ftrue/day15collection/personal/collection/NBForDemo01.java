package com.ftrue.day15collection.personal.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName: NBForDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/15 17:03
 * @Version: 1.0
 */
public class NBForDemo01 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 87};
        //使用增强for遍历数组
        for (int i : arr) {  //i代表数组中的每个元素
            System.out.println(i);
            i++;
        }
        //增强for循环的内部原理其实是个Iterator迭代器，所以不能修改基本数据类型的值
        for (int i : arr) {  //i代表数组中的每个元素
            System.out.println(i);
        }

        System.out.println("================================");

        //使用多态方式创建对象
        Collection<String> coll = new ArrayList<>();
        //添加元素到集合
        coll.add("串串星人");
        coll.add("吐槽星人");
        coll.add("汪星人");
        //使用增强for遍历
        for (String s : coll) {  //接受变量s代表被遍历到的集合元素
            System.out.println(s);
            s = "hello";
        }
        for (String s : coll) {
            System.out.println(s);
        }

        //tips: 新for循环必须有被遍历的目标。目标只能是Collection或者是数组。新式for仅仅作为遍历操作出现。
    }
}
