package com.ftrue.day18io.exercise.exercise07;

import java.io.File;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/22 9:48
 * @Version: 1.0
 */
/*
 *
 * 第七题
         案例：获取D盘atguigu文件夹下所有的.java文件
        （1）不包含子文件夹
        （2）包含子文件夹
 *
 *
 * */
public class Exercise07 {
    public static void main(String[] args) {
        File file = new File("file");
        //method01(file);
        method02(file);
    }

    //（1）不包含子文件夹
    private static void method01(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                String name = file1.getName();
                if (name.endsWith(".java")) {
                    System.out.println(name);
                }
            }
        }
    }

    //（2）包含子文件夹
    private static void method02(File file) {
        if (file.isFile()) {
            String name = file.getName();
            if (name.endsWith(".java")) {
                System.out.println(name);
            }
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                method02(file1);
            }
        }
    }
}
