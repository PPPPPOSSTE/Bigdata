package com.ftrue.day15collection.set.demo08;

import java.util.Comparator;

/**
 * @ClassName: MyComparator
 * @Description:
 * @Author: zhiqi zhang on 2021/7/17 16:59
 * @Version: 1.0
 */
public class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getId() - s2.getId();
    }
}
