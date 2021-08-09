package com.ftrue.day15collection.personal.generic;

/**
 * @ClassName: MyGenericClass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/15 21:16
 * @Version: 1.0
 */
public class MyGenericClass<T> {
    //没有T类型，在这里代表未知的一种数据类型  未来传递什么就是什么类型
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
