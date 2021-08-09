package com.ftrue.day10test.demo08;

/**
 * @ClassName: ExtendsDemo08
 * @Description:
 * @Author: zhiqi zhang on 2021/7/9 11:25
 * @Version: 1.0
 */
/**
 * 继承的特点5:构造器
 *      1.父类中的构造器不能被子类所继承
 *      2.在初始化子类成员之前,先初始化父类成员,原因:在子类的构造器中
 *          在子类的构造器中如果没有任何的this()或者super(),JVM自动提供一个默认无参的super(),
 *          负责调用父类的构造器,完成父类成员的初始化工作,一旦在子类的构造器中存在this()或者super(),
 *          JVM不再为其提供
 */
public class ExtendsDemo08 {
    public static void main(String[] args) {
        new SubClass();
    }
}
