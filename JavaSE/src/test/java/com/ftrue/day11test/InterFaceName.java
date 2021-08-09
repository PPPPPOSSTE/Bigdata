package com.ftrue.day11test;

/**
 * @ClassName: InterFaceName
 * @Description:
 * @Author: zhangzhiqi on 2021/7/5 19:33
 * @Version: 1.0
 */
public interface InterFaceName {
    //抽象方法的两种写法
    public abstract void method();
    //public void method();  //不写abstract的效果和上面一样

    //默认方法
    public default void method2() {
        //执行语句
    }

    //静态方法
    public static void method3() {
        //执行语句
    }

    //私有方法和私有静态方法
    //供接口中的默认方法和静态方法调用
    //jdk9及以后才支持的功能
    /*private void method4() {
        //执行语句
    }*/
}
