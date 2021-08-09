package com.ftrue.day22exam.exercise01;

/**
 * @ClassName: EXercise0123
 * @Description:
 * @Author: zhiqi zhang on 2021/7/22 23:41
 * @Version: 1.0
 */
//23.	以下代码的运行结果是？
//1 0 1
public class Exercise0123 {
    int a;
    int b;

    public void f() {
        a = 0;
        b = 0;
        int[] c = {0};
        g(b, c);
        System.out.println(a + " " + b + " " + c[0]);
    }

    public void g(int b, int[] c) {
        a = 1;
        b = 1;
        c[0] = 1;
    }

    public static void main(String[] args) {
        Exercise0123 t = new Exercise0123();
        t.f();
    }

}
