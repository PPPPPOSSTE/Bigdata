package com.ftrue.day14test.exercise.exer05;


import java.util.Arrays;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/14 21:07
 * @Version: 1.0
 */
/*
 *
 * 第5题
 * 筛选字符串。
        定义数组，存入多个字符串。
        删除长度大于5的字符串，打印删除后的数组。
 *
 * */
public class Exercise05 {
    public static void main(String[] args) {
        String[] strArr = {"bca", "dadfa", "dddaaa", "你好啊", "我来啦，你干嘛呢", "别跑啊"};
        System.out.println("原字符串：\n" + Arrays.toString(strArr));

        //方法1
        /*int length = strArr.length;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() > 5) {
                strArr[i] = null;
                length--;
            }
        }

        String[] strArr2 = new String[length];

        int i = 0;
        for (String str : strArr) {
            if (!(str == null)) {
                strArr2[i] = str;
                i++;
            }
        }

        System.out.println("删除后：\n" + Arrays.toString(strArr2));*/

        //方法2：参考答案
        int index = 0;
        while (index < strArr.length) {
            if (strArr[index].length() > 5) {
                //这个方法有点绕，不推荐使用
                System.arraycopy(strArr, index + 1, strArr, index, strArr.length - index - 1);
                //返回原始数组的副本，被截断或用空填充以获得指定的长度
                strArr = Arrays.copyOf(strArr, strArr.length - 1);
            } else {
                index++;
            }
        }
        System.out.println("删除后：");
        System.out.println(Arrays.toString(strArr));

    }
}


//源字符串：
//[bca, dadfa, dddaaa, 你好啊, 我来啦，你干嘛呢, 别跑啊]
//删除后：
//[bca, dadfa, 你好啊, 别跑啊]