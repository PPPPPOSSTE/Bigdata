package com.ftrue.day18io.utils;

/**
 * @ClassName: CloseDemo
 * @Description:
 * @Author: zhiqi zhang on 2021/7/21 0:09
 * @Version: 1.0
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * 关闭IO的规则
 *      1.如果存在多个IO流对象,遵循"先开后关,后开先关"
 *      2.讲解异常处理的时候,今后有资源关闭的代码需要写在finally代码块中
 */
public class CloseDemo {
    public static void main(String[] args)  {
        //method01();
        //method02();
        method03();
    }

    private static void method03() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //创建缓冲字节输入输出流对象
            bis = new BufferedInputStream(new FileInputStream("G:\\jdk.exe"));
            bos = new BufferedOutputStream(new FileOutputStream("G:\\copy.exe"));

            //文件的读写操作
        } catch (IOException e) {

        } finally {
            try {
                IOUtils.close(bos,bis);
            } catch (IOException e) {

            }
        }
    }

    private static void method02() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //创建文件字节输入输出流对象
            fis = new FileInputStream("G:\\jdk.exe");
            fos = new FileOutputStream("G:\\copy.exe");
            //创建缓冲字节输入输出流对象
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //文件的读写操作
        } catch (IOException e) {

        } finally {
            try {
                IOUtils.close(bos,bis);
            } catch (IOException e) {

            } finally {
                try {
                    IOUtils.close(fos,fis);
                } catch (IOException e) {

                }
            }
        }
    }

    private static void method01() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //创建文件字节输入输出流对象
            fis = new FileInputStream("G:\\jdk.exe");
            fos = new FileOutputStream("G:\\copy.exe");
            //创建缓冲字节输入输出流对象
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //文件的读写操作
        } catch (IOException e) {

        } finally {
            //关闭资源
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {

            } finally {
                try {
                    if (bis != null) {
                        bis.close();
                    }
                } catch (IOException e) {

                } finally {
                    try {
                        if (fos != null) {
                            fos.close();
                        }
                    } catch (IOException e) {

                    } finally {
                        try {
                            if (fis != null) {
                                fis.close();
                            }
                        } catch (IOException e) {

                        }
                    }
                }
            }
        }
    }
}
