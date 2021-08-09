package com.ftrue.day18io.file;

/**
 * @ClassName: FileDemo02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/19 20:04
 * @Version: 1.0
 */

import java.io.File;

/**
 *
 * 需求:
 *      遍历JDK安装路径,将所有的文件及文件夹按照刚才的方式进行打印
 *          1474文件 + 132目录

 *
 */
public class FileDemo02 {
    public static void main(String[] args) {
        //获取指定File路径中当前文件夹的所有文件及文件夹
        File file = new File("D:\\Develop\\Java\\jdk1.8.0_202");

        print(file);
    }

    public static void print(File file) {
        if (file == null) {
            return;
        }

        File[] files = file.listFiles();
        for (File file1 : files) {
            /*if (file1.isDirectory()) {
                print(file1);
            }
            System.out.println(file1.getAbsolutePath());*/

            if (file1.isFile()) {
                System.out.println("文件：" + file1.getAbsolutePath());
            } else {
                System.out.println("目录" + file1.getAbsolutePath());
                print(file1);
            }
        }
    }
}
