package com.ftrue.day15collection.collection;

import java.util.Collection;

/**
 * @ClassName: MyList
 * @Description:
 * @Author: zhiqi zhang on 2021/7/16 14:31
 * @Version: 1.0
 */
public class MyList<A> {
    public void add(A a) {
    }

    public <E> E method(E e) {
        return null;
    }

    public <D> void method2(Collection<D> coll) {

    }

    //泛型通配符的使用
    //好处：简化方法method2的书写
    public void method3(Collection<?> coll) {

    }

    public void show(Collection<? extends ClassB> coll) {

    }

    public void change(Collection<? super ClassB> coll) {

    }
}
