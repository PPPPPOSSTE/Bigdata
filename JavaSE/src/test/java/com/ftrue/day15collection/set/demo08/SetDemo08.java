package com.ftrue.day15collection.set.demo08;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @ClassName: SetDemo08
 * @Description:
 * @Author: zhiqi zhang on 2021/7/17 16:58
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
 * =======================================================================
 * Demo03
 *
 * HashSet类如何保证元素的唯一性?
 *      1.HashSet集合存储元素对象的时候和元素对象的内存地址值无关
 *      2.重写Object类的hashCode()
 *          在String类中的hashCode()中,为什么始终乘以31,而不是其他数字?
 *              a.这个数值不能太大,也不能太小
 *              b.这个数字必须是质数,减少哈希码重复概率
 *              通过测试人员进行数据测试,最终筛选出两个数值29和31
 *              c.29可以改写为2^5-3,31可以改写成2^5-1,考虑到31改写形式和整数取值范围的写法相似,最终选择31
 *      3.重写Object类的equals()
 *
 * ========================================================
 * Demo04
 *
 * =========================================================
 * Demo05
 *
 * LinkedHashSet类:
 *      1.LinkedHashSet类是HashSet类的子类
 *      2.LinkedHashSet类是有序的集合
 *          有序:存储元素的顺序和获取元素的顺序一样
 *      3.LinkedHashSet类底层的数据结构是哈希表 + 链表
 *          哈希表:存储元素
 *          链表:记录元素的存储顺序,保证元素在遍历时候有序性
 *      4.LinkedHashSet类可以存储null元素,获取的时候注意空指针异常
 *      5.LinkedHashSet类不是线程安全的,执行效率高,适合用于单线
 *
 * ==================================================================
 * Demo06
 *
 * TreeSet类
 *      类的特点
 *          1.TreeSet类底层数据结构是"红黑树"
 *          2.TreeSet类存储自定义类型的时候,必须给其实现比较器对象
 *              自然顺序Comparable<T>
 *              定制顺序Comparator
 *          3.TreeSet类不是线程安全的,线程执行效率高,适合单线程程序
 *          4.TreeSet类不可以存储null元素,存储之后直接发生空指针异常
 *      类的位置
 *          java.util
 *      类的构造器
 *          public TreeSet()
 *              构造一个新的空 set，该 set 根据其元素的自然顺序进行排序
 *      类的方法
 *
 * ==================================================================
 * Demo07
 *
 * 使用自然顺序存储自定义对象
 *      1.在自定义类型的类中实现Comparable接口
 *      2.重写接口中的compareTo()
 *
 * Comparable接口
 *      接口的特点
 *          此接口强行对实现它的每个类的对象进行整体排序。
 *      接口的位置
 *          java.lang
 *      接口的方法
 *          int compareTo(T o)
 *              比较此对象与指定对象的顺序。
 *
 * ==================================================================
 * Demo08
 *
 * 使用定制顺序完成存储自定义对象
 *      1.创建Comparator<T>实现类
 *      2.在实现类中重写compare(),完成比较规则
 *      3.在测试类中创建Comparator<T>实现类对象
 *      4.将实现类对象作为参数,创建TreeSet集合对象
 *
 */
public class SetDemo08 {
    public static void main(String[] args) {
        MyComparator myComparator = new MyComparator();

        //TreeSet<Student> set = new TreeSet<>(myComparator);
        TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getId() - s2.getId();
            }
        });

        Student s1 = new Student("张小芳", 18, 210625005);
        Student s2 = new Student("张小弛", 18, 210625002);
        Student s3 = new Student("安小妮", 18, 210625001);
        Student s4 = new Student("崔小荣", 18, 210625004);
        Student s5 = new Student("李小朦", 18, 210625003);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        System.out.println(set);
    }
}
