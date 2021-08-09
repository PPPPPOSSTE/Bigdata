package com.ftrue.day21.reflect.demo01;

/**
 * @ClassName ReflectDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月23日 16时00分
 * @Version 1.0
 *
 * 类的生命周期:
 *      加载 ==> 使用 ==> 卸载
 *
 * 类加载过程:
 *      类的加载
 *          通过类加载器(ClassLoader)将字节码文件加载到内存(方法区)
 *      类的连接
 *          验证:验证字节码文件的合法性
 *          准备:
 *              准备合适内存区域(方法区)
 *              准备字节码文件对象(Class对象)
 *              准备静态区,加载静态变量给其进行赋初始值
 *          解析:
 *              把字节码中的符号引用替换为对应的直接地址引用
 *              举例:
 *                  Student s = new Student(); 0x666
 *                  s.study();
 *                  new Student(); 0x666
 *                  0x666.study();
 *      类的初始化
 *
 *
 */
public class ReflectDemo01 {
}
