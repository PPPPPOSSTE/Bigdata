package com.ftrue.day21test.reflect.demo04;

/**
 * @ClassName: Student
 * @Description:
 * @Author: zhiqi zhang on 2021/7/24 8:56
 * @Version: 1.0
 */
/**
 *
 * 获取Class对象的四种方式:
 *      1.通过类名.class方式进行获取Class对象
 *      2.通过Object类的实例方法getClass()
 *      3.通过Class类的静态方法forName() (推荐)
 *      4.通过ClassLoader类加载器进行获取
 */
public class Student {
    private String name;
    private int age;
}
