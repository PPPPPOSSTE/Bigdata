package com.ftrue.day18io.exercise.exercise06;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @ClassName: Exercise02
 * @Description:
 * @Author: zhiqi zhang on 2021/7/22 9:48
 * @Version: 1.0
 */
/*
 *
 * 第六题
       1、使用从键盘输入三句话，用PrintStream打印到一个words.txt文件中
       2、再用Scanner一行一行读取显示
 *
 * */
public class Exercise06 {
    public static void main(String[] args) throws IOException {
        //System.out.println(System.out);  //java.io.PrintStream@1b6d3586
        //System.out.println(System.in);  //java.io.BufferedInputStream@1b6d3586

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请键盘录入字符串：");
        String line1 = br.readLine();
        String line2 = br.readLine();
        String line3 = br.readLine();

        PrintStream printStream = new PrintStream(new FileOutputStream("words.txt"));
        System.setOut(printStream);
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);*/

        Scanner scanner = new Scanner(new FileInputStream("file\\words.txt"));
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());

        //关闭流对象资源
        //printStream.close();
        //br.close();
    }
}
