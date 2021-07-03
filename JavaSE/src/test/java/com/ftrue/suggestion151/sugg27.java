package com.ftrue.suggestion151;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: sugg26
 * @Description:
 * @Author: zhangzhiqi on 2021/7/2 8:48
 * @Version: 1.0
 */
//建议27：谨慎包装类型的大小比较
//“==” 运算符
//  两对象(包含包装类型对象)直接用“==”进行比较时，比较的是引用对象的地址值
//“>”、“<” 运算符
//  包装类型对象比较的是值的大小，本质是自动拆箱（调用***Value()方法后的返回值）后的比较

//总结：包装类型的对象的比较应该使用方法（compareTo）来比较
public class sugg27 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer j = new Integer(100);
        compare(i, j);

        /*Integer i = new Integer(100);
        Integer j = new Integer(200);
        compare(i, j);*/

        /*Integer i = 200;
        Integer j = 100;
        compare(i, j);*/
    }

    //比较两个包装对象大小
    public static void compare(Integer i, Integer j) {
        System.out.println(i == j);  //Number objects are compared using '==', not 'equals()'
        System.out.println(i.equals(j));
        System.out.println(i > j);
        System.out.println(i.compareTo(j));
        System.out.println(i < j);
        System.out.println(j.compareTo(i));
    }
}
