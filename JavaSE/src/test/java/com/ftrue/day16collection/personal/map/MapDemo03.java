package com.ftrue.day16collection.personal.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: MapDemo03
 * @Description:
 * @Author: zhiqi zhang on 2021/7/16 21:24
 * @Version: 1.0
 */
public class MapDemo03 {
    public static void main(String[] args) {
        //创建Map对象
        HashMap<String, String> map = new HashMap<>();

        //添加元素到集合
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("邓超", "孙俪");

        //获取所有的entry对象  entrySet
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        //遍历得到的每一个entry对象
        for (Map.Entry<String, String> entry : entrySet) {
            //解析
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "的CP是：" + value);
        }
    }

    //tips：Map集合不能直接使用迭代器或者foreach进行遍历。但是转成Set之后就可以使用了。
}
