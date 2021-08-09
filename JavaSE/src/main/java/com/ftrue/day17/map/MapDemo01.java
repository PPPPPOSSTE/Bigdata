package com.ftrue.day17.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName MapDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月19日 09时00分
 * @Version 1.0
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
 */
public class MapDemo01 {
	public static void main(String[] args) {
		//以多态的形式创建Map集合对象
		Map<String,String> map = new HashMap<>();

		//添加元素
		map.put("郭靖","华筝");
		map.put("杨过","小龙女");
		map.put("张无忌","敏敏特穆尔");
		map.put("郭靖","黄蓉");
		map.put("尹志平","小龙女");


		//打印集合
		System.out.println(map);

		//根据键获取值
		System.out.println(map.get("郭靖"));

		//根据键删除键值对
		map.remove("尹志平");
		System.out.println(map);

		System.out.println("===================================");

		//获取键的集合
		Set<String> keys = map.keySet();
		System.out.println(keys);

		//获取值的集合
		Collection<String> values = map.values();
		System.out.println(values);

		//获取键值对对象
		Set<Map.Entry<String, String>> objs = map.entrySet();
		System.out.println(objs);

	}
}
