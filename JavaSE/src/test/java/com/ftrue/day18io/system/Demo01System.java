package com.ftrue.day18io.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: Demo01System01
 * @Description:
 * @Author: zhiqi zhang on 2021/7/20 16:16
 * @Version: 1.0
 */
/**
 *
 * 标准流:
 *      标准输入流:System.in
 *      标准输出流:System.out
 *
 * 标准输入流:System.in
 *      第二种键盘录入方式
 */
//了解即可
public class Demo01System {
    public static void main(String[] args) throws IOException {
        //System.out.println(System.in);  //java.io.BufferedInputStream@1b6d3586
        //第二种键盘录入方式
        //各种类型的流的转换包装
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请键盘录入字符串");
        String s = br.readLine();
        System.out.println(s);

        //关闭资源
        br.close();
    }
}
