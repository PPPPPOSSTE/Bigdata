package com.ftrue.day12test.init.demo03;

/**
 * @ClassName: SuperClass
 * @Description:
 * @Author: zhiqi zhang on 2021/7/12 14:35
 * @Version: 1.0
 */
public class SuperClass {
    int num = 10;

    public SuperClass() {
        //this.method();
        method();  //子类中有相同的方法时，当子类用到此父类的构造器时， 此时会产生隐式的多态
        System.out.println(this);
    }

    //子类中有相同的方法时，当子类用到此父类的构造器时， 此时会产生隐式的多态
    public void method() {
        System.out.println("num = " + num);
    }

    //子类中有相同的方法时，当子类用到此父类的构造器时， 此时会产生隐式的多态
    /*void method() {
        System.out.println("num = " + num);
    }*/

    //子类中有相同的方法时，当子类用到此父类的构造器时， 此时会产生隐式的多态
    /*protected void method() {
        System.out.println("num = " + num);
    }*/


    //与上面三种结果不一样。父类私有方法不会被子类重写，所以结果和上面的三种方式不一样。
    /*private void method() {
        System.out.println("num = " + num);
    }*/

}
