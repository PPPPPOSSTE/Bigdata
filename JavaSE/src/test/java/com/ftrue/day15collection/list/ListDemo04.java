package com.ftrue.day15collection.list;

import java.util.ArrayList;

/**
 * @ClassName: ListDemo04
 * @Description:
 * @Author: zhiqi zhang on 2021/7/17 9:57
 * @Version: 1.0
 */
/**
 *
 * ArrayList类
 *      类的特点
 *          1.ArrayList集合底层数据结构是"数组"
 *          2.ArrayList集合不是线程安全,执行效率高,适用于单线程程序
 *          3.数组数据结构的特点(对比LinkedList中的链表结构)
 *              查询效率高,增删效率低
 *          4.ArrayList类底层数组结构的初始容量是多少?
 *              初始容量是多少取决于所选择的构造器
 *              a.public ArrayList(Collection<? extends E> c)
 *                  初始容量:参数集合的长度
 *              b.public ArrayList(int initialCapacity)
 *                  初始容量:自定义
 *              c.public ArrayList()
 *                  JDK6.0(包含)以前:
 *                      初始容量:10
 *                  JDK7.0(包含)以后:
 *                      初始容量:0,但是当第一次添加元素的时候,初始化长度为10
 *          5.扩容规则
 *              JDK6.0(包含)以前:
 *                  原来数组长度 * 3 / 2 + 1
 *              JDK7.0(包含)以后:
 *                  原来数组长度 + (原来数组长度 >> 1)
 *
 *
 *      类的位置
 *          java.util
 *      类的构造器
 *          public ArrayList()
 *              构造一个初始容量为 0 的空列表。
 *      类的方法
 *          在父接口的时候已经讲解,没有新方法了
 *
 */
public class ListDemo04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add("元素" + i);
        }

        list.add("元素11");
    }
}
