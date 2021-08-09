package com.ftrue.day15collection.set;

import java.util.HashSet;

/**
 * @ClassName: SetDemo04
 * @Description:
 * @Author: zhiqi zhang on 2021/7/17 15:20
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
 *
 *
 *
 *
 */
public class SetDemo04 {
    public static void main(String[] args) {
        //创建存储学生对象的集合
        HashSet<Student> set = new HashSet<>();

        //创建学生对象
        Student s1 = new Student("古力娜扎", 18, 210625001);
        Student s2 = new Student("迪丽热巴", 18, 210625002);
        Student s3 = new Student("玛尔扎哈", 18, 210625003);
        Student s4 = new Student("玛尔扎哈", 18, 210625003);

        //添加学生对象
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }
}
