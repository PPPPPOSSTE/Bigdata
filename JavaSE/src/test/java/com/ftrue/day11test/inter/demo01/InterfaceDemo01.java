package com.ftrue.day11test.inter.demo01;

/**
 * @ClassName: InterfaceDemo01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/10 9:45
 * @Version: 1.0
 */
/*
*
*
*
* 接口的格式：
*   public interface 接口的名字 {
*       自定义常量
*       抽象方法
*       默认方法（JDK8.0）
*       静态方法（JDK8.0）
*       私有方法（JDK9.0）
*       内部接口（内部类之一，暂不了解）
*   }
*
*
* 接口的成员：自定义常量和抽象方法
*   []：表示可以省略
*       //自定义常量
*       [public] [abstract] [final] 数据类型 变量名;
*       //抽象方法
*       [public] [abstract] 数据类型 方法名(形参列表);
*
* 接口的使用步骤：
*   1.创建接口的实现类
*   2.重写接口中的抽象方法
*   3.在测试类中创建接口实现类对象完成需求
*
*
* */
public class InterfaceDemo01 {
    public static void main(String[] args) {
        //获取接口中的常量
        System.out.println(MyInterface.NUM);

        //创建接口的实现类对象
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.print("hello");
    }
}

























