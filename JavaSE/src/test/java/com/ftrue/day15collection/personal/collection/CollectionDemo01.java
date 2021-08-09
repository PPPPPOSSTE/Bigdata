package com.ftrue.day15collection.personal.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName: CollectionDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/15 15:59
 * @Version: 1.0
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        //使用多态形式
        Collection<String> coll = new ArrayList<>();

        //使用方法
        //添加功能 boolean add(String s)
        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");
        System.out.println(coll);

        //boolean contains(E e)  判断e是否在集合中存在
        System.out.println("判断 扫地僧 是否在集合中：" + coll.contains("扫地僧"));

        //boolean remove(E e)  删除在集合中的e元素
        System.out.println("删除石破天：" + coll.remove("石破天"));
        System.out.println("操作之后集合中的元素：" + coll);

        //int size()  集合中有几个元素
        System.out.println("集合中有" + coll.size() + "个元素");

        //Object[] toArray()  转换成一个Object数组
        Object[] objects = coll.toArray();
        //遍历数组
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        //void clear()  清空集合
        coll.clear();
        System.out.println("集合中内容为：" + coll);

        //boolean isEmpty()  判断是否为空
        System.out.println(coll.isEmpty());

        //有关Collection中的方法可不止上面这些，其它方法可以自行查看API学习
    }
}
