package com.ftrue.day15collection.personal.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName: GeneralDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/15 17:21
 * @Version: 1.0
 */
public class GenericDemo01 {
    public static void main(String[] args) {
        //Raw use of parameterized class 'ArrayList'
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add("123");
        coll.add(5);  //由于集合没有做任何限定，任何类型都可以给其中存放
        Iterator it = coll.iterator();
        while (it.hasNext()) {
            //需要打印每个字符串的长度，就要把迭代出来的对象转成String类型
            //Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
            //	at com.ftrue.day15test.personal.generic.GenericDemo01.main(GenericDemo01.java:23)
            String str = (String) it.next();
            //Object str = it.next();
            System.out.println(str.length());
        }
    }
}
