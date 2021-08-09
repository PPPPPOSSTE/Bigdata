package com.ftrue.day10test.demo09;

/**
 * @ClassName: ExtendsDemo09
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 11:33
 * @Version: 1.0
 */
/**
 * @ClassName ExtendsDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月09日 11时33分
 * @Version 1.0
 *
 * this关键字的第二种用法:
 *      应用场景:
 *          子类的构造器
 *      格式:
 *          this(实参)
 *      作用或者含义:
 *          当构造器无法进行初始化的时候,通过this(实参)将初始化工作外包给其它的构造器来完成
 *
 * super关键字的第二种用法:
 *      应用场景:
 *          子类的构造器
 *      格式:
 *          super(实参);
 *      作用或者含义:
 *          调用父类的对应构造器,在初始化子类成员之前,先完成父类成员的初始化
 *
 * this关键字和super关键字的注意事项:
 *      1.在静态方法和静态代码块无法使用this或者super关键字
 *      2.在子类的构造器中如果没有任何的this()或者super(),JVM自动提供一个默认无参的super(),
 *          负责调用父类的构造器,完成父类成员的初始化工作,一旦在子类的构造器中存在this()或者super(),
 *          JVM不再为其提供
 *      3.this(实参)和super(实参)必须在子类的构造器中第一行
 *      4.this(实参)和super(实参)在子类的构造器中不可以同时进行使用
 */
public class ExtendsDemo09 {
    public static void main(String[] args) {
        new SubClass();

        System.out.println("====================");

        new SubClass(1);
    }
}
