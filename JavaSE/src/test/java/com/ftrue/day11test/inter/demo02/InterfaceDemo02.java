package com.ftrue.day11test.inter.demo02;

import com.ftrue.day11test.inter.demo01.MyInterface;
import com.ftrue.day11test.inter.demo01.MyInterfaceImpl;

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
*       [public] [abstract] 返回值类型 方法名(形参列表);
*
* 接口的使用步骤：
*   1.创建接口的实现类
*   2.重写接口中的抽象方法
*   3.在测试类中创建接口实现类对象完成需求
*
*
* 默认方法（JDK8.0）：
*   在继承关系中，抽取多个子类相同的行为动作，且不要子类所重写的方法，将该方法再进行抽取存放在接口中，以默认方法的形式存在
*
* 默认方法的应用场景：
*   1.源码
*   2.笔试题
*
* 默认方法的格式：
*   [public] default 返回值类型 方法名(形参列表) {方法体};
*
*
* */
public class InterfaceDemo02 {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        subclass.method();
    }
}

























