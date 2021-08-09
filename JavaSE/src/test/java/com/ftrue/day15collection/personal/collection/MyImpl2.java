package com.ftrue.day15collection.personal.collection;

import com.ftrue.day15collection.personal.generic.MyGenericInterface;

/**
 * @ClassName: MyImpl2
 * @Description:
 * @Author: zhiqi zhang on 2021/7/15 23:28
 * @Version: 1.0
 */
//含有泛型的接口
//    2.始终不确定泛型的类型，知道创建对象时，确定泛型的类型
public class MyImpl2<E> implements MyGenericInterface<E> {

    @Override
    public void add(E e) {
        //省略......
    }

    @Override
    public E getE() {
        return null;
    }
}
