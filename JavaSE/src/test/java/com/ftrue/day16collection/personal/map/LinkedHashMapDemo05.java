package com.ftrue.day16collection.personal.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: LinkedHashMapDemo05
 * @Description:
 * @Author: zhiqi zhang on 2021/7/16 23:29
 * @Version: 1.0
 */
public class LinkedHashMapDemo05 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<String,
                String>();

        map.put("邓超", "孙俪");
        map.put("鹿晗", "关晓彤");
        map.put("刘德华", "朱丽倩");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
