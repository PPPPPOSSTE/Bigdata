package com.ftrue.day15collection.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName: CollectionDemo04
 * @Description:
 * @Author: zhiqi zhang on 2021/7/16 11:49
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
 * =======================================================================
 * Demo02
 *
 * 单列集合的通用遍历方式1:迭代器
 *      迭代器思路:将集合中所有的元素存储在迭代器中,直接遍历迭代器对象即可
 *
 * Iterator接口
 *      接口的特点
 *          对 collection 进行遍历的迭代器。
 *      接口的位置
 *          java.util
 *      接口的方法
 *          boolean hasNext()
 *              如果仍有元素可以迭代，则返回 true
 *          E next()
 *              返回迭代的下一个元素。
 *          void remove()
 *              从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。
 *
 *
 * 使用迭代器遍历集合的步骤:
 *      1.通过集合对象获取迭代器对象
 *      2.因为不清楚迭代器到底遍历多少个元素,选择while循环
 *          循环条件语句:迭代器对象.hasNext()
 *      3.开启迭代每一个元素
 *
 *
 * 迭代器的特点:
 *      迭代器只能使用唯一的一次,如果想进行二次使用,需要重新获取迭代器对象
 *
 * ===================================================================================
 * Demo03
 *
 * 迭代器的注意事项:
 *      1.当迭代器中后续没有元素的时候,不能继续执行next(),否则会发生NoSuchElementException
 *      2.使用迭代器遍历集合中的元素时,在遍历的过程中不能针对集合的元素的个数有任何操作,否则会发生ConcurrentModificationException
 *
 * ========================================================================================
 * Demo04
 *
 * 因为迭代器中可能发生并发修改异常,在JDK5.0的版本针对迭代器对象的使用步骤进行简化,新增了增强for
 *
 * Collection集合通用的遍历方式2:增强for
 *      格式1:
 *          for (集合中元素的数据类型 对象名 : 集合名) {
 *              循环体语句
 *          }
 *
 *      注意:在增强for循环体语句中不能针对集合中元素的个数做任何修改,否则也会发生ConcurrentModificationException
 *
 *      格式2:
 *          增强for除了可以遍历集合,也可以遍历数组,在实际开发中,不推荐使用迭代器遍历数组
 *          for (数组中元素的数据类型 对象名 : 数组名) {
 *              循环体语句
 *          }
 *
 *      注意:
 *          当增强for遍历数组时,在JVM的底层将这个数组先转换成集合对象,在使用迭代器进行遍历,
 *          但是如果是基本数据类型数组,在过程中还要多一步,
 *          集合中无法存储基本数据类型,需要将基本数据类型自动装箱为包装类型
 *
 */
public class CollectionDemo04 {
    public static void main(String[] args) {
        //使用多态的形式创建集合对象
        Collection coll = new ArrayList();

        //添加元素
        coll.add("abc");
        coll.add("def");
        coll.add("ghi");

        for (Object obj : coll) {
            //在增强for循环中不能对集合的元素个数进行修改，否则会报运行时异常ConcurrentModificationException
            //coll.add(123);
            System.out.println(obj);
        }

        System.out.println("======================");

        int[] arr = {11, 22, 33};

        //在开发中不推荐使用增强for遍历数组
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
