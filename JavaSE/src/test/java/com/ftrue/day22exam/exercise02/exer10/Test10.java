package com.ftrue.day22exam.exercise02.exer10;

/**
 * @ClassName: Test10
 * @Description:
 * @Author: zhiqi zhang on 2021/7/24 21:54
 * @Version: 1.0
 */
//懒汉式单例模式（线程安全的）
//多线程处理同一数据资源是静态成员时，锁对象就是同一数据资源的类对象
public class Test10 {
    private static Test10 test10;

    private Test10() {
    }

    public static Test10 getTest10() {
        if (test10 == null) {
            synchronized (Test10.class) {
                if (test10 == null) {
                    test10 = new Test10();
                }
            }
        }

        return test10;
    }
}
