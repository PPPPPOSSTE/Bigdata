package com.ftrue.day12test.exer.test02;

/**
 * @ClassName: Son
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 18:36
 * @Version: 1.0
 */
public class Son extends Father {
    int x = 30;
    public Son(){
        this.print();
        x = 40;
    }
    public void print(){
        System.out.println("Son.x = " + x);
    }
}
