package com.ftrue.day15collection.set;

import java.util.HashSet;

/**
 * @ClassName: SetDemo02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/17 14:04
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
 * ==============================================================
 * Demo02
 *
 * HashSet类
 *      类的特点
 *          1.HashSet类底层的数据结构是"哈希表"(HashSet集合底层封装HashMap)
 *              哈希表:存储链表结构元素的数组
 *              JDK7.0(包含)以前:数组 + 链表(Node),其实就是Node[]
 *              JDK8.0(包含)以后:数组 + 链表(Node) 或者 数组 + 红黑树(TreeNode)
 *          2.HashSet类是一个无序的集合
 *              无序:添加元素的顺序和获取元素的顺序不一致
 *          3.HashSet类无法保证集合中元素的存储位置永远不会改变
 *              元素的位置和集合底层数组的长度有关,所以当集合底层数组长度改变的时候,元素的索引位置就有可能发生改变
 *          4.HashSet类可以存储null元素,获取元素并使用之前,针对元素做非空校验,避免发生空指针异常
 *          5.HashSet类是线程不安全,执行效率高,适合单线程程序
 *      类的位置
 *          java.util
 *      类的构造器
 *          public HashSet()
 *              构造一个新的空 set，其底层 HashMap 实例的默认初始容量是 16，加载因子是 0.75。
 *      类的方法
 *          没有新方法,跳过
 *
 *
 */
public class SetDemo02 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        //添加元素
        set.add("abc");
        set.add("acb");
        set.add("bac");
        set.add("bca");
        set.add("cab");
        set.add("cba");

        System.out.println(set);
    }
}
