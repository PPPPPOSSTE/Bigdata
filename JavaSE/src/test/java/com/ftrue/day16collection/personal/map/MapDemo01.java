package com.ftrue.day16collection.personal.map;

import java.util.HashMap;

/**
 * @ClassName: MapDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/16 21:09
 * @Version: 1.0
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //创建Map对象
        HashMap<String, String> map = new HashMap<>();

        //添加元素到集合
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        String put = map.put("邓超", "孙俪");
        System.out.println(put);  //null
        System.out.println(map);

        //String remove(String key)
        System.out.println(map.remove("邓超"));
        System.out.println(map);

        //想要查看黄晓明的媳妇是谁
        System.out.println(map.get("黄晓明"));
        System.out.println(map.get("邓超"));  //null
    }
}
