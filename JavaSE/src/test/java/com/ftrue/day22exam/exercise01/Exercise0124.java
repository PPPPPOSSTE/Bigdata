package com.ftrue.day22exam.exercise01;

/**
 * @ClassName: Exercise0124
 * @Description:
 * @Author: zhiqi zhang on 2021/7/22 23:45
 * @Version: 1.0
 */
//24.	以下代码的运行结果是？
//-1
//3
public class Exercise0124 {
    static int x, y, z;

    static {
        int x = 5;
        x--;
    }

    static {
        x--;
    }

    public static void main(String[] args) {
        System.out.println("x=" + x);
        z--;
        method();
        System.out.println("result:" + (z + y + ++z));
    }

    public static void method() {
        y = z++ + ++z;
    }

}
