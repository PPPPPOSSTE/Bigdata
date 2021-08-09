package com.ftrue.day12test.en.demo01;

/**
 * @ClassName: Gender
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 11:49
 * @Version: 1.0
 */
public class Gender {
    //2.创建固定数量的对象,并用static进行修饰
    private static Gender boy = new Gender();
    private static Gender girl = new Gender();


    //1.私有化构造器
    private Gender(){}


    //3.符合封装的思想,对固定数量的对象添加private进行修饰,并提供公共获取方式
    public static Gender getBoy() {
        return boy;
    }

    public static Gender getGirl() {
        return girl;
    }
}
