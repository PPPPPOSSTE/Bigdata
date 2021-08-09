package com.ftrue.day16collection.personal.map;

import java.util.HashMap;
import java.util.Set;

/**
 * @ClassName: MapDemo04
 * @Description:
 * @Author: zhiqi zhang on 2021/7/16 23:03
 * @Version: 1.0
 */
public class HashMapDemo04 {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<Student, String> map = new HashMap<>();

        //添加元素
        map.put(new Student("lisi", 28), "上海");
        map.put(new Student("wangwu", 22), "北京");
        map.put(new Student("zhaoliu", 24), "成都");
        map.put(new Student("zhouqi", 25), "广州");
        map.put(new Student("wangwu", 22), "南京");

        //取出元素  键找值方式
        Set<Student> keySet = map.keySet();
        for (Student key : keySet) {
            String value = map.get(key);
            System.out.println(key.toString() + "......" + value);
        }
    }
}
