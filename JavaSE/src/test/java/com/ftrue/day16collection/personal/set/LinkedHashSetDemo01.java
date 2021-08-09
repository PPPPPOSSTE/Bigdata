package com.ftrue.day16collection.personal.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @ClassName: LinkedHashSet
 * @Description:
 * @Author: zhiqi zhang on 2021/7/16 20:30
 * @Version: 1.0
 */
public class LinkedHashSetDemo01 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("bbb");
        set.add("bbc");
        set.add("aaa");
        set.add("abc");
        set.add("bbc");

        for (String str : set) {
            System.out.println(str);
        }
        System.out.println("==================");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
