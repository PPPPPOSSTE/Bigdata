package com.ftrue.day11.fin.demo04;

/**
 * @ClassName FinalDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月10日 08时57分
 * @Version 1.0
 *
 * 被final修饰的实例变量
 *      直接声明初始化
 *          在进行初始化的时候,JVM不会给该实例变量赋值默认值
 *      先定义后初始化
 *          需要在该实例变量所在的类中所有的构造器进行初始化
 *              如果多个构造器初始化的值相同,可以直接在构造器代码块中进行初始化
 *              如果多个构造器初始化的值不同,需要在所有的构造器分别进行初始化
 */
public class FinalDemo04 {
}
