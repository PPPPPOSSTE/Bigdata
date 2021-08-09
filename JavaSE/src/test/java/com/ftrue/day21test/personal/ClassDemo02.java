package com.ftrue.day21test.personal;

import org.junit.Test;

/**
 * @ClassName: ClassDemo02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/23 22:38
 * @Version: 1.0
 */
//获取Class对象的四种方式
public class ClassDemo02 {
    @Test
    public void test02() throws ClassNotFoundException {
        Class<String> stringClass = String.class;
        Class<? extends String> aClass = "".getClass();
        Class<?> aClass1 = Class.forName("java.lang.String");

        System.out.println(stringClass == aClass);  //true
        System.out.println(stringClass == aClass1);  //true
    }

    @Test
    public void test01() throws ClassNotFoundException {
        Class<ClassDemo02> c = ClassDemo02.class;
        ClassLoader classLoader = c.getClassLoader();
        System.out.println(c);

        Class<?> aClass = classLoader.loadClass("com.ftrue.day21test.personal.ClassDemo01");
        Class<ClassDemo01> classDemo01Class = ClassDemo01.class;
        System.out.println(aClass);
        System.out.println(classDemo01Class);
        System.out.println(aClass == classDemo01Class);  //true


    }
}
