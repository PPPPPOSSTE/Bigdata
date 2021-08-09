package com.ftrue.day17.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName MapDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月19日 09时36分
 * @Version 1.0
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
 */
public class MapDemo03 {
	public static void main(String[] args) {
		//使用多态的形式创建集合对象
		Map<String,String> map = new HashMap<>();

		//添加元素
		map.put("探险家","伊泽瑞尔");
		map.put("黑暗之女","安妮");
		map.put("蛮族之王","泰达米尔");
		map.put("寒冰射手","艾希");

		//获取Map集合的键值对对象集合
		Set<Map.Entry<String, String>> objs = map.entrySet();

		//遍历Set集合
		for (Map.Entry<String, String> obj : objs) {
			String key = obj.getKey();
			String value = obj.getValue();
			System.out.println(key + "=" + value);
		}
	}
}
