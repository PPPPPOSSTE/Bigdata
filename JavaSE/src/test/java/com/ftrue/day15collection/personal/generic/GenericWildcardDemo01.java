package com.ftrue.day15collection.personal.generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName: GenericWildcard
 * @Description:
 * @Author: zhiqi zhang on 2021/7/16 0:05
 * @Version: 1.0
 */
public class GenericWildcardDemo01 {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        getElement(list1);
        Collection<String> list2 = new ArrayList<>();
        getElement(list2);

    }

    //?代表可以接受任意类型
    public static void getElement(Collection<?> coll) {
    }

}
