package com.ftrue.day15collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

/**
 * @ClassName: ListDemo02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/17 8:43
 * @Version: 1.0
 */
/**
 *
 * List集合接口
 *      接口的特点
 *          1.List集合是有序的集合
 *              有序:存储的顺序是获取的顺序一致
 *              无序:存储的顺序是获取的顺序不一致
 *          2.List集合是含有索引的集合
 *          3.List集合可以存储重复元素
 *          4.List集合可以存储null元素
 *              获取的时候考虑空指针异常,做非空校验
 *          5.List集合中的索引和数组中的索引表达方式不一样
 *              共同点,都是针对容器中的元素进行编号,编号从0开始,到容器长度-1
 *              不同点,List集合里面含有四大数据结构,每一种的索引形成的方式不一样
 *                  数组数据结构(重点)
 *                  链表数据结构(重点)
 *                  栈数据结构
 *                  队列数据结构
 *          6.List集合含有特有的迭代器ListIterator
 *      接口的位置
 *          java.util
 *      接口的方法(相比Collection接口，主要多了一些跟index有关的方法)
 *          void add(int index,E element)
 *              在列表的指定位置插入指定元素（可选操作）。
 *          E get(int index)
 *              返回列表中指定位置的元素。
 *          int indexOf(Object o)
 *              返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1。
 *          int lastIndexOf(Object o)
 *              返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1。
 *          ListIterator<E> listIterator()
 *              返回此列表元素的列表迭代器（按适当顺序）。
 *          E remove(int index)
 *              移除列表中指定位置的元素（可选操作）。
 *          E set(int index,E element)
 *              用指定元素替换列表中指定位置的元素（可选操作）。
 *          List<E> subList(int fromIndex,int toIndex)
 *              返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分视图。（
 *
 * =====================================================================
 * Demo02
 *
 * List集合的遍历方式
 *      1.迭代器
 *      2.增强for
 *      3.特有迭代器
 *      4.普通for
 *      5.Stream流(以后讲解,也是Collection集合通用遍历方式)
 *
 *
 */
public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("蒂尼约吧");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        list.add("摩托罗拉");

        //针对List集合使用迭代器进行遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("================");

        //增强for
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("===================");

        //ListIterator
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
        System.out.println("=======================");

        //索引
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("==============================");

        //Stream流
        Stream<String> stream = list.stream();
        //stream.forEach(s -> System.out.println(s));
        stream.forEach(System.out::println);


    }
}
















