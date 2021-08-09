package com.ftrue.day15collection.personal.generic;

import com.ftrue.day15collection.personal.collection.MyImpl2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName: GenericInterface
 * @Description:
 * @Author: zhiqi zhang on 2021/7/15 23:31
 * @Version: 1.0
 */
public class GenericInterface {
    public static void main(String[] args) {
        MyImpl2<String> my = new MyImpl2<>();
        my.add("aa");

        Collection list = new ArrayList();
    }
}
