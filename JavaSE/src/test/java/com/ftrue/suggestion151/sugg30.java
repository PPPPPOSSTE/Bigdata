package com.ftrue.suggestion151;

import java.util.Random;

/**
 * @ClassName: sugg26
 * @Description:
 * @Author: zhangzhiqi on 2021/7/2 8:48
 * @Version: 1.0
 */
//建议30：不要随便设置随机种子



public class sugg30 {
    public static void main(String[] args) {
        /*Random r = new Random();
        for (int i = 0; i < 4; i++) {
            System.out.println(" 第 " + i + " 次：" + r.nextInt());
        }*/

        Random r = new Random(1000);
        for (int i = 0; i < 4; i++) {
            System.out.println(" 第 " + i + " 次：" + r.nextInt());
        }
    }
}
