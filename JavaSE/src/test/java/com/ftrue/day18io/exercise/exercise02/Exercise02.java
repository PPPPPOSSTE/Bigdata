package com.ftrue.day18io.exercise.exercise02;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/22 9:48
 * @Version: 1.0
 */
/*
 *
 * 第二题
        1、检查D盘的testIO文件夹下是否存在文件a.txt，如果不存在则创建该文件。
        2、获取D盘的testIO文件夹下的a.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台
        3、判断File file = new File("d:\testIO");是否文件,是文件则输出：xxx是一个文件，是否文件夹,是文件夹则输出：xxx是一个文件夹
        4、删除D盘的testIO文件夹下的a.txt文件
        5、删除当前项目下的testIO文件夹下的1.txt文件，然后删除testIO文件夹
 *
 *
 * */
public class Exercise02 {
    /*public static void main(String[] args) throws IOException {
        //method01();
        System.out.println("==========================");
        //method02();
        System.out.println("==========================");
        //method03();
        System.out.println("==========================");
        //method04();
        System.out.println("==========================");
        method05();
        System.out.println("==========================");
    }*/

    //1、检查D盘的testIO文件夹下是否存在文件a.txt，如果不存在则创建该文件。
    @Test
    public void method01() throws IOException {
        File file = new File("E:\\testIO\\a.txt");
        if (file.exists()) {
            System.out.println("E:\\testIO\\a.txt文件存在");
        } else {
            System.out.println("E:\\testIO\\a.txt文件不存在");
            if (file.createNewFile()) {
                System.out.println("E:\\testIO\\a.txt文件创建成功");
            } else {
                System.out.println("E:\\testIO\\a.txt文件创建失败");
            }
        }
    }

    //2、获取D盘的testIO文件夹下的a.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台
    @Test
    public void method02() throws IOException {
        File file = new File("E:\\testIO\\a.txt");
        String name = file.getName();
        long length = file.length();
        String absolutePath = file.getAbsolutePath();
        String parent = file.getParent();
        System.out.println("文件的文件名" + name);
        System.out.println("文件的大小" + length);
        System.out.println("文件的绝对路径" + absolutePath);
        System.out.println("文件的父路径" + parent);
    }

    //3、判断File file = new File("d:\testIO");是否文件,是文件则输出：xxx是一个文件，是否文件夹,是文件夹则输出：xxx是一个文件夹
    @Test
    public void method03() {
        File file = new File("E:\\testIO");
        if (file.isFile()) {
            System.out.println(file + "是一个文件");
        } else if (file.isDirectory()) {
            System.out.println(file + "是一个目录");
        }
    }

    //4、删除D盘的testIO文件夹下的a.txt文件
    @Test
    public void method04() throws IOException {
        File file = new File("E:\\testIO\\a.txt");
        file.delete();
    }

    //5、删除当前项目下的testIO文件夹下的1.txt文件，然后删除testIO文件夹
    @Test
    public void method05() throws IOException {
        File file = new File("E:\\testIO");
        //不能递归删除
        //file.delete();
        //file.deleteOnExit();
        method06(file);
    }

    private static void method06(File file) {
        if (file.isFile()) {
            file.delete();
            //file.deleteOnExit();  //此处不能使用此方法，因为它会等到JVM虚拟机停止前才开始删除，导致后面删除目录的代码无法成功删除目录
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                method06(file1);
            }
            file.delete();
        }
    }
}
