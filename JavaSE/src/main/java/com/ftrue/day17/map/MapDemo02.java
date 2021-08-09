package com.ftrue.day17.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName MapDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月19日 09时30分
 * @Version 1.0
 *
 * Map集合的遍历方式1:键找值
 *      1.获取Map集合键集
 *      2.遍历键集,通过每个key找到value
 */
public class MapDemo02 {
	public static void main(String[] args) {
		//使用多态的形式创建集合对象
		Map<String,String> map = new HashMap<>();

		//添加元素
		map.put("探险家","伊泽瑞尔");
		map.put("黑暗之女","安妮");
		map.put("蛮族之王","泰达米尔");
		map.put("寒冰射手","艾希");

		//1.获取Map集合键集
		Set<String> keys = map.keySet();

		//2.遍历键集,通过每个key找到value
		for (String key : keys) {
			String value = map.get(key);
			System.out.println(key + "=" + value);
		}
	}
}
