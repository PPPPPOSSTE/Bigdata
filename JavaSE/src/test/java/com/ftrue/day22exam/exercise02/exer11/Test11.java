package com.ftrue.day22exam.exercise02.exer11;

/**
 * @ClassName: Test10
 * @Description:
 * @Author: zhiqi zhang on 2021/7/24 21:54
 * @Version: 1.0
 */
//饿汉式单例模式
public class Test11 {
    private static final Test11 test11 = new Test11();

    private Test11() {
    }

    public static Test11 getTest11() {
        return test11;
    }
}
