package com.ftrue.day15collection.personal.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName: IteratorDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/15 16:20
 * @Version: 1.0
 */
public class IteratorDemo01 {
    public static void main(String[] args) {
        //使用多态方式创建对象
        Collection<String> coll = new ArrayList<>();

        //添加元素到集合
        coll.add("串串星人");
        coll.add("吐槽星人");
        coll.add("汪星人");

        //遍历
        //使用迭代器遍历 每个集合对象都有自己的迭代器
        Iterator<String> it = coll.iterator();
        //泛型指的是迭代出元素的数据类型
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        //tips: 在进行集合元素取出时，如果集合中已经没有元素了，还继续使用迭代器的next方法，将会发生java.util.NoSuchElementException没有集合元素的错误
    }
}
