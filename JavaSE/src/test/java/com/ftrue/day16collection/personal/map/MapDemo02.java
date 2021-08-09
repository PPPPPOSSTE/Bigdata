package com.ftrue.day16collection.personal.map;

import java.util.HashMap;
import java.util.Set;

/**
 * @ClassName: MapDemo02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/16 21:17
 * @Version: 1.0
 */
public class MapDemo02 {
    public static void main(String[] args) {
        //创建Map对象
        HashMap<String, String> map = new HashMap<>();

        //添加元素到集合
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("邓超", "孙俪");

        //获取所有的键 获取键集
        Set<String> keys = map.keySet();
        for (String key : keys) {
            //key 就是键
            //获取对应值
            String value = map.get(key);
            System.out.println(key + "的CP是：" +value);
        }
    }
}
