package com.ftrue.day11test.inter.demo02;

/**
 * @ClassName: SuperInterface
 * @Description:
 * @Author: zhiqi zhang on 2021/7/10 10:38
 * @Version: 1.0
 */
public interface SuperInterface {
    public default void method() {
        System.out.println("接口的默认方法");
    }
}
