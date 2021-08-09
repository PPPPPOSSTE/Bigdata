package com.ftrue.day21test.reflect.demo04;

/**
 * @ClassName: Demo04Class
 * @Description:
 * @Author: zhiqi zhang on 2021/7/24 8:55
 * @Version: 1.0
 */
/**

  获取Class对象的四种方式:
       1.通过类名.class方式进行获取Class对象
       2.通过Object类的实例方法getClass()
       3.通过Class类的静态方法forName() (推荐)
       4.通过ClassLoader类加载器进行获取
 */
public class Demo04Class {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.通过类名.class方式进行获取Class对象
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        //2.通过Object类的实例方法getClass()
        Student s = new Student();
        Class<? extends Student> c2 = s.getClass();
        System.out.println(c2);

        //3.通过Class类的静态方法forName() 【推荐方式】
        Class<?> c3 = Class.forName("com.ftrue.day21test.reflect.demo04.Student");
        System.out.println(c3);

        //4.通过ClassLoader类加载器进行获取
        Class<?> c4 = ClassLoader.getSystemClassLoader().loadClass("com.ftrue.day21test.reflect.demo04.Student");
        System.out.println(c4);

    }
}
