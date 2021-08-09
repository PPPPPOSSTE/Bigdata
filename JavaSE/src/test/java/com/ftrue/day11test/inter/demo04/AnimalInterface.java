package com.ftrue.day11test.inter.demo04;

/**
 * @ClassName: AnimalInterface
 * @Description:
 * @Author: zhiqi zhang on 2021/7/10 11:12
 * @Version: 1.0
 */
public interface AnimalInterface {
    //因为动物吃的东西不同,需要所有的子类重写eat()
    public abstract void eat();

    //动物还拥有睡觉的功能,不需要所有的子类进行重写
    public default void sleep() {
        System.out.println("睡觉觉");
    }
}
