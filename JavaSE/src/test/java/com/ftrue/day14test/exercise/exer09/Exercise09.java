package com.ftrue.day14test.exercise.exer09;


import com.ftrue.day14test.exercise.exer08.User;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第9题
 * 定义Handleable接口，具备一个处理字符串数字的抽象方法方法String handleString(String num);
        处理方式1：取整数部分。
        处理方式2：保留指定位小数，四舍五入。
 *
 * note: BigDecimal类 有多种四舍五入的模式可选择
 *  它的方法：public BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
 *  功能：四舍五入
 *
 * */
public class Exercise09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串数字：");

        String strNum = sc.next();
        System.out.println("strNum = " + strNum);

        int index = strNum.indexOf('.');
        System.out.println(index);

        String str01 = new Handleable() {
            @Override
            public String handleString(String num) {
                if(index != -1){
                    num = num.substring(0, index);
                }
                return num;
            }
        }.handleString(strNum);

        //方法1
        /*String str02 = new Handleable() {
            @Override
            public String handleString(String num) {
                char c1 = num.charAt(index + 5);
                char c2 = num.charAt(index + 4);
                if (c1 >= '5') {
                    String concat = num.substring(0, index + 4).concat(String.valueOf((char) (c2 + 1)));
                    return concat;
                }
                return num.substring(0, index + 5);
            }
        }.handleString(strNum);*/

        //方式2：参考答案
        String str02 = new Handleable() {
            @Override
            public String handleString(String num) {
                BigDecimal bigDeci = new BigDecimal(num);
                BigDecimal b = new BigDecimal(1);
                BigDecimal shang = bigDeci.divide(b, 4, BigDecimal.ROUND_HALF_UP);
                return shang.toString();
            }
        }.handleString(strNum);


        System.out.println("原数字：" + strNum);
        System.out.println("取整后：" + str01);
        System.out.println("原数字：" + strNum);
        System.out.println("保留4位小数，四舍五入后：" + str02);
    }
}


//测试案例
//23.23456789
//23
//23.2346

//23.23455789
//23
//23.2346

//23.23454789
//23
//23.2345
