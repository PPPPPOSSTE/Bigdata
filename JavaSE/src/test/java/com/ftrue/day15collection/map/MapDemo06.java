package com.ftrue.day15collection.map;

import java.util.TreeMap;

/**
 * @ClassName: MapDemo06
 * @Description:
 * @Author: zhiqi zhang on 2021/7/19 14:16
 * @Version: 1.0
 */
/**
 *
 * Map接口
 *      接口的特点
 *          1.Map集合以键和值的方式进行存储,每次存储是一对数据,一个key,一个value
 *          2.key和value是映射关系,是一一对应的
 *          3.key和value的数据类型可以是一致的,也可以不一致
 *          4.在Map集合中key的值不可以重复,value是可以重复的
 *      接口的位置
 *          java.util
 *      接口的方法
 *          V put(K key,V value)
 *              将指定的值与此映射中的指定键关联（可选操作）。
 *          V get(Object key)
 *              返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
 *          V remove(Object key)
 *              如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
 *          Set<K> keySet()
 *              返回此映射中包含的键的 Set 视图。
 *          Collection<V> values()
 *              返回此映射中包含的值的 Collection 视图。
 *          Set<Map.Entry<K,V>> entrySet()
 *              返回此映射中包含的映射关系的 Set 视图。
 *
 * ==============================================================================
 * Demo02
 *
 * Map集合的遍历方式1:键找值
 *      1.获取Map集合键集
 *      2.遍历键集,通过每个key找到value
 *
 * =================================================================================
 * Demo03
 *
 * Map集合的第二种遍历方式:键值对对象
 *
 * Entry接口
 *      接口的特点
 *          映射项（键-值对）。
 *      接口的位置
 *          java.util.Map.Entry
 *      接口的方法
 *          K getKey()
 *              返回与此项对应的键。
 *          V getValue()
 *              返回与此项对应的值。
 *
 * ==============================================================================================
 * Demo04
 *
 * HashMap类
 *      类的特点
 *          1.HashMap集合的底层数据结构是"哈希表"
 *              在JDK7.0(包含)以前:数组 + 链表
 *              在JDK8.0(包含)以后:数组 + 链表 或者 数组 + 红黑树
 *          2.HashMap集合可以存储null键和null值,进行获取的时候注意空指针异常
 *          3.HashMap集合无序的集合
 *              无序:存储元素的顺序和获取元素的顺序不一致
 *          4.HashMap集合无法保证元素在集合中的顺序永远不会改变
 *              原因:元素的索引位置和底层数组长度有关,当长度改变时,元素的索引就可能发生变化
 *          5.HashMap集合不是线程安全,执行效率高,适合单线程程序
 *      类的位置
 *          java.util
 *      类的构造器
 *          public HashMap()构造一个具有默认初始容量 (16) 和默认加载因子 (0.75) 的空 HashMap。
 *      类的方法
 *          见Map接口中的方法
 *
 *
 * HashMap集合的源码分析:存储过程
 *      1.名词解释
 *          桶:指代底层数组中的链表对象或者红黑树对象
 *          初始容量:创建HashMap实例的时候,底层数组的长度
 *          加载因子:底层数组扩容的标准(double)
 *              扩容标准 =(int)(数组长度 * 加载因子)
 *          初始容量如果设置过高,浪费内存资源
 *                 如果设置过低,频繁创建数组,浪费内存资源
 *          加载因子如果设置过高,又遍历数组又遍历链表,导致迭代效率低
 *                  如果设置过低,遍历的时候多遍历一些null,导致迭代效率低
 *          加载因子 (.75) 在时间和空间成本上寻求一种折衷
 *          初始容量 (16)  在时间和空间成本上寻求一种折衷
 *      2.变量和方法的备忘录
 *          成员变量和常量:
 *              DEFAULT_INITIAL_CAPACITY:默认初始容量
 *              MAXIMUM_CAPACITY:map集合存储理论最大元素数
 *              DEFAULT_LOAD_FACTOR:默认加载因子
 *              TREEIFY_THRESHOLD:链表结构转换成红黑树结构的标准之一
 *              UNTREEIFY_THRESHOLD:红黑树结构转换成链表结构的标准
 *              MIN_TREEIFY_CAPACITY:链表结构转换成红黑树结构的标准之一
 *              Node<K,V>[] table:底层数组
 *              Set<Map.Entry<K,V>> entrySet:存储键值对对象的Set集合
 *              threshold:底层数组的扩容标准
 *              loadFactor:加载因子
 *          =====================================================================
 *          putVal()的局部变量:
 *              Node<K,V>[] tab:临时的底层数组
 *              Node<K,V> p:待添加元素存储前索引位置上的链表对象或者红黑树对象
 *              int n:临时的底层数组长度
 *              int i:待添加元素底层数组的索引
 *              Node<K,V> e:待添加元素存储前索引位置上的链表对象或者红黑树对象的下一个对象
 *              K k:待添加元素存储前索引位置上的链表对象或者红黑树对象的key值
 *          =====================================================================
 *          resize()的局部变量:
 *              Node<K,V>[] oldTab:待扩容前的底层数组
 *              int oldCap:待扩容前底层数组的长度
 *              int oldThr:待扩容前底层数组的扩容标准
 *              int newCap:待扩容后底层数组的长度
 *              int newThr:待扩容后底层数组的扩容标准
 *          =====================================================================
 *          treeifyBin()的局部变量:
 *              int n:临时的底层数组长度
 *              int index
 *              Node<K,V> e;
 *
 *      3.HashMap底层数组的初始容量和初始加载因子
 *          初始容量和初始加载因子是多少取决于选择的构造器
 *          a.public HashMap(Map<? extends K,? extends V> m)
 *              初始容量:参数Map集合的长度
 *              初始加载因子:默认0.75
 *          b.public HashMap(int initialCapacity,float loadFactor)
 *              初始容量:自定义
 *              初始加载因子:自定义
 *          c.public HashMap(int initialCapacity)
 *              初始容量:自定义
 *              初始加载因子:默认0.75
 *          d.public HashMap()
 *              初始容量:null,当第一次添加元素的时候,初始长度为16
 *              初始加载因子:默认0.75
 *      4.如何确认元素在数组中的索引位置
 *          a.根据key重新计算hashCode(),计算规则:(h = key.hashCode()) ^ (h >>> 16),
 *              其实就是key的哈希码的二进制的高16位与低16位进行按位异或
 *              原因:官方测试,如果直接hashCode()进行索引计算的话,会导致在数组中某一索引位置上链表过长,
 *                  为了元素可以进一步趋近于均匀分布,需要重新计算hashCode
 *          b.将hash值和数组的长度进行按位与,得到的结果就是该元素的索引位置
 *      5.HashMap底层数组的扩容规则
 *          扩容标准:
 *              原来数组长度 << 1
 *      6.HashMap底层数组中存储链表结构开始树化标准
 *          a.链表的长度未达到8的时候
 *              直接在链表的后面追加对象
 *          b.链表的长度达到8的时候,但数组长度没有达到64
 *              进行数组扩容
 *          c.链表的长度达到8的时候,但数组长度也达到64
 *              进行链表结构和红黑树结构的转换
 *      7.HashMap底层数组中存储红黑树结构进行链表化标准
 *          当红黑树结构上面结点数据剩余6个的时候,进行链表的转换
 *      8.HashMap在JDK7.0和JDK8.0区别
 *          a.初始容量区别:
 *              JDK7.0(包含)以前:16
 *              JDK8.0(包含)以后:null,当第一次添加元素的时候,初始长度为16
 *          b.底层数组类型区别:
 *              JDK7.0(包含)以前:Entry<?,?>[]
 *              JDK8.0(包含)以后:Node<K,V>[]
 *          c.hash()计算方式区别:
 *              JDK7.0(包含)以前:
 *                  (1)h ^= k.hashCode();
 *                  (2)h ^= (h >>> 20) ^ (h >>> 12);
 *                  (3)h ^ (h >>> 7) ^ (h >>> 4)
 *              JDK8.0(包含)以后:
 *                  (h = key.hashCode()) ^ (h >>> 16),
 *          d.扩容规则区别
 *              JDK7.0(包含)以前:
 *                  2 * 原来数组长度
 *              JDK8.0(包含)以后:
 *                  原来数组长度 << 1
 *
 * ==============================================================================
 * Demo05
 *
 * LinkedHashMap类
 *      类的特点
 *          1.LinkedHashMap底层数据结构是哈希表+链表
 *              链表作用:维护元素的有序性
 *          2.LinkedHashMap是有序的集合
 *          3.LinkedHashMap可以存储null键和null值,使用时需要注意空指针异常
 *          4.LinkedHashMap不是线程安全的,执行效率高,适用于单线程程序
 *      类的位置
 *          java.util
 *      类的构造器
 *          public LinkedHashMap()
 *              构造一个带默认初始容量 (16) 和加载因子 (0.75) 的空插入顺序 LinkedHashMap 实例。
 *      类的方法
 *
 * =======================================================================================
 * Demo06
 *
 * TreeMap类
 *      类的特点
 *          1.TreeMap集合底层数据结构是红黑树
 *              当TreeMap集合存储自定义类型时需要给其指定比较器
 *          2.TreeMap集合不可以存储null键,可以存储null值,在使用的时候需要注意空指针异常
 *          3.TreeMap集合不是线程安全的,执行效率高,适用于单线程程序
 *      类的位置
 *          java.util
 *      类的构造器
 *          public TreeMap()
 *              使用键的自然顺序构造一个新的、空的树映射。
 *          public TreeMap(Comparator<? super K> comparator)
 *              构造一个新的、空的树映射，该映射根据给定比较器进行排序。
 *      类的方法
 *
 */
public class MapDemo06 {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();

        //NullPointerException
        //map.put(null, null);

        //值可以存储null，键不可以
        map.put("abc", null);

        System.out.println(map);
    }
}
