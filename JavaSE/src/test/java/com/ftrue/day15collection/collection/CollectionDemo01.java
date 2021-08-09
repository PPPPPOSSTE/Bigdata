package com.ftrue.day15collection.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName: CollectionDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/16 9:55
 * @Version: 1.0
 */
/**
 *
 * 回顾:
 *      数组:存储同一种数据类型多个元素的固定容器
 *
 *      集合:存储同一种数据类型多个元素的容器
 *
 * 集合框架:
 *      Collection集合接口(单列集合)
 *          List集合接口
 *              ArrayList集合类
 *              LinkedList集合类
 *              Vector集合类
 *          Set集合接口
 *              HashSet集合类
 *              LinkedHashSet集合类
 *              TreeSet集合
 *      Map集合接口(双列集合)
 *           HashMap集合类
 *           LinkedHashMap集合类
 *           TreeMap集合类
 *           Hashtable集合类
 *           Properties集合类
 *
 *
 * 集合框架和数组
 *      1.长度:
 *          数组:长度是不可改变
 *          集合:长度是可以改变的
 *      2.存储内容
 *          数组:既可以存储基本数据类型(例如:int[]),也可以存储引用数据类型(例如:Object[])
 *          集合:只可以存储引用数据类型
 *
 *
 * Collection接口
 *      接口的特点
 *          Collection接口是单列集合的顶级接口
 *      接口的位置
 *          java.util
 *      接口的方法
 *          boolean add(E e)
 *              确保此 collection 包含指定的元素（可选操作）。
 *          void clear()
 *              移除此 collection 中的所有元素（可选操作）。
 *          boolean contains(Object o)
 *              如果此 collection 包含指定的元素，则返回 true。
 *          boolean isEmpty()
 *              如果此 collection 不包含元素，则返回 true。
 *          Iterator<E> iterator()
 *              返回在此 collection 的元素上进行迭代的迭代器。
 *          boolean remove(Object o)
 *              从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）。
 *          int size()
 *              返回此 collection 中的元素数。
 *
 *
 * Collection集合接口的面试题:
 *      回顾多态的调用方法特点:先看父接口或父类中是否含有这个方法,如果有执行子类或者实现类重写,如果没有编译报错
 *      问题:
 *          通过输出语句打印集合多态形式的对象的时候,打印的不是内存地址值,打印对象名就是在调用toString(),
 *          先看Collection接口中是否有toString(),通过查看源码Collection接口中没有toString(),所以会编译报错,
 *          但是实际中并没有编译报错,为什么?
 *              在Java中所有的接口都继承Object类的接口形式(其实这个Object接口在Java中并不存在,而是在JVM通过C语言进行实现)
 *              Object类的接口形式:
 *                  有一个名为Object的接口,Object类中的所有实例方法在这个接口中都以抽象方法的形式进行存储
 *
 */

public class CollectionDemo01 {
    public static void main(String[] args) {
        //编译时报错：Type argument cannot be of primitive type
        //new ArrayList<int>();
        new ArrayList<Integer>();

        //使用多态创建集合对象
        Collection coll = new ArrayList();  //多态的弊端：无法使用实现类或者子类的特有成员

        //往集合中添加数据
        coll.add("abc");
        coll.add("def");
        coll.add(new String("zzz"));
        //int类型可以自动装箱为Integer类型,Integer类型向上转型为Object类型
        coll.add(123);
        coll.add(123);

        //打印集合对象
        //和引用数据类型数组打印时不同
        System.out.println(coll);  //coll是类的引用数据类型，会先toString
        System.out.println(coll.toString());
        System.out.println("============================");

        //判断集合中是否包含指定对象
        System.out.println(coll.contains("abc"));  //true
        System.out.println(coll.contains("atguigu"));  //false
        //注意：查询是否包含时，使用的是equals方法进行判定
        System.out.println(coll.contains("zzz"));  //true
        System.out.println("==============================");

        //删除集合中的指定单个对象。注意：即使有删除的对象有重复元素，一个remove()只能删除一个对象
        coll.remove(123);
        //coll.remove(123);
        System.out.println(coll);
        System.out.println("=================================");

        //查询集合的长度
        System.out.println(coll.size());
        System.out.println("=================================");

        //判断集合的长度是否为0
        System.out.println(coll.isEmpty());
        System.out.println("=================================");

        //清除集合中所有的元素
        coll.clear();
        System.out.println(coll.isEmpty());
        System.out.println("=================================");


        SuperInterface si = new SubClass();

        //编译提示报错：Cannot resolve method 'print' in 'SuperInterface'
        //si.print();  //父接口中没有，编译报错
        si.toString();  //编译没有报错，父接口中有Object类的接口形式的此方法

    }
}
