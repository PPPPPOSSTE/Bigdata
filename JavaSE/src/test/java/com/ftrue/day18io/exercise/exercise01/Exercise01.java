package com.ftrue.day18io.exercise.exercise01;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: Exercise01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/22 9:12
 * @Version: 1.0
 */
/*
 *
 * 第一题
 *  1、使用绝对路径，在D盘下创建一个testIO文件夹，然后在testIO文件夹中创建一个1.txt文件
    2、使用相对路径，在当前项目下创建一个testIO文件夹，然后在testIO文件夹中创建一个1.txt文件
 *
 * */
public class Exercise01 {
    public static void main(String[] args) throws IOException {
        //method01();
        //method02();
        //method03();
        method04();
    }

    private static void method01() {
        File file = new File("E:\\testIO");
        //如果目录已存在，则返回false
        if (file.mkdir()) {
            System.out.println("testIO 目录创建成功");
        } else {
            System.out.println("testIO 目录创建失败");
        }
    }

    private static void method02() throws IOException {
        File file = new File("E:\\testIO\\1.txt");
        //如果目录已存在，则返回false
        if (file.createNewFile()) {
            System.out.println("1.txt 文件创建成功");
        } else {
            System.out.println("1.txt 文件创建失败");
        }
    }

    private static void method03() throws IOException {
        File file = new File("file\\testIO");
        //如果目录已存在，则返回false
        if (file.mkdir()) {
            System.out.println("testIO 目录创建成功");
        } else {
            System.out.println("testIO 目录创建失败");
        }
    }

    private static void method04() throws IOException {
        File file = new File("file\\testIO\\1.txt");
        //如果文件已存在，则返回false
        if (file.createNewFile()) {
            System.out.println("1.txt 文件创建成功");
        } else {
            System.out.println("1.txt 文件创建失败");
        }
    }
}
