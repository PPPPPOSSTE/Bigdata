package com.ftrue.day18io.exercise.exercise04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/22 9:48
 * @Version: 1.0
 */
/*
 *
 * 第四题
        把今天的作业文件夹day18_homework下的《我想对你说.txt》字符编码为GBK，复制到当前项目的testIO文件夹下的《沙老师的话.txt》字符编码为UTF-8
 *      E:\BigData0625\JavaSE\day18\homework\我想对你说.txt  1KB
 *
 * */
public class Exercise04 {
    public static void main(String[] args) throws IOException {
        //创建转换流对象  输入、输出
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\BigData0625\\JavaSE\\day18\\homework\\我想对你说.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("file\\testIO\\沙老师的话.txt"), "UTF-8");

        int len;
        char[] chars = new char[1024];  //8192
        while ((len = isr.read(chars)) != -1) {
            osw.write(chars, 0, len);
        }
        

        //关闭流对象资源
        osw.close();
        isr.close();
    }
}
