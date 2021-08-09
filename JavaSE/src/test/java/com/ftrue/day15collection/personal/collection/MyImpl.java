package com.ftrue.day15collection.personal.collection;

import com.ftrue.day15collection.personal.generic.MyGenericInterface;

/**
 * @ClassName: MyImpl
 * @Description:
 * @Author: zhiqi zhang on 2021/7/15 23:25
 * @Version: 1.0
 */
//含有泛型的接口：
//    1.定义类时确定泛型的类型
public class MyImpl implements MyGenericInterface<String> {

    @Override
    public void add(String s) {
        //省略......
    }

    @Override
    public String getE() {
        return null;
    }
}
