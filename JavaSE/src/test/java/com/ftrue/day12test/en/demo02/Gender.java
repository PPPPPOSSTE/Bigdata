package com.ftrue.day12test.en.demo02;

/**
 * @ClassName: Gender
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 13:43
 * @Version: 1.0
 */
public class Gender {
    //2.创建固定数量的对象,并用static进行修饰
    private static Gender boy = new Gender("李雷", 18);
    private static Gender girl = new Gender("韩梅梅", 18);
    private String name;
    private int age;

    //1.私有化构造器
    private Gender(String name, int age) {
        this.name = name;
        this.age = age;
    }


    //3.符合封装的思想,对固定数量的对象添加private进行修饰,并提供公共获取方式
    public static Gender getBoy() {
        return boy;
    }

    public static Gender getGirl() {
        return girl;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
