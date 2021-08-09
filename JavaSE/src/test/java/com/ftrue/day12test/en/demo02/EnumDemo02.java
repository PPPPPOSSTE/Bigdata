package com.ftrue.day12test.en.demo02;

/**
 * @ClassName: EnumDemo02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 11:55
 * @Version: 1.0
 */

/**
 *
 * 枚举的注意事项:
 *      1.当枚举类没有任何构造器的时候,JVM会分配一个private默认无参的构造器对象的初始化,
 *          一旦这个类有其他的构造器,JVM不再为提供
 *      2.当枚举类中的构造器权限什么都不写的时候,也不是"缺省",JVM自动给其补上private
 *      3.在枚举类中声明对象的那一行,必须在枚举类的第一行,否则编译报错;
 *      4.在枚举类中声明的对象,JVM自动给其补上public static final,手动添加"编译报错"
 *      5.在枚举类中如果通过无参构造器创建对象的话,对象名后面的()可以省略不写
 *      6.所有的枚举类通过单继承的方式隐式继承Enum类,枚举类不能再继承其他类,但是可以实现接口
 *          类的特点
 *              这是所有 Java 语言枚举类型的父类
 *          类的位置
 *              java.lang
 *          类的构造器
 *              无需使用构造器,通过自定义的枚举类继承Enum里面的方法
 *          类的方法
 *      7.所有的枚举类不能拥有子类
 *
 *
 */
public class EnumDemo02 {
    public static void main(String[] args) {
        /*Gender boy = Gender.getBoy();
		Gender girl = Gender.getGirl();
		System.out.println(boy.getName() + "=" + boy.getAge());
		System.out.println(girl.getName() + "=" + girl.getAge());*/

        Sex boy = Sex.boy;
        Sex girl = Sex.girl;

        System.out.println(boy.getName() + "=" + boy.getAge());
        System.out.println(girl.getName() + "=" + girl.getAge());

        System.out.println(boy);
    }
}
