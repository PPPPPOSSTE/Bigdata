package com.ftrue.day21test.reflect.demo06;

import java.lang.reflect.Constructor;

/**
 * @ClassName: ClassDemo05
 * @Description:
 * @Author: zhiqi zhang on 2021/7/24 9:17
 * @Version: 1.0
 */
/**
 *
 * 通过反射使用有参构造器创建对象
 */
public class ClassDemo06 {
    public static void main(String[] args) throws Exception {
        //获取字节码文件对象
        Class<?> clazz = Class.forName("com.ftrue.day21test.reflect.demo06.Student");
        //获取有参的构造器对象
        Constructor<?> c = clazz.getDeclaredConstructor(String.class, int.class);
        //通过有参的构造器进行对象创建
        Object obj = c.newInstance("liuzong", 18);

        System.out.println(obj);
    }
}
