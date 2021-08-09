package com.ftrue.day18io.exercise.exercise03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/22 9:48
 * @Version: 1.0
 */
/*
 *
 * 第三题
        1、把老师的笔记文档，复制到当前项目的testIO文件夹下。  E:\BigData0625\JavaSE\day18\resources\视频1.mp4   583KB
        2、要求使用缓冲流和文件流一起实现
 *
 *
 * */
public class Exercise03 {
    public static void main(String[] args) throws IOException {
        //创建缓冲字节流对象  输入、输出
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\BigData0625\\JavaSE\\day18\\resources\\视频1.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file\\testIO\\视频1.mp4"));

        int len;
        byte[] bytes = new byte[1024];  //8192
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        //关闭流对象资源
        bos.close();
        bis.close();
    }
}
