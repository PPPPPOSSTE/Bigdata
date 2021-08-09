package com.ftrue.day15collection.list;

/**
 * @ClassName: ListDemo06
 * @Description:
 * @Author: zhiqi zhang on 2021/7/17 20:36
 * @Version: 1.0
 */

import java.util.LinkedList;

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
 * ====================================================================
 * Demo03
 *
 * 需求:现在钱包里面有360元(3张100元,1张50元,1张10元),需要花费300元买个键盘,求钱包里面剩余钱数
 *
 * 解决方案:
 *      1.如果删除成功,需要将索引往前移动一位
 *      2.倒序遍历删除
 *      3.迭代器中的删除方法
 *
 * ========================================================================
 * Demo04
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
 * ===============================================================
 * Demo05
 *
 * Vector类
 *      类的特点
 *         1.Vector集合底层数据结构是"数组"
 *          2.Vector集合是线程安全,执行效率低,适用于多线程程序
 *          3.数组数据结构的特点(对比LinkedList中的链表结构)
 *              查询效率高,增删效率低
 *          4.Vector类底层数组结构的初始容量是多少?
 *              初始容量是多少取决于所选择的构造器
 *              a.public Vector(Collection<? extends E> c)
 *                  初始容量:参数集合的长度
 *              b.public Vector(int initialCapacity)
 *                  初始容量:自定义
 *              c.public Vector(int initialCapacity,int capacityIncrement)
 *                  初始容量:自定义
 *                  增量:自定义
 *              d.public Vector()
 *                  初始容量:10
 *                  增量:0
 *          5.扩容规则
 *              原来数组长度 + (增量 > 0) ? 增量 : 原来数组长度
 *      类的位置
 *          java.util
 *      类的构造器
 *          public Vector()
 *              构造一个初始容量为 10 的空列表。
 *      类的方法
 *          在父接口的时候已经讲解,没有新方法了
 *
 * =======================================================================
 * Demo06
 *
 * LinkedList类
 *      类的特点
 *          1.LinkedList底层数据结构是"链接列表",简称:链表
 *          2.根据链表存储内容进行分类
 *              单向链表:当前元素(泛型),下一个Node对象
 *              双向链表:当前元素(泛型),下一个Node对象,上一个Node对象
 *          3.链表在底层其实就是一个类,类型是LinkedList$Node
 *              LinkedList里面的内部类Node是一个双向链表
 *          4.链表结构的特点(相比集合中数组结构)
 *              增删效率高,查询效率低
 *          5.链表结构的弊端:
 *              链表结构长度越长,整体效率越低,后期会通过另外一种数据结构进行替换,
 *              新的数据结构和LinkedList无关,后面学的集合中底层也有链表,
 *              但是当达到某一标准,会将"链表结构"转换成新的数据结构,
 *              而这个新的数据结构叫做"红黑树"
 *          6.LinkedList集合不是线程安全,执行效率高,适用于单线程程序
 *
 *
 *
 *      类的位置
 *          java.util
 *      类的构造器
 *          public LinkedList()
 *              构造一个空列表
 *      类的方法
 *          public void addFirst(E e)将指定元素插入此列表的开头
 *          public void addLast(E e)将指定元素添加到此列表的结尾。
 *          public E getFirst()返回此列表的第一个元素。
 *          public E getLast()返回此列表的最后一个元素
 *          public E removeFirst()移除并返回此列表的第一个元素。
 *          public E removeLast()移除并返回此列表的最后一个元素。
 *
 *
 * 注意事项:
 *      如果需要的集合对象后期处理查询偏多,推荐使用ArrayList
 *      如果需要的集合对象后期处理增删偏多,推荐使用LinkedList
 *
 *
 */
public class ListDemo06 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //list.add("e");


        System.out.println(list.get(3));
    }
}
