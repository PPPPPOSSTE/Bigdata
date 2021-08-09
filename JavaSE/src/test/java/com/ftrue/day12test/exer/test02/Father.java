package com.ftrue.day12test.exer.test02;

/**
 * @ClassName: Father
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 18:36
 * @Version: 1.0
 */
public class Father {
    int x = 10;
    public Father(){
        this.print();
        x = 20;
    }
    public void print(){
        System.out.println("Father.x = " + x);
    }
}
