package com.ftrue.day22exam.exercise01;

/**
 * @ClassName: Exercise0126
 * @Description:
 * @Author: zhiqi zhang on 2021/7/23 0:00
 * @Version: 1.0
 */
//26.	如下代码是否可以编译通过，如果可以，运行结果是什么？
//编译报错，有歧义
/*interface A {
    int x = 0;
}

class B {
    int x = 1;
}

public class Exercise0126 extends B implements A {
    public void printX() {
        //编译报错：Reference to 'x' is ambiguous, both 'B.x' and 'A.x' match
        System.out.println(x);
    }

    public static void main(String[] args) {
        new Exercise0126().printX();
    }

}*/
