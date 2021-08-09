package com.ftrue.day15collection.personal.generic;

/**
 * @ClassName: MyGenericMethod
 * @Description:
 * @Author: zhiqi zhang on 2021/7/15 22:12
 * @Version: 1.0
 */
public class MyGenericMethod {
    //编译提示错误：Cannot resolve symbol 'T'  Cannot resolve method 'getclass()'
    /*public void show(T t) {
        System.out.println(t.getclass());
    }*/

    //注意顺序
    public <T> T show2(T t) {
        return t;
    }
}
